package com.cjg.pay.web;

import com.cjg.pay.dto.Page;
import com.cjg.pay.dto.Result;
import com.cjg.pay.pojo.po.RpUserInfo;
import com.cjg.pay.pojo.vo.RpUserInfoCustom;
import com.cjg.pay.pojo.vo.RpUserInfoQuery;
import com.cjg.pay.service.RpUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: Administrator
 * Date: 2017/10/28
 * Time: 12:01
 * Version:V1.0
 * 用户列表控制层
 */
@Controller
@Scope("prototype")
public class RpUserInfoAction {
    @Autowired
    RpUserInfoService rpUserInfoService;

    @ResponseBody
    @RequestMapping(value = "/userInfo/{userInfoId}")
    public RpUserInfo getByUserInfoId(String userInfoId){
        return  rpUserInfoService.getByUserInfoId(userInfoId);
    }

    @ResponseBody
    @RequestMapping("/userInfos")
    public Result<RpUserInfoCustom> listUserInfos(Page page, RpUserInfoQuery query){
        return  rpUserInfoService.listUserInfos(page,query);
    }

}
