package com.cjg.pay.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RpSettRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RpSettRecordExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
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

        public Criteria andSettModeIsNull() {
            addCriterion("sett_mode is null");
            return (Criteria) this;
        }

        public Criteria andSettModeIsNotNull() {
            addCriterion("sett_mode is not null");
            return (Criteria) this;
        }

        public Criteria andSettModeEqualTo(String value) {
            addCriterion("sett_mode =", value, "settMode");
            return (Criteria) this;
        }

        public Criteria andSettModeNotEqualTo(String value) {
            addCriterion("sett_mode <>", value, "settMode");
            return (Criteria) this;
        }

        public Criteria andSettModeGreaterThan(String value) {
            addCriterion("sett_mode >", value, "settMode");
            return (Criteria) this;
        }

        public Criteria andSettModeGreaterThanOrEqualTo(String value) {
            addCriterion("sett_mode >=", value, "settMode");
            return (Criteria) this;
        }

        public Criteria andSettModeLessThan(String value) {
            addCriterion("sett_mode <", value, "settMode");
            return (Criteria) this;
        }

        public Criteria andSettModeLessThanOrEqualTo(String value) {
            addCriterion("sett_mode <=", value, "settMode");
            return (Criteria) this;
        }

        public Criteria andSettModeLike(String value) {
            addCriterion("sett_mode like", value, "settMode");
            return (Criteria) this;
        }

        public Criteria andSettModeNotLike(String value) {
            addCriterion("sett_mode not like", value, "settMode");
            return (Criteria) this;
        }

        public Criteria andSettModeIn(List<String> values) {
            addCriterion("sett_mode in", values, "settMode");
            return (Criteria) this;
        }

        public Criteria andSettModeNotIn(List<String> values) {
            addCriterion("sett_mode not in", values, "settMode");
            return (Criteria) this;
        }

        public Criteria andSettModeBetween(String value1, String value2) {
            addCriterion("sett_mode between", value1, value2, "settMode");
            return (Criteria) this;
        }

        public Criteria andSettModeNotBetween(String value1, String value2) {
            addCriterion("sett_mode not between", value1, value2, "settMode");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNull() {
            addCriterion("account_no is null");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNotNull() {
            addCriterion("account_no is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNoEqualTo(String value) {
            addCriterion("account_no =", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotEqualTo(String value) {
            addCriterion("account_no <>", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThan(String value) {
            addCriterion("account_no >", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("account_no >=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThan(String value) {
            addCriterion("account_no <", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThanOrEqualTo(String value) {
            addCriterion("account_no <=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLike(String value) {
            addCriterion("account_no like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotLike(String value) {
            addCriterion("account_no not like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoIn(List<String> values) {
            addCriterion("account_no in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotIn(List<String> values) {
            addCriterion("account_no not in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoBetween(String value1, String value2) {
            addCriterion("account_no between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotBetween(String value1, String value2) {
            addCriterion("account_no not between", value1, value2, "accountNo");
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

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andSettDateIsNull() {
            addCriterion("sett_date is null");
            return (Criteria) this;
        }

        public Criteria andSettDateIsNotNull() {
            addCriterion("sett_date is not null");
            return (Criteria) this;
        }

        public Criteria andSettDateEqualTo(Date value) {
            addCriterionForJDBCDate("sett_date =", value, "settDate");
            return (Criteria) this;
        }

        public Criteria andSettDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sett_date <>", value, "settDate");
            return (Criteria) this;
        }

        public Criteria andSettDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sett_date >", value, "settDate");
            return (Criteria) this;
        }

        public Criteria andSettDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sett_date >=", value, "settDate");
            return (Criteria) this;
        }

        public Criteria andSettDateLessThan(Date value) {
            addCriterionForJDBCDate("sett_date <", value, "settDate");
            return (Criteria) this;
        }

        public Criteria andSettDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sett_date <=", value, "settDate");
            return (Criteria) this;
        }

        public Criteria andSettDateIn(List<Date> values) {
            addCriterionForJDBCDate("sett_date in", values, "settDate");
            return (Criteria) this;
        }

        public Criteria andSettDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sett_date not in", values, "settDate");
            return (Criteria) this;
        }

        public Criteria andSettDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sett_date between", value1, value2, "settDate");
            return (Criteria) this;
        }

        public Criteria andSettDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sett_date not between", value1, value2, "settDate");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("bank_account_name like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIsNull() {
            addCriterion("bank_account_no is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIsNotNull() {
            addCriterion("bank_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoEqualTo(String value) {
            addCriterion("bank_account_no =", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotEqualTo(String value) {
            addCriterion("bank_account_no <>", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoGreaterThan(String value) {
            addCriterion("bank_account_no >", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_no >=", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLessThan(String value) {
            addCriterion("bank_account_no <", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLessThanOrEqualTo(String value) {
            addCriterion("bank_account_no <=", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLike(String value) {
            addCriterion("bank_account_no like", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotLike(String value) {
            addCriterion("bank_account_no not like", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIn(List<String> values) {
            addCriterion("bank_account_no in", values, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotIn(List<String> values) {
            addCriterion("bank_account_no not in", values, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoBetween(String value1, String value2) {
            addCriterion("bank_account_no between", value1, value2, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotBetween(String value1, String value2) {
            addCriterion("bank_account_no not between", value1, value2, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeIsNull() {
            addCriterion("bank_account_type is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeIsNotNull() {
            addCriterion("bank_account_type is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeEqualTo(String value) {
            addCriterion("bank_account_type =", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeNotEqualTo(String value) {
            addCriterion("bank_account_type <>", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeGreaterThan(String value) {
            addCriterion("bank_account_type >", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_type >=", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeLessThan(String value) {
            addCriterion("bank_account_type <", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("bank_account_type <=", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeLike(String value) {
            addCriterion("bank_account_type like", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeNotLike(String value) {
            addCriterion("bank_account_type not like", value, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeIn(List<String> values) {
            addCriterion("bank_account_type in", values, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeNotIn(List<String> values) {
            addCriterion("bank_account_type not in", values, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeBetween(String value1, String value2) {
            addCriterion("bank_account_type between", value1, value2, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andBankAccountTypeNotBetween(String value1, String value2) {
            addCriterion("bank_account_type not between", value1, value2, "bankAccountType");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreasIsNull() {
            addCriterion("areas is null");
            return (Criteria) this;
        }

        public Criteria andAreasIsNotNull() {
            addCriterion("areas is not null");
            return (Criteria) this;
        }

        public Criteria andAreasEqualTo(String value) {
            addCriterion("areas =", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotEqualTo(String value) {
            addCriterion("areas <>", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasGreaterThan(String value) {
            addCriterion("areas >", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasGreaterThanOrEqualTo(String value) {
            addCriterion("areas >=", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLessThan(String value) {
            addCriterion("areas <", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLessThanOrEqualTo(String value) {
            addCriterion("areas <=", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasLike(String value) {
            addCriterion("areas like", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotLike(String value) {
            addCriterion("areas not like", value, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasIn(List<String> values) {
            addCriterion("areas in", values, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotIn(List<String> values) {
            addCriterion("areas not in", values, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasBetween(String value1, String value2) {
            addCriterion("areas between", value1, value2, "areas");
            return (Criteria) this;
        }

        public Criteria andAreasNotBetween(String value1, String value2) {
            addCriterion("areas not between", value1, value2, "areas");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressIsNull() {
            addCriterion("bank_account_address is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressIsNotNull() {
            addCriterion("bank_account_address is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressEqualTo(String value) {
            addCriterion("bank_account_address =", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressNotEqualTo(String value) {
            addCriterion("bank_account_address <>", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressGreaterThan(String value) {
            addCriterion("bank_account_address >", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_address >=", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressLessThan(String value) {
            addCriterion("bank_account_address <", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressLessThanOrEqualTo(String value) {
            addCriterion("bank_account_address <=", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressLike(String value) {
            addCriterion("bank_account_address like", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressNotLike(String value) {
            addCriterion("bank_account_address not like", value, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressIn(List<String> values) {
            addCriterion("bank_account_address in", values, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressNotIn(List<String> values) {
            addCriterion("bank_account_address not in", values, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressBetween(String value1, String value2) {
            addCriterion("bank_account_address between", value1, value2, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andBankAccountAddressNotBetween(String value1, String value2) {
            addCriterion("bank_account_address not between", value1, value2, "bankAccountAddress");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNull() {
            addCriterion("mobile_no is null");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNotNull() {
            addCriterion("mobile_no is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNoEqualTo(String value) {
            addCriterion("mobile_no =", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotEqualTo(String value) {
            addCriterion("mobile_no <>", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThan(String value) {
            addCriterion("mobile_no >", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_no >=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThan(String value) {
            addCriterion("mobile_no <", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThanOrEqualTo(String value) {
            addCriterion("mobile_no <=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLike(String value) {
            addCriterion("mobile_no like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotLike(String value) {
            addCriterion("mobile_no not like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoIn(List<String> values) {
            addCriterion("mobile_no in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotIn(List<String> values) {
            addCriterion("mobile_no not in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoBetween(String value1, String value2) {
            addCriterion("mobile_no between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotBetween(String value1, String value2) {
            addCriterion("mobile_no not between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andSettAmountIsNull() {
            addCriterion("sett_amount is null");
            return (Criteria) this;
        }

        public Criteria andSettAmountIsNotNull() {
            addCriterion("sett_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSettAmountEqualTo(BigDecimal value) {
            addCriterion("sett_amount =", value, "settAmount");
            return (Criteria) this;
        }

        public Criteria andSettAmountNotEqualTo(BigDecimal value) {
            addCriterion("sett_amount <>", value, "settAmount");
            return (Criteria) this;
        }

        public Criteria andSettAmountGreaterThan(BigDecimal value) {
            addCriterion("sett_amount >", value, "settAmount");
            return (Criteria) this;
        }

        public Criteria andSettAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sett_amount >=", value, "settAmount");
            return (Criteria) this;
        }

        public Criteria andSettAmountLessThan(BigDecimal value) {
            addCriterion("sett_amount <", value, "settAmount");
            return (Criteria) this;
        }

        public Criteria andSettAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sett_amount <=", value, "settAmount");
            return (Criteria) this;
        }

        public Criteria andSettAmountIn(List<BigDecimal> values) {
            addCriterion("sett_amount in", values, "settAmount");
            return (Criteria) this;
        }

        public Criteria andSettAmountNotIn(List<BigDecimal> values) {
            addCriterion("sett_amount not in", values, "settAmount");
            return (Criteria) this;
        }

        public Criteria andSettAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sett_amount between", value1, value2, "settAmount");
            return (Criteria) this;
        }

        public Criteria andSettAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sett_amount not between", value1, value2, "settAmount");
            return (Criteria) this;
        }

        public Criteria andSettFeeIsNull() {
            addCriterion("sett_fee is null");
            return (Criteria) this;
        }

        public Criteria andSettFeeIsNotNull() {
            addCriterion("sett_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSettFeeEqualTo(BigDecimal value) {
            addCriterion("sett_fee =", value, "settFee");
            return (Criteria) this;
        }

        public Criteria andSettFeeNotEqualTo(BigDecimal value) {
            addCriterion("sett_fee <>", value, "settFee");
            return (Criteria) this;
        }

        public Criteria andSettFeeGreaterThan(BigDecimal value) {
            addCriterion("sett_fee >", value, "settFee");
            return (Criteria) this;
        }

        public Criteria andSettFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sett_fee >=", value, "settFee");
            return (Criteria) this;
        }

        public Criteria andSettFeeLessThan(BigDecimal value) {
            addCriterion("sett_fee <", value, "settFee");
            return (Criteria) this;
        }

        public Criteria andSettFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sett_fee <=", value, "settFee");
            return (Criteria) this;
        }

        public Criteria andSettFeeIn(List<BigDecimal> values) {
            addCriterion("sett_fee in", values, "settFee");
            return (Criteria) this;
        }

        public Criteria andSettFeeNotIn(List<BigDecimal> values) {
            addCriterion("sett_fee not in", values, "settFee");
            return (Criteria) this;
        }

        public Criteria andSettFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sett_fee between", value1, value2, "settFee");
            return (Criteria) this;
        }

        public Criteria andSettFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sett_fee not between", value1, value2, "settFee");
            return (Criteria) this;
        }

        public Criteria andRemitAmountIsNull() {
            addCriterion("remit_amount is null");
            return (Criteria) this;
        }

        public Criteria andRemitAmountIsNotNull() {
            addCriterion("remit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRemitAmountEqualTo(BigDecimal value) {
            addCriterion("remit_amount =", value, "remitAmount");
            return (Criteria) this;
        }

        public Criteria andRemitAmountNotEqualTo(BigDecimal value) {
            addCriterion("remit_amount <>", value, "remitAmount");
            return (Criteria) this;
        }

        public Criteria andRemitAmountGreaterThan(BigDecimal value) {
            addCriterion("remit_amount >", value, "remitAmount");
            return (Criteria) this;
        }

        public Criteria andRemitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remit_amount >=", value, "remitAmount");
            return (Criteria) this;
        }

        public Criteria andRemitAmountLessThan(BigDecimal value) {
            addCriterion("remit_amount <", value, "remitAmount");
            return (Criteria) this;
        }

        public Criteria andRemitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remit_amount <=", value, "remitAmount");
            return (Criteria) this;
        }

        public Criteria andRemitAmountIn(List<BigDecimal> values) {
            addCriterion("remit_amount in", values, "remitAmount");
            return (Criteria) this;
        }

        public Criteria andRemitAmountNotIn(List<BigDecimal> values) {
            addCriterion("remit_amount not in", values, "remitAmount");
            return (Criteria) this;
        }

        public Criteria andRemitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remit_amount between", value1, value2, "remitAmount");
            return (Criteria) this;
        }

        public Criteria andRemitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remit_amount not between", value1, value2, "remitAmount");
            return (Criteria) this;
        }

        public Criteria andSettStatusIsNull() {
            addCriterion("sett_status is null");
            return (Criteria) this;
        }

        public Criteria andSettStatusIsNotNull() {
            addCriterion("sett_status is not null");
            return (Criteria) this;
        }

        public Criteria andSettStatusEqualTo(String value) {
            addCriterion("sett_status =", value, "settStatus");
            return (Criteria) this;
        }

        public Criteria andSettStatusNotEqualTo(String value) {
            addCriterion("sett_status <>", value, "settStatus");
            return (Criteria) this;
        }

        public Criteria andSettStatusGreaterThan(String value) {
            addCriterion("sett_status >", value, "settStatus");
            return (Criteria) this;
        }

        public Criteria andSettStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sett_status >=", value, "settStatus");
            return (Criteria) this;
        }

        public Criteria andSettStatusLessThan(String value) {
            addCriterion("sett_status <", value, "settStatus");
            return (Criteria) this;
        }

        public Criteria andSettStatusLessThanOrEqualTo(String value) {
            addCriterion("sett_status <=", value, "settStatus");
            return (Criteria) this;
        }

        public Criteria andSettStatusLike(String value) {
            addCriterion("sett_status like", value, "settStatus");
            return (Criteria) this;
        }

        public Criteria andSettStatusNotLike(String value) {
            addCriterion("sett_status not like", value, "settStatus");
            return (Criteria) this;
        }

        public Criteria andSettStatusIn(List<String> values) {
            addCriterion("sett_status in", values, "settStatus");
            return (Criteria) this;
        }

        public Criteria andSettStatusNotIn(List<String> values) {
            addCriterion("sett_status not in", values, "settStatus");
            return (Criteria) this;
        }

        public Criteria andSettStatusBetween(String value1, String value2) {
            addCriterion("sett_status between", value1, value2, "settStatus");
            return (Criteria) this;
        }

        public Criteria andSettStatusNotBetween(String value1, String value2) {
            addCriterion("sett_status not between", value1, value2, "settStatus");
            return (Criteria) this;
        }

        public Criteria andRemitConfirmTimeIsNull() {
            addCriterion("remit_confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andRemitConfirmTimeIsNotNull() {
            addCriterion("remit_confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andRemitConfirmTimeEqualTo(Date value) {
            addCriterion("remit_confirm_time =", value, "remitConfirmTime");
            return (Criteria) this;
        }

        public Criteria andRemitConfirmTimeNotEqualTo(Date value) {
            addCriterion("remit_confirm_time <>", value, "remitConfirmTime");
            return (Criteria) this;
        }

        public Criteria andRemitConfirmTimeGreaterThan(Date value) {
            addCriterion("remit_confirm_time >", value, "remitConfirmTime");
            return (Criteria) this;
        }

        public Criteria andRemitConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("remit_confirm_time >=", value, "remitConfirmTime");
            return (Criteria) this;
        }

        public Criteria andRemitConfirmTimeLessThan(Date value) {
            addCriterion("remit_confirm_time <", value, "remitConfirmTime");
            return (Criteria) this;
        }

        public Criteria andRemitConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("remit_confirm_time <=", value, "remitConfirmTime");
            return (Criteria) this;
        }

        public Criteria andRemitConfirmTimeIn(List<Date> values) {
            addCriterion("remit_confirm_time in", values, "remitConfirmTime");
            return (Criteria) this;
        }

        public Criteria andRemitConfirmTimeNotIn(List<Date> values) {
            addCriterion("remit_confirm_time not in", values, "remitConfirmTime");
            return (Criteria) this;
        }

        public Criteria andRemitConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("remit_confirm_time between", value1, value2, "remitConfirmTime");
            return (Criteria) this;
        }

        public Criteria andRemitConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("remit_confirm_time not between", value1, value2, "remitConfirmTime");
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

        public Criteria andRemitRemarkIsNull() {
            addCriterion("remit_remark is null");
            return (Criteria) this;
        }

        public Criteria andRemitRemarkIsNotNull() {
            addCriterion("remit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemitRemarkEqualTo(String value) {
            addCriterion("remit_remark =", value, "remitRemark");
            return (Criteria) this;
        }

        public Criteria andRemitRemarkNotEqualTo(String value) {
            addCriterion("remit_remark <>", value, "remitRemark");
            return (Criteria) this;
        }

        public Criteria andRemitRemarkGreaterThan(String value) {
            addCriterion("remit_remark >", value, "remitRemark");
            return (Criteria) this;
        }

        public Criteria andRemitRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remit_remark >=", value, "remitRemark");
            return (Criteria) this;
        }

        public Criteria andRemitRemarkLessThan(String value) {
            addCriterion("remit_remark <", value, "remitRemark");
            return (Criteria) this;
        }

        public Criteria andRemitRemarkLessThanOrEqualTo(String value) {
            addCriterion("remit_remark <=", value, "remitRemark");
            return (Criteria) this;
        }

        public Criteria andRemitRemarkLike(String value) {
            addCriterion("remit_remark like", value, "remitRemark");
            return (Criteria) this;
        }

        public Criteria andRemitRemarkNotLike(String value) {
            addCriterion("remit_remark not like", value, "remitRemark");
            return (Criteria) this;
        }

        public Criteria andRemitRemarkIn(List<String> values) {
            addCriterion("remit_remark in", values, "remitRemark");
            return (Criteria) this;
        }

        public Criteria andRemitRemarkNotIn(List<String> values) {
            addCriterion("remit_remark not in", values, "remitRemark");
            return (Criteria) this;
        }

        public Criteria andRemitRemarkBetween(String value1, String value2) {
            addCriterion("remit_remark between", value1, value2, "remitRemark");
            return (Criteria) this;
        }

        public Criteria andRemitRemarkNotBetween(String value1, String value2) {
            addCriterion("remit_remark not between", value1, value2, "remitRemark");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameIsNull() {
            addCriterion("operator_loginname is null");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameIsNotNull() {
            addCriterion("operator_loginname is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameEqualTo(String value) {
            addCriterion("operator_loginname =", value, "operatorLoginname");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameNotEqualTo(String value) {
            addCriterion("operator_loginname <>", value, "operatorLoginname");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameGreaterThan(String value) {
            addCriterion("operator_loginname >", value, "operatorLoginname");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_loginname >=", value, "operatorLoginname");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameLessThan(String value) {
            addCriterion("operator_loginname <", value, "operatorLoginname");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameLessThanOrEqualTo(String value) {
            addCriterion("operator_loginname <=", value, "operatorLoginname");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameLike(String value) {
            addCriterion("operator_loginname like", value, "operatorLoginname");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameNotLike(String value) {
            addCriterion("operator_loginname not like", value, "operatorLoginname");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameIn(List<String> values) {
            addCriterion("operator_loginname in", values, "operatorLoginname");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameNotIn(List<String> values) {
            addCriterion("operator_loginname not in", values, "operatorLoginname");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameBetween(String value1, String value2) {
            addCriterion("operator_loginname between", value1, value2, "operatorLoginname");
            return (Criteria) this;
        }

        public Criteria andOperatorLoginnameNotBetween(String value1, String value2) {
            addCriterion("operator_loginname not between", value1, value2, "operatorLoginname");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameIsNull() {
            addCriterion("operator_realname is null");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameIsNotNull() {
            addCriterion("operator_realname is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameEqualTo(String value) {
            addCriterion("operator_realname =", value, "operatorRealname");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameNotEqualTo(String value) {
            addCriterion("operator_realname <>", value, "operatorRealname");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameGreaterThan(String value) {
            addCriterion("operator_realname >", value, "operatorRealname");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_realname >=", value, "operatorRealname");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameLessThan(String value) {
            addCriterion("operator_realname <", value, "operatorRealname");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameLessThanOrEqualTo(String value) {
            addCriterion("operator_realname <=", value, "operatorRealname");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameLike(String value) {
            addCriterion("operator_realname like", value, "operatorRealname");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameNotLike(String value) {
            addCriterion("operator_realname not like", value, "operatorRealname");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameIn(List<String> values) {
            addCriterion("operator_realname in", values, "operatorRealname");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameNotIn(List<String> values) {
            addCriterion("operator_realname not in", values, "operatorRealname");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameBetween(String value1, String value2) {
            addCriterion("operator_realname between", value1, value2, "operatorRealname");
            return (Criteria) this;
        }

        public Criteria andOperatorRealnameNotBetween(String value1, String value2) {
            addCriterion("operator_realname not between", value1, value2, "operatorRealname");
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