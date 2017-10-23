package com.cjg.pay.dao;

import com.cjg.pay.pojo.RpUserInfo;

/**
 * User: Administrator
 * Date: 2017/10/22
 * Time: 17:07
 * Version:V1.0
 */
public interface RpUserInfoCustomMapper {
     RpUserInfo selectByUserName(RpUserInfo  rpUserInfo);
}
