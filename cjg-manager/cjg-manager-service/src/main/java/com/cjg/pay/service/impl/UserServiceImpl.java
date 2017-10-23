package com.cjg.pay.service.impl;

import com.cjg.pay.dao.RpUserInfoCustomMapper;
import com.cjg.pay.dao.RpUserInfoMapper;
import com.cjg.pay.pojo.RpUserInfo;
import com.cjg.pay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * User: Administrator
 * Date: 2017/10/23
 * Time: 11:01
 * Version:V1.0
 */
@Service
public class UserServiceImpl implements UserService{
    //自动注入iuserdao 用于访问数据库
    @Autowired
    RpUserInfoMapper rpUserInfoMapper;
    @Autowired
    RpUserInfoCustomMapper rpUserInfoCustomMapper;


    @Override
    public RpUserInfo selectByUserName(RpUserInfo rpUserInfo) {
        return rpUserInfoCustomMapper.selectByUserName(rpUserInfo);
    }

    @Override
    public String checkUser(RpUserInfo rpUserInfo, HttpSession session) {
        String mess="";
        System.out.println("username="+rpUserInfo.getUserName()+"pwd:"+rpUserInfo.getPassword());

        if(rpUserInfo.getUserName() ==null || rpUserInfo.getPassword() ==null ||"".equals(rpUserInfo.getUserName())||"".equals(rpUserInfo.getPassword())){
            mess="3";
        }else {
           RpUserInfo findUser = this.selectByUserName(rpUserInfo);
            if(findUser!=null) {
                if(findUser.getPassword().equals(rpUserInfo.getPassword())){
                    session.setAttribute("sessionUser", findUser);
                    mess="1";
                }else {
                    mess="2";
                }
            }else {
                mess="2";
            }
        }
        System.out.println("imess"+mess);
        return mess;
    }

    @Override
    public String checkUserName(RpUserInfo rpUserInfo) {
        String mess = "";

        RpUserInfo findUser = this.selectByUserName(rpUserInfo);

        if (findUser!=null) {

            mess = "2";
        }else {
            mess = "1";
        }
        return mess;

    }

    public RpUserInfoMapper getRpUserInfoMapper() {
        return rpUserInfoMapper;
    }

    public void setRpUserInfoMapper(RpUserInfoMapper rpUserInfoMapper) {
        this.rpUserInfoMapper = rpUserInfoMapper;
    }

    public RpUserInfoCustomMapper getRpUserInfoCustomMapper() {
        return rpUserInfoCustomMapper;
    }

    public void setRpUserInfoCustomMapper(RpUserInfoCustomMapper rpUserInfoCustomMapper) {
        this.rpUserInfoCustomMapper = rpUserInfoCustomMapper;
    }
}

