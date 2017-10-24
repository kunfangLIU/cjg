package com.cjg.pay.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RpRefundRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RpRefundRecordExample() {
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

        public Criteria andEditorIsNull() {
            addCriterion("editor is null");
            return (Criteria) this;
        }

        public Criteria andEditorIsNotNull() {
            addCriterion("editor is not null");
            return (Criteria) this;
        }

        public Criteria andEditorEqualTo(String value) {
            addCriterion("editor =", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotEqualTo(String value) {
            addCriterion("editor <>", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThan(String value) {
            addCriterion("editor >", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThanOrEqualTo(String value) {
            addCriterion("editor >=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThan(String value) {
            addCriterion("editor <", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThanOrEqualTo(String value) {
            addCriterion("editor <=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLike(String value) {
            addCriterion("editor like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotLike(String value) {
            addCriterion("editor not like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorIn(List<String> values) {
            addCriterion("editor in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotIn(List<String> values) {
            addCriterion("editor not in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorBetween(String value1, String value2) {
            addCriterion("editor between", value1, value2, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotBetween(String value1, String value2) {
            addCriterion("editor not between", value1, value2, "editor");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
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

        public Criteria andOrgMerchantOrderNoIsNull() {
            addCriterion("org_merchant_order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrgMerchantOrderNoIsNotNull() {
            addCriterion("org_merchant_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrgMerchantOrderNoEqualTo(String value) {
            addCriterion("org_merchant_order_no =", value, "orgMerchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgMerchantOrderNoNotEqualTo(String value) {
            addCriterion("org_merchant_order_no <>", value, "orgMerchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgMerchantOrderNoGreaterThan(String value) {
            addCriterion("org_merchant_order_no >", value, "orgMerchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgMerchantOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("org_merchant_order_no >=", value, "orgMerchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgMerchantOrderNoLessThan(String value) {
            addCriterion("org_merchant_order_no <", value, "orgMerchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgMerchantOrderNoLessThanOrEqualTo(String value) {
            addCriterion("org_merchant_order_no <=", value, "orgMerchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgMerchantOrderNoLike(String value) {
            addCriterion("org_merchant_order_no like", value, "orgMerchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgMerchantOrderNoNotLike(String value) {
            addCriterion("org_merchant_order_no not like", value, "orgMerchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgMerchantOrderNoIn(List<String> values) {
            addCriterion("org_merchant_order_no in", values, "orgMerchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgMerchantOrderNoNotIn(List<String> values) {
            addCriterion("org_merchant_order_no not in", values, "orgMerchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgMerchantOrderNoBetween(String value1, String value2) {
            addCriterion("org_merchant_order_no between", value1, value2, "orgMerchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgMerchantOrderNoNotBetween(String value1, String value2) {
            addCriterion("org_merchant_order_no not between", value1, value2, "orgMerchantOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoIsNull() {
            addCriterion("org_trx_no is null");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoIsNotNull() {
            addCriterion("org_trx_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoEqualTo(String value) {
            addCriterion("org_trx_no =", value, "orgTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoNotEqualTo(String value) {
            addCriterion("org_trx_no <>", value, "orgTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoGreaterThan(String value) {
            addCriterion("org_trx_no >", value, "orgTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoGreaterThanOrEqualTo(String value) {
            addCriterion("org_trx_no >=", value, "orgTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoLessThan(String value) {
            addCriterion("org_trx_no <", value, "orgTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoLessThanOrEqualTo(String value) {
            addCriterion("org_trx_no <=", value, "orgTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoLike(String value) {
            addCriterion("org_trx_no like", value, "orgTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoNotLike(String value) {
            addCriterion("org_trx_no not like", value, "orgTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoIn(List<String> values) {
            addCriterion("org_trx_no in", values, "orgTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoNotIn(List<String> values) {
            addCriterion("org_trx_no not in", values, "orgTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoBetween(String value1, String value2) {
            addCriterion("org_trx_no between", value1, value2, "orgTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgTrxNoNotBetween(String value1, String value2) {
            addCriterion("org_trx_no not between", value1, value2, "orgTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoIsNull() {
            addCriterion("org_bank_order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoIsNotNull() {
            addCriterion("org_bank_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoEqualTo(String value) {
            addCriterion("org_bank_order_no =", value, "orgBankOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoNotEqualTo(String value) {
            addCriterion("org_bank_order_no <>", value, "orgBankOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoGreaterThan(String value) {
            addCriterion("org_bank_order_no >", value, "orgBankOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("org_bank_order_no >=", value, "orgBankOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoLessThan(String value) {
            addCriterion("org_bank_order_no <", value, "orgBankOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoLessThanOrEqualTo(String value) {
            addCriterion("org_bank_order_no <=", value, "orgBankOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoLike(String value) {
            addCriterion("org_bank_order_no like", value, "orgBankOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoNotLike(String value) {
            addCriterion("org_bank_order_no not like", value, "orgBankOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoIn(List<String> values) {
            addCriterion("org_bank_order_no in", values, "orgBankOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoNotIn(List<String> values) {
            addCriterion("org_bank_order_no not in", values, "orgBankOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoBetween(String value1, String value2) {
            addCriterion("org_bank_order_no between", value1, value2, "orgBankOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankOrderNoNotBetween(String value1, String value2) {
            addCriterion("org_bank_order_no not between", value1, value2, "orgBankOrderNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoIsNull() {
            addCriterion("org_bank_trx_no is null");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoIsNotNull() {
            addCriterion("org_bank_trx_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoEqualTo(String value) {
            addCriterion("org_bank_trx_no =", value, "orgBankTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoNotEqualTo(String value) {
            addCriterion("org_bank_trx_no <>", value, "orgBankTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoGreaterThan(String value) {
            addCriterion("org_bank_trx_no >", value, "orgBankTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoGreaterThanOrEqualTo(String value) {
            addCriterion("org_bank_trx_no >=", value, "orgBankTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoLessThan(String value) {
            addCriterion("org_bank_trx_no <", value, "orgBankTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoLessThanOrEqualTo(String value) {
            addCriterion("org_bank_trx_no <=", value, "orgBankTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoLike(String value) {
            addCriterion("org_bank_trx_no like", value, "orgBankTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoNotLike(String value) {
            addCriterion("org_bank_trx_no not like", value, "orgBankTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoIn(List<String> values) {
            addCriterion("org_bank_trx_no in", values, "orgBankTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoNotIn(List<String> values) {
            addCriterion("org_bank_trx_no not in", values, "orgBankTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoBetween(String value1, String value2) {
            addCriterion("org_bank_trx_no between", value1, value2, "orgBankTrxNo");
            return (Criteria) this;
        }

        public Criteria andOrgBankTrxNoNotBetween(String value1, String value2) {
            addCriterion("org_bank_trx_no not between", value1, value2, "orgBankTrxNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNull() {
            addCriterion("merchant_no is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIsNotNull() {
            addCriterion("merchant_no is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNoEqualTo(String value) {
            addCriterion("merchant_no =", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotEqualTo(String value) {
            addCriterion("merchant_no <>", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThan(String value) {
            addCriterion("merchant_no >", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_no >=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThan(String value) {
            addCriterion("merchant_no <", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("merchant_no <=", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoLike(String value) {
            addCriterion("merchant_no like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotLike(String value) {
            addCriterion("merchant_no not like", value, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoIn(List<String> values) {
            addCriterion("merchant_no in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotIn(List<String> values) {
            addCriterion("merchant_no not in", values, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoBetween(String value1, String value2) {
            addCriterion("merchant_no between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andMerchantNoNotBetween(String value1, String value2) {
            addCriterion("merchant_no not between", value1, value2, "merchantNo");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameIsNull() {
            addCriterion("org_product_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameIsNotNull() {
            addCriterion("org_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameEqualTo(String value) {
            addCriterion("org_product_name =", value, "orgProductName");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameNotEqualTo(String value) {
            addCriterion("org_product_name <>", value, "orgProductName");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameGreaterThan(String value) {
            addCriterion("org_product_name >", value, "orgProductName");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_product_name >=", value, "orgProductName");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameLessThan(String value) {
            addCriterion("org_product_name <", value, "orgProductName");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameLessThanOrEqualTo(String value) {
            addCriterion("org_product_name <=", value, "orgProductName");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameLike(String value) {
            addCriterion("org_product_name like", value, "orgProductName");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameNotLike(String value) {
            addCriterion("org_product_name not like", value, "orgProductName");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameIn(List<String> values) {
            addCriterion("org_product_name in", values, "orgProductName");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameNotIn(List<String> values) {
            addCriterion("org_product_name not in", values, "orgProductName");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameBetween(String value1, String value2) {
            addCriterion("org_product_name between", value1, value2, "orgProductName");
            return (Criteria) this;
        }

        public Criteria andOrgProductNameNotBetween(String value1, String value2) {
            addCriterion("org_product_name not between", value1, value2, "orgProductName");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeIsNull() {
            addCriterion("org_biz_type is null");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeIsNotNull() {
            addCriterion("org_biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeEqualTo(String value) {
            addCriterion("org_biz_type =", value, "orgBizType");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeNotEqualTo(String value) {
            addCriterion("org_biz_type <>", value, "orgBizType");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeGreaterThan(String value) {
            addCriterion("org_biz_type >", value, "orgBizType");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("org_biz_type >=", value, "orgBizType");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeLessThan(String value) {
            addCriterion("org_biz_type <", value, "orgBizType");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeLessThanOrEqualTo(String value) {
            addCriterion("org_biz_type <=", value, "orgBizType");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeLike(String value) {
            addCriterion("org_biz_type like", value, "orgBizType");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeNotLike(String value) {
            addCriterion("org_biz_type not like", value, "orgBizType");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeIn(List<String> values) {
            addCriterion("org_biz_type in", values, "orgBizType");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeNotIn(List<String> values) {
            addCriterion("org_biz_type not in", values, "orgBizType");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeBetween(String value1, String value2) {
            addCriterion("org_biz_type between", value1, value2, "orgBizType");
            return (Criteria) this;
        }

        public Criteria andOrgBizTypeNotBetween(String value1, String value2) {
            addCriterion("org_biz_type not between", value1, value2, "orgBizType");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeIsNull() {
            addCriterion("org_payment_type is null");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeIsNotNull() {
            addCriterion("org_payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeEqualTo(String value) {
            addCriterion("org_payment_type =", value, "orgPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeNotEqualTo(String value) {
            addCriterion("org_payment_type <>", value, "orgPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeGreaterThan(String value) {
            addCriterion("org_payment_type >", value, "orgPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("org_payment_type >=", value, "orgPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeLessThan(String value) {
            addCriterion("org_payment_type <", value, "orgPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("org_payment_type <=", value, "orgPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeLike(String value) {
            addCriterion("org_payment_type like", value, "orgPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeNotLike(String value) {
            addCriterion("org_payment_type not like", value, "orgPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeIn(List<String> values) {
            addCriterion("org_payment_type in", values, "orgPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeNotIn(List<String> values) {
            addCriterion("org_payment_type not in", values, "orgPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeBetween(String value1, String value2) {
            addCriterion("org_payment_type between", value1, value2, "orgPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrgPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("org_payment_type not between", value1, value2, "orgPaymentType");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(BigDecimal value) {
            addCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(BigDecimal value) {
            addCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<BigDecimal> values) {
            addCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoIsNull() {
            addCriterion("refund_trx_no is null");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoIsNotNull() {
            addCriterion("refund_trx_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoEqualTo(String value) {
            addCriterion("refund_trx_no =", value, "refundTrxNo");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoNotEqualTo(String value) {
            addCriterion("refund_trx_no <>", value, "refundTrxNo");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoGreaterThan(String value) {
            addCriterion("refund_trx_no >", value, "refundTrxNo");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_trx_no >=", value, "refundTrxNo");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoLessThan(String value) {
            addCriterion("refund_trx_no <", value, "refundTrxNo");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoLessThanOrEqualTo(String value) {
            addCriterion("refund_trx_no <=", value, "refundTrxNo");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoLike(String value) {
            addCriterion("refund_trx_no like", value, "refundTrxNo");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoNotLike(String value) {
            addCriterion("refund_trx_no not like", value, "refundTrxNo");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoIn(List<String> values) {
            addCriterion("refund_trx_no in", values, "refundTrxNo");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoNotIn(List<String> values) {
            addCriterion("refund_trx_no not in", values, "refundTrxNo");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoBetween(String value1, String value2) {
            addCriterion("refund_trx_no between", value1, value2, "refundTrxNo");
            return (Criteria) this;
        }

        public Criteria andRefundTrxNoNotBetween(String value1, String value2) {
            addCriterion("refund_trx_no not between", value1, value2, "refundTrxNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoIsNull() {
            addCriterion("refund_order_no is null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoIsNotNull() {
            addCriterion("refund_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoEqualTo(String value) {
            addCriterion("refund_order_no =", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoNotEqualTo(String value) {
            addCriterion("refund_order_no <>", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoGreaterThan(String value) {
            addCriterion("refund_order_no >", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("refund_order_no >=", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoLessThan(String value) {
            addCriterion("refund_order_no <", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoLessThanOrEqualTo(String value) {
            addCriterion("refund_order_no <=", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoLike(String value) {
            addCriterion("refund_order_no like", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoNotLike(String value) {
            addCriterion("refund_order_no not like", value, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoIn(List<String> values) {
            addCriterion("refund_order_no in", values, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoNotIn(List<String> values) {
            addCriterion("refund_order_no not in", values, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoBetween(String value1, String value2) {
            addCriterion("refund_order_no between", value1, value2, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andRefundOrderNoNotBetween(String value1, String value2) {
            addCriterion("refund_order_no not between", value1, value2, "refundOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoIsNull() {
            addCriterion("bank_refund_order_no is null");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoIsNotNull() {
            addCriterion("bank_refund_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoEqualTo(String value) {
            addCriterion("bank_refund_order_no =", value, "bankRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoNotEqualTo(String value) {
            addCriterion("bank_refund_order_no <>", value, "bankRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoGreaterThan(String value) {
            addCriterion("bank_refund_order_no >", value, "bankRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_refund_order_no >=", value, "bankRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoLessThan(String value) {
            addCriterion("bank_refund_order_no <", value, "bankRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoLessThanOrEqualTo(String value) {
            addCriterion("bank_refund_order_no <=", value, "bankRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoLike(String value) {
            addCriterion("bank_refund_order_no like", value, "bankRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoNotLike(String value) {
            addCriterion("bank_refund_order_no not like", value, "bankRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoIn(List<String> values) {
            addCriterion("bank_refund_order_no in", values, "bankRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoNotIn(List<String> values) {
            addCriterion("bank_refund_order_no not in", values, "bankRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoBetween(String value1, String value2) {
            addCriterion("bank_refund_order_no between", value1, value2, "bankRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundOrderNoNotBetween(String value1, String value2) {
            addCriterion("bank_refund_order_no not between", value1, value2, "bankRefundOrderNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoIsNull() {
            addCriterion("bank_refund_trx_no is null");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoIsNotNull() {
            addCriterion("bank_refund_trx_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoEqualTo(String value) {
            addCriterion("bank_refund_trx_no =", value, "bankRefundTrxNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoNotEqualTo(String value) {
            addCriterion("bank_refund_trx_no <>", value, "bankRefundTrxNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoGreaterThan(String value) {
            addCriterion("bank_refund_trx_no >", value, "bankRefundTrxNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_refund_trx_no >=", value, "bankRefundTrxNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoLessThan(String value) {
            addCriterion("bank_refund_trx_no <", value, "bankRefundTrxNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoLessThanOrEqualTo(String value) {
            addCriterion("bank_refund_trx_no <=", value, "bankRefundTrxNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoLike(String value) {
            addCriterion("bank_refund_trx_no like", value, "bankRefundTrxNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoNotLike(String value) {
            addCriterion("bank_refund_trx_no not like", value, "bankRefundTrxNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoIn(List<String> values) {
            addCriterion("bank_refund_trx_no in", values, "bankRefundTrxNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoNotIn(List<String> values) {
            addCriterion("bank_refund_trx_no not in", values, "bankRefundTrxNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoBetween(String value1, String value2) {
            addCriterion("bank_refund_trx_no between", value1, value2, "bankRefundTrxNo");
            return (Criteria) this;
        }

        public Criteria andBankRefundTrxNoNotBetween(String value1, String value2) {
            addCriterion("bank_refund_trx_no not between", value1, value2, "bankRefundTrxNo");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlIsNull() {
            addCriterion("result_notify_url is null");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlIsNotNull() {
            addCriterion("result_notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlEqualTo(String value) {
            addCriterion("result_notify_url =", value, "resultNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlNotEqualTo(String value) {
            addCriterion("result_notify_url <>", value, "resultNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlGreaterThan(String value) {
            addCriterion("result_notify_url >", value, "resultNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("result_notify_url >=", value, "resultNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlLessThan(String value) {
            addCriterion("result_notify_url <", value, "resultNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("result_notify_url <=", value, "resultNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlLike(String value) {
            addCriterion("result_notify_url like", value, "resultNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlNotLike(String value) {
            addCriterion("result_notify_url not like", value, "resultNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlIn(List<String> values) {
            addCriterion("result_notify_url in", values, "resultNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlNotIn(List<String> values) {
            addCriterion("result_notify_url not in", values, "resultNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlBetween(String value1, String value2) {
            addCriterion("result_notify_url between", value1, value2, "resultNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andResultNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("result_notify_url not between", value1, value2, "resultNotifyUrl");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(String value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(String value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(String value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(String value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(String value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLike(String value) {
            addCriterion("refund_status like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotLike(String value) {
            addCriterion("refund_status not like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<String> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<String> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(String value1, String value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(String value1, String value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundFromIsNull() {
            addCriterion("refund_from is null");
            return (Criteria) this;
        }

        public Criteria andRefundFromIsNotNull() {
            addCriterion("refund_from is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFromEqualTo(String value) {
            addCriterion("refund_from =", value, "refundFrom");
            return (Criteria) this;
        }

        public Criteria andRefundFromNotEqualTo(String value) {
            addCriterion("refund_from <>", value, "refundFrom");
            return (Criteria) this;
        }

        public Criteria andRefundFromGreaterThan(String value) {
            addCriterion("refund_from >", value, "refundFrom");
            return (Criteria) this;
        }

        public Criteria andRefundFromGreaterThanOrEqualTo(String value) {
            addCriterion("refund_from >=", value, "refundFrom");
            return (Criteria) this;
        }

        public Criteria andRefundFromLessThan(String value) {
            addCriterion("refund_from <", value, "refundFrom");
            return (Criteria) this;
        }

        public Criteria andRefundFromLessThanOrEqualTo(String value) {
            addCriterion("refund_from <=", value, "refundFrom");
            return (Criteria) this;
        }

        public Criteria andRefundFromLike(String value) {
            addCriterion("refund_from like", value, "refundFrom");
            return (Criteria) this;
        }

        public Criteria andRefundFromNotLike(String value) {
            addCriterion("refund_from not like", value, "refundFrom");
            return (Criteria) this;
        }

        public Criteria andRefundFromIn(List<String> values) {
            addCriterion("refund_from in", values, "refundFrom");
            return (Criteria) this;
        }

        public Criteria andRefundFromNotIn(List<String> values) {
            addCriterion("refund_from not in", values, "refundFrom");
            return (Criteria) this;
        }

        public Criteria andRefundFromBetween(String value1, String value2) {
            addCriterion("refund_from between", value1, value2, "refundFrom");
            return (Criteria) this;
        }

        public Criteria andRefundFromNotBetween(String value1, String value2) {
            addCriterion("refund_from not between", value1, value2, "refundFrom");
            return (Criteria) this;
        }

        public Criteria andRefundWayIsNull() {
            addCriterion("refund_way is null");
            return (Criteria) this;
        }

        public Criteria andRefundWayIsNotNull() {
            addCriterion("refund_way is not null");
            return (Criteria) this;
        }

        public Criteria andRefundWayEqualTo(String value) {
            addCriterion("refund_way =", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayNotEqualTo(String value) {
            addCriterion("refund_way <>", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayGreaterThan(String value) {
            addCriterion("refund_way >", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayGreaterThanOrEqualTo(String value) {
            addCriterion("refund_way >=", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayLessThan(String value) {
            addCriterion("refund_way <", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayLessThanOrEqualTo(String value) {
            addCriterion("refund_way <=", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayLike(String value) {
            addCriterion("refund_way like", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayNotLike(String value) {
            addCriterion("refund_way not like", value, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayIn(List<String> values) {
            addCriterion("refund_way in", values, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayNotIn(List<String> values) {
            addCriterion("refund_way not in", values, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayBetween(String value1, String value2) {
            addCriterion("refund_way between", value1, value2, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundWayNotBetween(String value1, String value2) {
            addCriterion("refund_way not between", value1, value2, "refundWay");
            return (Criteria) this;
        }

        public Criteria andRefundRequestTimeIsNull() {
            addCriterion("refund_request_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundRequestTimeIsNotNull() {
            addCriterion("refund_request_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundRequestTimeEqualTo(Date value) {
            addCriterion("refund_request_time =", value, "refundRequestTime");
            return (Criteria) this;
        }

        public Criteria andRefundRequestTimeNotEqualTo(Date value) {
            addCriterion("refund_request_time <>", value, "refundRequestTime");
            return (Criteria) this;
        }

        public Criteria andRefundRequestTimeGreaterThan(Date value) {
            addCriterion("refund_request_time >", value, "refundRequestTime");
            return (Criteria) this;
        }

        public Criteria andRefundRequestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_request_time >=", value, "refundRequestTime");
            return (Criteria) this;
        }

        public Criteria andRefundRequestTimeLessThan(Date value) {
            addCriterion("refund_request_time <", value, "refundRequestTime");
            return (Criteria) this;
        }

        public Criteria andRefundRequestTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_request_time <=", value, "refundRequestTime");
            return (Criteria) this;
        }

        public Criteria andRefundRequestTimeIn(List<Date> values) {
            addCriterion("refund_request_time in", values, "refundRequestTime");
            return (Criteria) this;
        }

        public Criteria andRefundRequestTimeNotIn(List<Date> values) {
            addCriterion("refund_request_time not in", values, "refundRequestTime");
            return (Criteria) this;
        }

        public Criteria andRefundRequestTimeBetween(Date value1, Date value2) {
            addCriterion("refund_request_time between", value1, value2, "refundRequestTime");
            return (Criteria) this;
        }

        public Criteria andRefundRequestTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_request_time not between", value1, value2, "refundRequestTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeIsNull() {
            addCriterion("refund_success_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeIsNotNull() {
            addCriterion("refund_success_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeEqualTo(Date value) {
            addCriterion("refund_success_time =", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeNotEqualTo(Date value) {
            addCriterion("refund_success_time <>", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeGreaterThan(Date value) {
            addCriterion("refund_success_time >", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_success_time >=", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeLessThan(Date value) {
            addCriterion("refund_success_time <", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_success_time <=", value, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeIn(List<Date> values) {
            addCriterion("refund_success_time in", values, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeNotIn(List<Date> values) {
            addCriterion("refund_success_time not in", values, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeBetween(Date value1, Date value2) {
            addCriterion("refund_success_time between", value1, value2, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundSuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_success_time not between", value1, value2, "refundSuccessTime");
            return (Criteria) this;
        }

        public Criteria andRefundCompleteTimeIsNull() {
            addCriterion("refund_complete_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundCompleteTimeIsNotNull() {
            addCriterion("refund_complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundCompleteTimeEqualTo(Date value) {
            addCriterion("refund_complete_time =", value, "refundCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRefundCompleteTimeNotEqualTo(Date value) {
            addCriterion("refund_complete_time <>", value, "refundCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRefundCompleteTimeGreaterThan(Date value) {
            addCriterion("refund_complete_time >", value, "refundCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRefundCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_complete_time >=", value, "refundCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRefundCompleteTimeLessThan(Date value) {
            addCriterion("refund_complete_time <", value, "refundCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRefundCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_complete_time <=", value, "refundCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRefundCompleteTimeIn(List<Date> values) {
            addCriterion("refund_complete_time in", values, "refundCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRefundCompleteTimeNotIn(List<Date> values) {
            addCriterion("refund_complete_time not in", values, "refundCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRefundCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("refund_complete_time between", value1, value2, "refundCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRefundCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_complete_time not between", value1, value2, "refundCompleteTime");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdIsNull() {
            addCriterion("request_apply_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdIsNotNull() {
            addCriterion("request_apply_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdEqualTo(String value) {
            addCriterion("request_apply_user_id =", value, "requestApplyUserId");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdNotEqualTo(String value) {
            addCriterion("request_apply_user_id <>", value, "requestApplyUserId");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdGreaterThan(String value) {
            addCriterion("request_apply_user_id >", value, "requestApplyUserId");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("request_apply_user_id >=", value, "requestApplyUserId");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdLessThan(String value) {
            addCriterion("request_apply_user_id <", value, "requestApplyUserId");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdLessThanOrEqualTo(String value) {
            addCriterion("request_apply_user_id <=", value, "requestApplyUserId");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdLike(String value) {
            addCriterion("request_apply_user_id like", value, "requestApplyUserId");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdNotLike(String value) {
            addCriterion("request_apply_user_id not like", value, "requestApplyUserId");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdIn(List<String> values) {
            addCriterion("request_apply_user_id in", values, "requestApplyUserId");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdNotIn(List<String> values) {
            addCriterion("request_apply_user_id not in", values, "requestApplyUserId");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdBetween(String value1, String value2) {
            addCriterion("request_apply_user_id between", value1, value2, "requestApplyUserId");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserIdNotBetween(String value1, String value2) {
            addCriterion("request_apply_user_id not between", value1, value2, "requestApplyUserId");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameIsNull() {
            addCriterion("request_apply_user_name is null");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameIsNotNull() {
            addCriterion("request_apply_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameEqualTo(String value) {
            addCriterion("request_apply_user_name =", value, "requestApplyUserName");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameNotEqualTo(String value) {
            addCriterion("request_apply_user_name <>", value, "requestApplyUserName");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameGreaterThan(String value) {
            addCriterion("request_apply_user_name >", value, "requestApplyUserName");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("request_apply_user_name >=", value, "requestApplyUserName");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameLessThan(String value) {
            addCriterion("request_apply_user_name <", value, "requestApplyUserName");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameLessThanOrEqualTo(String value) {
            addCriterion("request_apply_user_name <=", value, "requestApplyUserName");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameLike(String value) {
            addCriterion("request_apply_user_name like", value, "requestApplyUserName");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameNotLike(String value) {
            addCriterion("request_apply_user_name not like", value, "requestApplyUserName");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameIn(List<String> values) {
            addCriterion("request_apply_user_name in", values, "requestApplyUserName");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameNotIn(List<String> values) {
            addCriterion("request_apply_user_name not in", values, "requestApplyUserName");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameBetween(String value1, String value2) {
            addCriterion("request_apply_user_name between", value1, value2, "requestApplyUserName");
            return (Criteria) this;
        }

        public Criteria andRequestApplyUserNameNotBetween(String value1, String value2) {
            addCriterion("request_apply_user_name not between", value1, value2, "requestApplyUserName");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIsNull() {
            addCriterion("refund_reason is null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIsNotNull() {
            addCriterion("refund_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRefundReasonEqualTo(String value) {
            addCriterion("refund_reason =", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotEqualTo(String value) {
            addCriterion("refund_reason <>", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThan(String value) {
            addCriterion("refund_reason >", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonGreaterThanOrEqualTo(String value) {
            addCriterion("refund_reason >=", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThan(String value) {
            addCriterion("refund_reason <", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLessThanOrEqualTo(String value) {
            addCriterion("refund_reason <=", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonLike(String value) {
            addCriterion("refund_reason like", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotLike(String value) {
            addCriterion("refund_reason not like", value, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonIn(List<String> values) {
            addCriterion("refund_reason in", values, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotIn(List<String> values) {
            addCriterion("refund_reason not in", values, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonBetween(String value1, String value2) {
            addCriterion("refund_reason between", value1, value2, "refundReason");
            return (Criteria) this;
        }

        public Criteria andRefundReasonNotBetween(String value1, String value2) {
            addCriterion("refund_reason not between", value1, value2, "refundReason");
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