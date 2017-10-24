package com.cjg.pay.service;

import com.cjg.pay.pojo.po.RpUserInfo;

import javax.servlet.http.HttpSession;

/**
 * User: Administrator
 * Date: 2017/10/23
 * Time: 10:59
 * Version:V1.0
 * 用户实体类接口
 */
public interface UserService {
     RpUserInfo selectByUserName(RpUserInfo rpUserInfo);
     String checkUser(RpUserInfo rpUserInfo, HttpSession session);
     String checkUserName(RpUserInfo rpUserInfo);
}
