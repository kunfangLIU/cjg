package com.cjg.pay.pojo.vo;

import com.cjg.pay.pojo.po.RpAccount;

/**
 * User: Administrator
 * Date: 2017/10/24
 * Time: 19:29
 * Version:V1.0
 * 产品对应于页面的实体类
 */
public class RpAccountCustom extends RpAccount {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
