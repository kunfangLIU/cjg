package com.cjg.pay.dao;

import com.cjg.pay.pojo.po.RpUserInfo;

/**
 * User: Administrator
 * Date: 2017/10/22
 * Time: 17:07
 * Version:V1.0
 * 自定义用户登录dao层实体类接口
 */
public interface RpUserInfoCustomMapper {
     /**
      * 按名字查询用户
      * @param rpUserInfo
      * @return
      */
     RpUserInfo selectByUserName(RpUserInfo  rpUserInfo);

}
