package com.ehomepay.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestAVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestAVOExample() {
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

        public Criteria andPkIdIsNull() {
            addCriterion("PK_ID is null");
            return (Criteria) this;
        }

        public Criteria andPkIdIsNotNull() {
            addCriterion("PK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPkIdEqualTo(Long value) {
            addCriterion("PK_ID =", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotEqualTo(Long value) {
            addCriterion("PK_ID <>", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThan(Long value) {
            addCriterion("PK_ID >", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PK_ID >=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThan(Long value) {
            addCriterion("PK_ID <", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThanOrEqualTo(Long value) {
            addCriterion("PK_ID <=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdIn(List<Long> values) {
            addCriterion("PK_ID in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotIn(List<Long> values) {
            addCriterion("PK_ID not in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdBetween(Long value1, Long value2) {
            addCriterion("PK_ID between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotBetween(Long value1, Long value2) {
            addCriterion("PK_ID not between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andTAIsNull() {
            addCriterion("T_A is null");
            return (Criteria) this;
        }

        public Criteria andTAIsNotNull() {
            addCriterion("T_A is not null");
            return (Criteria) this;
        }

        public Criteria andTAEqualTo(String value) {
            addCriterion("T_A =", value, "tA");
            return (Criteria) this;
        }

        public Criteria andTANotEqualTo(String value) {
            addCriterion("T_A <>", value, "tA");
            return (Criteria) this;
        }

        public Criteria andTAGreaterThan(String value) {
            addCriterion("T_A >", value, "tA");
            return (Criteria) this;
        }

        public Criteria andTAGreaterThanOrEqualTo(String value) {
            addCriterion("T_A >=", value, "tA");
            return (Criteria) this;
        }

        public Criteria andTALessThan(String value) {
            addCriterion("T_A <", value, "tA");
            return (Criteria) this;
        }

        public Criteria andTALessThanOrEqualTo(String value) {
            addCriterion("T_A <=", value, "tA");
            return (Criteria) this;
        }

        public Criteria andTALike(String value) {
            addCriterion("T_A like", value, "tA");
            return (Criteria) this;
        }

        public Criteria andTANotLike(String value) {
            addCriterion("T_A not like", value, "tA");
            return (Criteria) this;
        }

        public Criteria andTAIn(List<String> values) {
            addCriterion("T_A in", values, "tA");
            return (Criteria) this;
        }

        public Criteria andTANotIn(List<String> values) {
            addCriterion("T_A not in", values, "tA");
            return (Criteria) this;
        }

        public Criteria andTABetween(String value1, String value2) {
            addCriterion("T_A between", value1, value2, "tA");
            return (Criteria) this;
        }

        public Criteria andTANotBetween(String value1, String value2) {
            addCriterion("T_A not between", value1, value2, "tA");
            return (Criteria) this;
        }

        public Criteria andTBIsNull() {
            addCriterion("T_B is null");
            return (Criteria) this;
        }

        public Criteria andTBIsNotNull() {
            addCriterion("T_B is not null");
            return (Criteria) this;
        }

        public Criteria andTBEqualTo(String value) {
            addCriterion("T_B =", value, "tB");
            return (Criteria) this;
        }

        public Criteria andTBNotEqualTo(String value) {
            addCriterion("T_B <>", value, "tB");
            return (Criteria) this;
        }

        public Criteria andTBGreaterThan(String value) {
            addCriterion("T_B >", value, "tB");
            return (Criteria) this;
        }

        public Criteria andTBGreaterThanOrEqualTo(String value) {
            addCriterion("T_B >=", value, "tB");
            return (Criteria) this;
        }

        public Criteria andTBLessThan(String value) {
            addCriterion("T_B <", value, "tB");
            return (Criteria) this;
        }

        public Criteria andTBLessThanOrEqualTo(String value) {
            addCriterion("T_B <=", value, "tB");
            return (Criteria) this;
        }

        public Criteria andTBLike(String value) {
            addCriterion("T_B like", value, "tB");
            return (Criteria) this;
        }

        public Criteria andTBNotLike(String value) {
            addCriterion("T_B not like", value, "tB");
            return (Criteria) this;
        }

        public Criteria andTBIn(List<String> values) {
            addCriterion("T_B in", values, "tB");
            return (Criteria) this;
        }

        public Criteria andTBNotIn(List<String> values) {
            addCriterion("T_B not in", values, "tB");
            return (Criteria) this;
        }

        public Criteria andTBBetween(String value1, String value2) {
            addCriterion("T_B between", value1, value2, "tB");
            return (Criteria) this;
        }

        public Criteria andTBNotBetween(String value1, String value2) {
            addCriterion("T_B not between", value1, value2, "tB");
            return (Criteria) this;
        }

        public Criteria andTCIsNull() {
            addCriterion("T_C is null");
            return (Criteria) this;
        }

        public Criteria andTCIsNotNull() {
            addCriterion("T_C is not null");
            return (Criteria) this;
        }

        public Criteria andTCEqualTo(String value) {
            addCriterion("T_C =", value, "tC");
            return (Criteria) this;
        }

        public Criteria andTCNotEqualTo(String value) {
            addCriterion("T_C <>", value, "tC");
            return (Criteria) this;
        }

        public Criteria andTCGreaterThan(String value) {
            addCriterion("T_C >", value, "tC");
            return (Criteria) this;
        }

        public Criteria andTCGreaterThanOrEqualTo(String value) {
            addCriterion("T_C >=", value, "tC");
            return (Criteria) this;
        }

        public Criteria andTCLessThan(String value) {
            addCriterion("T_C <", value, "tC");
            return (Criteria) this;
        }

        public Criteria andTCLessThanOrEqualTo(String value) {
            addCriterion("T_C <=", value, "tC");
            return (Criteria) this;
        }

        public Criteria andTCLike(String value) {
            addCriterion("T_C like", value, "tC");
            return (Criteria) this;
        }

        public Criteria andTCNotLike(String value) {
            addCriterion("T_C not like", value, "tC");
            return (Criteria) this;
        }

        public Criteria andTCIn(List<String> values) {
            addCriterion("T_C in", values, "tC");
            return (Criteria) this;
        }

        public Criteria andTCNotIn(List<String> values) {
            addCriterion("T_C not in", values, "tC");
            return (Criteria) this;
        }

        public Criteria andTCBetween(String value1, String value2) {
            addCriterion("T_C between", value1, value2, "tC");
            return (Criteria) this;
        }

        public Criteria andTCNotBetween(String value1, String value2) {
            addCriterion("T_C not between", value1, value2, "tC");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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