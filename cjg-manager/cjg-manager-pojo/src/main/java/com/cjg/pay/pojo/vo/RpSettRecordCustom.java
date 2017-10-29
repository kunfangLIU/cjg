package com.cjg.pay.pojo.vo;

import com.cjg.pay.pojo.po.RpSettRecord;

/**
 * User: Administrator
 * Date: 2017/10/29
 * Time: 17:19
 * Version:V1.0
 * 查询别名实体类
 */
public class RpSettRecordCustom extends RpSettRecord{
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
