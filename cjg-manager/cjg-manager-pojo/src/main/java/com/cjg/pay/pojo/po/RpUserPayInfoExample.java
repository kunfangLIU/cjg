package com.cjg.pay.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RpUserPayInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RpUserPayInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id_ is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id_ is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id_ =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id_ <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id_ >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id_ >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id_ <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id_ <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id_ like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id_ not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id_ in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id_ not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id_ between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id_ not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNull() {
            addCriterion("edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNotNull() {
            addCriterion("edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEditTimeEqualTo(Date value) {
            addCriterion("edit_time =", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotEqualTo(Date value) {
            addCriterion("edit_time <>", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThan(Date value) {
            addCriterion("edit_time >", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edit_time >=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThan(Date value) {
            addCriterion("edit_time <", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("edit_time <=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIn(List<Date> values) {
            addCriterion("edit_time in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotIn(List<Date> values) {
            addCriterion("edit_time not in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeBetween(Date value1, Date value2) {
            addCriterion("edit_time between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("edit_time not between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppSectetIsNull() {
            addCriterion("app_sectet is null");
            return (Criteria) this;
        }

        public Criteria andAppSectetIsNotNull() {
            addCriterion("app_sectet is not null");
            return (Criteria) this;
        }

        public Criteria andAppSectetEqualTo(String value) {
            addCriterion("app_sectet =", value, "appSectet");
            return (Criteria) this;
        }

        public Criteria andAppSectetNotEqualTo(String value) {
            addCriterion("app_sectet <>", value, "appSectet");
            return (Criteria) this;
        }

        public Criteria andAppSectetGreaterThan(String value) {
            addCriterion("app_sectet >", value, "appSectet");
            return (Criteria) this;
        }

        public Criteria andAppSectetGreaterThanOrEqualTo(String value) {
            addCriterion("app_sectet >=", value, "appSectet");
            return (Criteria) this;
        }

        public Criteria andAppSectetLessThan(String value) {
            addCriterion("app_sectet <", value, "appSectet");
            return (Criteria) this;
        }

        public Criteria andAppSectetLessThanOrEqualTo(String value) {
            addCriterion("app_sectet <=", value, "appSectet");
            return (Criteria) this;
        }

        public Criteria andAppSectetLike(String value) {
            addCriterion("app_sectet like", value, "appSectet");
            return (Criteria) this;
        }

        public Criteria andAppSectetNotLike(String value) {
            addCriterion("app_sectet not like", value, "appSectet");
            return (Criteria) this;
        }

        public Criteria andAppSectetIn(List<String> values) {
            addCriterion("app_sectet in", values, "appSectet");
            return (Criteria) this;
        }

        public Criteria andAppSectetNotIn(List<String> values) {
            addCriterion("app_sectet not in", values, "appSectet");
            return (Criteria) this;
        }

        public Criteria andAppSectetBetween(String value1, String value2) {
            addCriterion("app_sectet between", value1, value2, "appSectet");
            return (Criteria) this;
        }

        public Criteria andAppSectetNotBetween(String value1, String value2) {
            addCriterion("app_sectet not between", value1, value2, "appSectet");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(String value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(String value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(String value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(String value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLike(String value) {
            addCriterion("merchant_id like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotLike(String value) {
            addCriterion("merchant_id not like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<String> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<String> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(String value1, String value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(String value1, String value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNull() {
            addCriterion("app_type is null");
            return (Criteria) this;
        }

        public Criteria andAppTypeIsNotNull() {
            addCriterion("app_type is not null");
            return (Criteria) this;
        }

        public Criteria andAppTypeEqualTo(String value) {
            addCriterion("app_type =", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotEqualTo(String value) {
            addCriterion("app_type <>", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThan(String value) {
            addCriterion("app_type >", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeGreaterThanOrEqualTo(String value) {
            addCriterion("app_type >=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThan(String value) {
            addCriterion("app_type <", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLessThanOrEqualTo(String value) {
            addCriterion("app_type <=", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeLike(String value) {
            addCriterion("app_type like", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotLike(String value) {
            addCriterion("app_type not like", value, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeIn(List<String> values) {
            addCriterion("app_type in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotIn(List<String> values) {
            addCriterion("app_type not in", values, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeBetween(String value1, String value2) {
            addCriterion("app_type between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andAppTypeNotBetween(String value1, String value2) {
            addCriterion("app_type not between", value1, value2, "appType");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("user_no is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("user_no is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("user_no =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("user_no <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("user_no >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("user_no >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("user_no <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("user_no <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("user_no like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("user_no not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("user_no in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("user_no not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("user_no between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("user_no not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyIsNull() {
            addCriterion("partner_key is null");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyIsNotNull() {
            addCriterion("partner_key is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyEqualTo(String value) {
            addCriterion("partner_key =", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyNotEqualTo(String value) {
            addCriterion("partner_key <>", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyGreaterThan(String value) {
            addCriterion("partner_key >", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyGreaterThanOrEqualTo(String value) {
            addCriterion("partner_key >=", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyLessThan(String value) {
            addCriterion("partner_key <", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyLessThanOrEqualTo(String value) {
            addCriterion("partner_key <=", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyLike(String value) {
            addCriterion("partner_key like", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyNotLike(String value) {
            addCriterion("partner_key not like", value, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyIn(List<String> values) {
            addCriterion("partner_key in", values, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyNotIn(List<String> values) {
            addCriterion("partner_key not in", values, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyBetween(String value1, String value2) {
            addCriterion("partner_key between", value1, value2, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPartnerKeyNotBetween(String value1, String value2) {
            addCriterion("partner_key not between", value1, value2, "partnerKey");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeIsNull() {
            addCriterion("pay_way_code is null");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeIsNotNull() {
            addCriterion("pay_way_code is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeEqualTo(String value) {
            addCriterion("pay_way_code =", value, "payWayCode");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeNotEqualTo(String value) {
            addCriterion("pay_way_code <>", value, "payWayCode");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeGreaterThan(String value) {
            addCriterion("pay_way_code >", value, "payWayCode");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way_code >=", value, "payWayCode");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeLessThan(String value) {
            addCriterion("pay_way_code <", value, "payWayCode");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeLessThanOrEqualTo(String value) {
            addCriterion("pay_way_code <=", value, "payWayCode");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeLike(String value) {
            addCriterion("pay_way_code like", value, "payWayCode");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeNotLike(String value) {
            addCriterion("pay_way_code not like", value, "payWayCode");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeIn(List<String> values) {
            addCriterion("pay_way_code in", values, "payWayCode");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeNotIn(List<String> values) {
            addCriterion("pay_way_code not in", values, "payWayCode");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeBetween(String value1, String value2) {
            addCriterion("pay_way_code between", value1, value2, "payWayCode");
            return (Criteria) this;
        }

        public Criteria andPayWayCodeNotBetween(String value1, String value2) {
            addCriterion("pay_way_code not between", value1, value2, "payWayCode");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIsNull() {
            addCriterion("pay_way_name is null");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIsNotNull() {
            addCriterion("pay_way_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayNameEqualTo(String value) {
            addCriterion("pay_way_name =", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotEqualTo(String value) {
            addCriterion("pay_way_name <>", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameGreaterThan(String value) {
            addCriterion("pay_way_name >", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way_name >=", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLessThan(String value) {
            addCriterion("pay_way_name <", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLessThanOrEqualTo(String value) {
            addCriterion("pay_way_name <=", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameLike(String value) {
            addCriterion("pay_way_name like", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotLike(String value) {
            addCriterion("pay_way_name not like", value, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameIn(List<String> values) {
            addCriterion("pay_way_name in", values, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotIn(List<String> values) {
            addCriterion("pay_way_name not in", values, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameBetween(String value1, String value2) {
            addCriterion("pay_way_name between", value1, value2, "payWayName");
            return (Criteria) this;
        }

        public Criteria andPayWayNameNotBetween(String value1, String value2) {
            addCriterion("pay_way_name not between", value1, value2, "payWayName");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdIsNull() {
            addCriterion("offline_app_id is null");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdIsNotNull() {
            addCriterion("offline_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdEqualTo(String value) {
            addCriterion("offline_app_id =", value, "offlineAppId");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdNotEqualTo(String value) {
            addCriterion("offline_app_id <>", value, "offlineAppId");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdGreaterThan(String value) {
            addCriterion("offline_app_id >", value, "offlineAppId");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("offline_app_id >=", value, "offlineAppId");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdLessThan(String value) {
            addCriterion("offline_app_id <", value, "offlineAppId");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdLessThanOrEqualTo(String value) {
            addCriterion("offline_app_id <=", value, "offlineAppId");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdLike(String value) {
            addCriterion("offline_app_id like", value, "offlineAppId");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdNotLike(String value) {
            addCriterion("offline_app_id not like", value, "offlineAppId");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdIn(List<String> values) {
            addCriterion("offline_app_id in", values, "offlineAppId");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdNotIn(List<String> values) {
            addCriterion("offline_app_id not in", values, "offlineAppId");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdBetween(String value1, String value2) {
            addCriterion("offline_app_id between", value1, value2, "offlineAppId");
            return (Criteria) this;
        }

        public Criteria andOfflineAppIdNotBetween(String value1, String value2) {
            addCriterion("offline_app_id not between", value1, value2, "offlineAppId");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyIsNull() {
            addCriterion("rsa_private_key is null");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyIsNotNull() {
            addCriterion("rsa_private_key is not null");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyEqualTo(String value) {
            addCriterion("rsa_private_key =", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyNotEqualTo(String value) {
            addCriterion("rsa_private_key <>", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyGreaterThan(String value) {
            addCriterion("rsa_private_key >", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyGreaterThanOrEqualTo(String value) {
            addCriterion("rsa_private_key >=", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyLessThan(String value) {
            addCriterion("rsa_private_key <", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyLessThanOrEqualTo(String value) {
            addCriterion("rsa_private_key <=", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyLike(String value) {
            addCriterion("rsa_private_key like", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyNotLike(String value) {
            addCriterion("rsa_private_key not like", value, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyIn(List<String> values) {
            addCriterion("rsa_private_key in", values, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyNotIn(List<String> values) {
            addCriterion("rsa_private_key not in", values, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyBetween(String value1, String value2) {
            addCriterion("rsa_private_key between", value1, value2, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPrivateKeyNotBetween(String value1, String value2) {
            addCriterion("rsa_private_key not between", value1, value2, "rsaPrivateKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyIsNull() {
            addCriterion("rsa_public_key is null");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyIsNotNull() {
            addCriterion("rsa_public_key is not null");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyEqualTo(String value) {
            addCriterion("rsa_public_key =", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyNotEqualTo(String value) {
            addCriterion("rsa_public_key <>", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyGreaterThan(String value) {
            addCriterion("rsa_public_key >", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("rsa_public_key >=", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyLessThan(String value) {
            addCriterion("rsa_public_key <", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyLessThanOrEqualTo(String value) {
            addCriterion("rsa_public_key <=", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyLike(String value) {
            addCriterion("rsa_public_key like", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyNotLike(String value) {
            addCriterion("rsa_public_key not like", value, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyIn(List<String> values) {
            addCriterion("rsa_public_key in", values, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyNotIn(List<String> values) {
            addCriterion("rsa_public_key not in", values, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyBetween(String value1, String value2) {
            addCriterion("rsa_public_key between", value1, value2, "rsaPublicKey");
            return (Criteria) this;
        }

        public Criteria andRsaPublicKeyNotBetween(String value1, String value2) {
            addCriterion("rsa_public_key not between", value1, value2, "rsaPublicKey");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}