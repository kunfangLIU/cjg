package com.cjg.pay.pojo.po;

import java.math.BigDecimal;
import java.util.Date;

public class RpRefundRecord {
    private String id;

    private Integer version;

    private Date createTime;

    private String editor;

    private String creater;

    private Date editTime;

    private String orgMerchantOrderNo;

    private String orgTrxNo;

    private String orgBankOrderNo;

    private String orgBankTrxNo;

    private String merchantName;

    private String merchantNo;

    private String orgProductName;

    private String orgBizType;

    private String orgPaymentType;

    private BigDecimal refundAmount;

    private String refundTrxNo;

    private String refundOrderNo;

    private String bankRefundOrderNo;

    private String bankRefundTrxNo;

    private String resultNotifyUrl;

    private String refundStatus;

    private String refundFrom;

    private String refundWay;

    private Date refundRequestTime;

    private Date refundSuccessTime;

    private Date refundCompleteTime;

    private String requestApplyUserId;

    private String requestApplyUserName;

    private String refundReason;

    private String remark;

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

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getOrgMerchantOrderNo() {
        return orgMerchantOrderNo;
    }

    public void setOrgMerchantOrderNo(String orgMerchantOrderNo) {
        this.orgMerchantOrderNo = orgMerchantOrderNo == null ? null : orgMerchantOrderNo.trim();
    }

    public String getOrgTrxNo() {
        return orgTrxNo;
    }

    public void setOrgTrxNo(String orgTrxNo) {
        this.orgTrxNo = orgTrxNo == null ? null : orgTrxNo.trim();
    }

    public String getOrgBankOrderNo() {
        return orgBankOrderNo;
    }

    public void setOrgBankOrderNo(String orgBankOrderNo) {
        this.orgBankOrderNo = orgBankOrderNo == null ? null : orgBankOrderNo.trim();
    }

    public String getOrgBankTrxNo() {
        return orgBankTrxNo;
    }

    public void setOrgBankTrxNo(String orgBankTrxNo) {
        this.orgBankTrxNo = orgBankTrxNo == null ? null : orgBankTrxNo.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getOrgProductName() {
        return orgProductName;
    }

    public void setOrgProductName(String orgProductName) {
        this.orgProductName = orgProductName == null ? null : orgProductName.trim();
    }

    public String getOrgBizType() {
        return orgBizType;
    }

    public void setOrgBizType(String orgBizType) {
        this.orgBizType = orgBizType == null ? null : orgBizType.trim();
    }

    public String getOrgPaymentType() {
        return orgPaymentType;
    }

    public void setOrgPaymentType(String orgPaymentType) {
        this.orgPaymentType = orgPaymentType == null ? null : orgPaymentType.trim();
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundTrxNo() {
        return refundTrxNo;
    }

    public void setRefundTrxNo(String refundTrxNo) {
        this.refundTrxNo = refundTrxNo == null ? null : refundTrxNo.trim();
    }

    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo == null ? null : refundOrderNo.trim();
    }

    public String getBankRefundOrderNo() {
        return bankRefundOrderNo;
    }

    public void setBankRefundOrderNo(String bankRefundOrderNo) {
        this.bankRefundOrderNo = bankRefundOrderNo == null ? null : bankRefundOrderNo.trim();
    }

    public String getBankRefundTrxNo() {
        return bankRefundTrxNo;
    }

    public void setBankRefundTrxNo(String bankRefundTrxNo) {
        this.bankRefundTrxNo = bankRefundTrxNo == null ? null : bankRefundTrxNo.trim();
    }

    public String getResultNotifyUrl() {
        return resultNotifyUrl;
    }

    public void setResultNotifyUrl(String resultNotifyUrl) {
        this.resultNotifyUrl = resultNotifyUrl == null ? null : resultNotifyUrl.trim();
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    public String getRefundFrom() {
        return refundFrom;
    }

    public void setRefundFrom(String refundFrom) {
        this.refundFrom = refundFrom == null ? null : refundFrom.trim();
    }

    public String getRefundWay() {
        return refundWay;
    }

    public void setRefundWay(String refundWay) {
        this.refundWay = refundWay == null ? null : refundWay.trim();
    }

    public Date getRefundRequestTime() {
        return refundRequestTime;
    }

    public void setRefundRequestTime(Date refundRequestTime) {
        this.refundRequestTime = refundRequestTime;
    }

    public Date getRefundSuccessTime() {
        return refundSuccessTime;
    }

    public void setRefundSuccessTime(Date refundSuccessTime) {
        this.refundSuccessTime = refundSuccessTime;
    }

    public Date getRefundCompleteTime() {
        return refundCompleteTime;
    }

    public void setRefundCompleteTime(Date refundCompleteTime) {
        this.refundCompleteTime = refundCompleteTime;
    }

    public String getRequestApplyUserId() {
        return requestApplyUserId;
    }

    public void setRequestApplyUserId(String requestApplyUserId) {
        this.requestApplyUserId = requestApplyUserId == null ? null : requestApplyUserId.trim();
    }

    public String getRequestApplyUserName() {
        return requestApplyUserName;
    }

    public void setRequestApplyUserName(String requestApplyUserName) {
        this.requestApplyUserName = requestApplyUserName == null ? null : requestApplyUserName.trim();
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}