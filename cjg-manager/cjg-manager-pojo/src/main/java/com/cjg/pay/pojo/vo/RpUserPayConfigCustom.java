package com.cjg.pay.pojo.vo;

import com.cjg.pay.pojo.po.RpUserPayConfig;

/**
 * User: Administrator
 * Date: 2017/10/24
 * Time: 19:29
 * Version:V1.0
 * 产品对应于页面的实体类
 */
public class RpUserPayConfigCustom extends RpUserPayConfig {
    private String catName;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
