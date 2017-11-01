package com.cjg.pay.pojo.vo;

import com.cjg.pay.pojo.po.RpPayProduct;

/**
 * User: Administrator
 * Date: 2017/10/24
 * Time: 19:29
 * Version:V1.0
 * 产品对应于页面的实体类
 */
public class RpPayProductCustom extends RpPayProduct {
    private String payWayCode;

    public String getPayWayCode() {
        return payWayCode;
    }

    public void setPayWayCode(String payWayCode) {
        this.payWayCode = payWayCode;
    }
}
