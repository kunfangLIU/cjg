package com.cjg.pay.pojo.vo;

/**
 * User: Administrator
 * Date: 2017/10/24
 * Time: 22:17
 * Version:V1.0
 * 商品实体类查询类
 */
public class RpPayProductQuery {
    private String productName;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
