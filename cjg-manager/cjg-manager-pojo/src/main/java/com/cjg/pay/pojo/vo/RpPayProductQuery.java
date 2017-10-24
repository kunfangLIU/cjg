package com.cjg.pay.pojo.vo;

/**
 * User: Administrator
 * Date: 2017/10/24
 * Time: 22:17
 * Version:V1.0
 * 商品实体类查询类
 */
public class RpPayProductQuery {
    private String title;
    private Byte status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
