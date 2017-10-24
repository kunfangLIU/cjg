package com.cjg.pay.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RpUserPayConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RpUserPayConfigExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettIsNull() {
            addCriterion("is_auto_sett is null");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettIsNotNull() {
            addCriterion("is_auto_sett is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettEqualTo(String value) {
            addCriterion("is_auto_sett =", value, "isAutoSett");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettNotEqualTo(String value) {
            addCriterion("is_auto_sett <>", value, "isAutoSett");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettGreaterThan(String value) {
            addCriterion("is_auto_sett >", value, "isAutoSett");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettGreaterThanOrEqualTo(String value) {
            addCriterion("is_auto_sett >=", value, "isAutoSett");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettLessThan(String value) {
            addCriterion("is_auto_sett <", value, "isAutoSett");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettLessThanOrEqualTo(String value) {
            addCriterion("is_auto_sett <=", value, "isAutoSett");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettLike(String value) {
            addCriterion("is_auto_sett like", value, "isAutoSett");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettNotLike(String value) {
            addCriterion("is_auto_sett not like", value, "isAutoSett");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettIn(List<String> values) {
            addCriterion("is_auto_sett in", values, "isAutoSett");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettNotIn(List<String> values) {
            addCriterion("is_auto_sett not in", values, "isAutoSett");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettBetween(String value1, String value2) {
            addCriterion("is_auto_sett between", value1, value2, "isAutoSett");
            return (Criteria) this;
        }

        public Criteria andIsAutoSettNotBetween(String value1, String value2) {
            addCriterion("is_auto_sett not between", value1, value2, "isAutoSett");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
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

        public Criteria andRiskDayIsNull() {
            addCriterion("risk_day is null");
            return (Criteria) this;
        }

        public Criteria andRiskDayIsNotNull() {
            addCriterion("risk_day is not null");
            return (Criteria) this;
        }

        public Criteria andRiskDayEqualTo(Integer value) {
            addCriterion("risk_day =", value, "riskDay");
            return (Criteria) this;
        }

        public Criteria andRiskDayNotEqualTo(Integer value) {
            addCriterion("risk_day <>", value, "riskDay");
            return (Criteria) this;
        }

        public Criteria andRiskDayGreaterThan(Integer value) {
            addCriterion("risk_day >", value, "riskDay");
            return (Criteria) this;
        }

        public Criteria andRiskDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("risk_day >=", value, "riskDay");
            return (Criteria) this;
        }

        public Criteria andRiskDayLessThan(Integer value) {
            addCriterion("risk_day <", value, "riskDay");
            return (Criteria) this;
        }

        public Criteria andRiskDayLessThanOrEqualTo(Integer value) {
            addCriterion("risk_day <=", value, "riskDay");
            return (Criteria) this;
        }

        public Criteria andRiskDayIn(List<Integer> values) {
            addCriterion("risk_day in", values, "riskDay");
            return (Criteria) this;
        }

        public Criteria andRiskDayNotIn(List<Integer> values) {
            addCriterion("risk_day not in", values, "riskDay");
            return (Criteria) this;
        }

        public Criteria andRiskDayBetween(Integer value1, Integer value2) {
            addCriterion("risk_day between", value1, value2, "riskDay");
            return (Criteria) this;
        }

        public Criteria andRiskDayNotBetween(Integer value1, Integer value2) {
            addCriterion("risk_day not between", value1, value2, "riskDay");
            return (Criteria) this;
        }

        public Criteria andPayKeyIsNull() {
            addCriterion("pay_key is null");
            return (Criteria) this;
        }

        public Criteria andPayKeyIsNotNull() {
            addCriterion("pay_key is not null");
            return (Criteria) this;
        }

        public Criteria andPayKeyEqualTo(String value) {
            addCriterion("pay_key =", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyNotEqualTo(String value) {
            addCriterion("pay_key <>", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyGreaterThan(String value) {
            addCriterion("pay_key >", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyGreaterThanOrEqualTo(String value) {
            addCriterion("pay_key >=", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyLessThan(String value) {
            addCriterion("pay_key <", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyLessThanOrEqualTo(String value) {
            addCriterion("pay_key <=", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyLike(String value) {
            addCriterion("pay_key like", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyNotLike(String value) {
            addCriterion("pay_key not like", value, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyIn(List<String> values) {
            addCriterion("pay_key in", values, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyNotIn(List<String> values) {
            addCriterion("pay_key not in", values, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyBetween(String value1, String value2) {
            addCriterion("pay_key between", value1, value2, "payKey");
            return (Criteria) this;
        }

        public Criteria andPayKeyNotBetween(String value1, String value2) {
            addCriterion("pay_key not between", value1, value2, "payKey");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeIsNull() {
            addCriterion("fund_into_type is null");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeIsNotNull() {
            addCriterion("fund_into_type is not null");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeEqualTo(String value) {
            addCriterion("fund_into_type =", value, "fundIntoType");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeNotEqualTo(String value) {
            addCriterion("fund_into_type <>", value, "fundIntoType");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeGreaterThan(String value) {
            addCriterion("fund_into_type >", value, "fundIntoType");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_into_type >=", value, "fundIntoType");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeLessThan(String value) {
            addCriterion("fund_into_type <", value, "fundIntoType");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeLessThanOrEqualTo(String value) {
            addCriterion("fund_into_type <=", value, "fundIntoType");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeLike(String value) {
            addCriterion("fund_into_type like", value, "fundIntoType");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeNotLike(String value) {
            addCriterion("fund_into_type not like", value, "fundIntoType");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeIn(List<String> values) {
            addCriterion("fund_into_type in", values, "fundIntoType");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeNotIn(List<String> values) {
            addCriterion("fund_into_type not in", values, "fundIntoType");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeBetween(String value1, String value2) {
            addCriterion("fund_into_type between", value1, value2, "fundIntoType");
            return (Criteria) this;
        }

        public Criteria andFundIntoTypeNotBetween(String value1, String value2) {
            addCriterion("fund_into_type not between", value1, value2, "fundIntoType");
            return (Criteria) this;
        }

        public Criteria andPaySecretIsNull() {
            addCriterion("pay_secret is null");
            return (Criteria) this;
        }

        public Criteria andPaySecretIsNotNull() {
            addCriterion("pay_secret is not null");
            return (Criteria) this;
        }

        public Criteria andPaySecretEqualTo(String value) {
            addCriterion("pay_secret =", value, "paySecret");
            return (Criteria) this;
        }

        public Criteria andPaySecretNotEqualTo(String value) {
            addCriterion("pay_secret <>", value, "paySecret");
            return (Criteria) this;
        }

        public Criteria andPaySecretGreaterThan(String value) {
            addCriterion("pay_secret >", value, "paySecret");
            return (Criteria) this;
        }

        public Criteria andPaySecretGreaterThanOrEqualTo(String value) {
            addCriterion("pay_secret >=", value, "paySecret");
            return (Criteria) this;
        }

        public Criteria andPaySecretLessThan(String value) {
            addCriterion("pay_secret <", value, "paySecret");
            return (Criteria) this;
        }

        public Criteria andPaySecretLessThanOrEqualTo(String value) {
            addCriterion("pay_secret <=", value, "paySecret");
            return (Criteria) this;
        }

        public Criteria andPaySecretLike(String value) {
            addCriterion("pay_secret like", value, "paySecret");
            return (Criteria) this;
        }

        public Criteria andPaySecretNotLike(String value) {
            addCriterion("pay_secret not like", value, "paySecret");
            return (Criteria) this;
        }

        public Criteria andPaySecretIn(List<String> values) {
            addCriterion("pay_secret in", values, "paySecret");
            return (Criteria) this;
        }

        public Criteria andPaySecretNotIn(List<String> values) {
            addCriterion("pay_secret not in", values, "paySecret");
            return (Criteria) this;
        }

        public Criteria andPaySecretBetween(String value1, String value2) {
            addCriterion("pay_secret between", value1, value2, "paySecret");
            return (Criteria) this;
        }

        public Criteria andPaySecretNotBetween(String value1, String value2) {
            addCriterion("pay_secret not between", value1, value2, "paySecret");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingIsNull() {
            addCriterion("security_rating is null");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingIsNotNull() {
            addCriterion("security_rating is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingEqualTo(String value) {
            addCriterion("security_rating =", value, "securityRating");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingNotEqualTo(String value) {
            addCriterion("security_rating <>", value, "securityRating");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingGreaterThan(String value) {
            addCriterion("security_rating >", value, "securityRating");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingGreaterThanOrEqualTo(String value) {
            addCriterion("security_rating >=", value, "securityRating");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingLessThan(String value) {
            addCriterion("security_rating <", value, "securityRating");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingLessThanOrEqualTo(String value) {
            addCriterion("security_rating <=", value, "securityRating");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingLike(String value) {
            addCriterion("security_rating like", value, "securityRating");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingNotLike(String value) {
            addCriterion("security_rating not like", value, "securityRating");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingIn(List<String> values) {
            addCriterion("security_rating in", values, "securityRating");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingNotIn(List<String> values) {
            addCriterion("security_rating not in", values, "securityRating");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingBetween(String value1, String value2) {
            addCriterion("security_rating between", value1, value2, "securityRating");
            return (Criteria) this;
        }

        public Criteria andSecurityRatingNotBetween(String value1, String value2) {
            addCriterion("security_rating not between", value1, value2, "securityRating");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpIsNull() {
            addCriterion("merchant_server_ip is null");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpIsNotNull() {
            addCriterion("merchant_server_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpEqualTo(String value) {
            addCriterion("merchant_server_ip =", value, "merchantServerIp");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpNotEqualTo(String value) {
            addCriterion("merchant_server_ip <>", value, "merchantServerIp");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpGreaterThan(String value) {
            addCriterion("merchant_server_ip >", value, "merchantServerIp");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_server_ip >=", value, "merchantServerIp");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpLessThan(String value) {
            addCriterion("merchant_server_ip <", value, "merchantServerIp");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpLessThanOrEqualTo(String value) {
            addCriterion("merchant_server_ip <=", value, "merchantServerIp");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpLike(String value) {
            addCriterion("merchant_server_ip like", value, "merchantServerIp");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpNotLike(String value) {
            addCriterion("merchant_server_ip not like", value, "merchantServerIp");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpIn(List<String> values) {
            addCriterion("merchant_server_ip in", values, "merchantServerIp");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpNotIn(List<String> values) {
            addCriterion("merchant_server_ip not in", values, "merchantServerIp");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpBetween(String value1, String value2) {
            addCriterion("merchant_server_ip between", value1, value2, "merchantServerIp");
            return (Criteria) this;
        }

        public Criteria andMerchantServerIpNotBetween(String value1, String value2) {
            addCriterion("merchant_server_ip not between", value1, value2, "merchantServerIp");
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