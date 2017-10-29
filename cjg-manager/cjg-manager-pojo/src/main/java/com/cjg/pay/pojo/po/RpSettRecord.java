package com.cjg.pay.pojo.po;

import java.math.BigDecimal;
import java.util.Date;

public class RpSettRecord {
    private String id;//编号

    private Integer version;//版本号

    private Date createTime;//创建时间

    private Date editTime;//更新时间

    private String settMode;//结算发起方式

    private String accountNo;//账户编号

    private String userNo;//用户编号

    private String userName;//用户名

    private String userType;//用户类型

    private Date settDate;//结算日期

    private String bankCode;//银行编码

    private String bankName;//银行名称

    private String bankAccountName;//开户名

    private String bankAccountNo;//开户编号

    private String bankAccountType;//开户类型

    private String country;//开户所在国家

    private String province;//开户所在省份

    private String city;//开户所在城市

    private String areas;//开户所在地区

    private String bankAccountAddress;//银行全称

    private String mobileNo;//收款人手机号

    private BigDecimal settAmount;//结算金额

    private BigDecimal settFee;//结算手续费

    private BigDecimal remitAmount;//结算打款金额

    private String settStatus;//结算状态

    private Date remitConfirmTime;//打款确认时间

    private String remark;//描述

    private String remitRemark;//打款备注

    private String operatorLoginname;//操作员登录名

    private String operatorRealname;//操作员姓名

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getSettMode() {
        return settMode;
    }

    public void setSettMode(String settMode) {
        this.settMode = settMode == null ? null : settMode.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Date getSettDate() {
        return settDate;
    }

    public void setSettDate(Date settDate) {
        this.settDate = settDate;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName == null ? null : bankAccountName.trim();
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo == null ? null : bankAccountNo.trim();
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType == null ? null : bankAccountType.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas == null ? null : areas.trim();
    }

    public String getBankAccountAddress() {
        return bankAccountAddress;
    }

    public void setBankAccountAddress(String bankAccountAddress) {
        this.bankAccountAddress = bankAccountAddress == null ? null : bankAccountAddress.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public BigDecimal getSettAmount() {
        return settAmount;
    }

    public void setSettAmount(BigDecimal settAmount) {
        this.settAmount = settAmount;
    }

    public BigDecimal getSettFee() {
        return settFee;
    }

    public void setSettFee(BigDecimal settFee) {
        this.settFee = settFee;
    }

    public BigDecimal getRemitAmount() {
        return remitAmount;
    }

    public void setRemitAmount(BigDecimal remitAmount) {
        this.remitAmount = remitAmount;
    }

    public String getSettStatus() {
        return settStatus;
    }

    public void setSettStatus(String settStatus) {
        this.settStatus = settStatus == null ? null : settStatus.trim();
    }

    public Date getRemitConfirmTime() {
        return remitConfirmTime;
    }

    public void setRemitConfirmTime(Date remitConfirmTime) {
        this.remitConfirmTime = remitConfirmTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemitRemark() {
        return remitRemark;
    }

    public void setRemitRemark(String remitRemark) {
        this.remitRemark = remitRemark == null ? null : remitRemark.trim();
    }

    public String getOperatorLoginname() {
        return operatorLoginname;
    }

    public void setOperatorLoginname(String operatorLoginname) {
        this.operatorLoginname = operatorLoginname == null ? null : operatorLoginname.trim();
    }

    public String getOperatorRealname() {
        return operatorRealname;
    }

    public void setOperatorRealname(String operatorRealname) {
        this.operatorRealname = operatorRealname == null ? null : operatorRealname.trim();
    }
}