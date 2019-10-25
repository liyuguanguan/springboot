package com.example.demo.mybaties.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IadtCpiNaciExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IadtCpiNaciExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCpinaviIsNull() {
            addCriterion("cpinavi is null");
            return (Criteria) this;
        }

        public Criteria andCpinaviIsNotNull() {
            addCriterion("cpinavi is not null");
            return (Criteria) this;
        }

        public Criteria andCpinaviEqualTo(String value) {
            addCriterion("cpinavi =", value, "cpinavi");
            return (Criteria) this;
        }

        public Criteria andCpinaviNotEqualTo(String value) {
            addCriterion("cpinavi <>", value, "cpinavi");
            return (Criteria) this;
        }

        public Criteria andCpinaviGreaterThan(String value) {
            addCriterion("cpinavi >", value, "cpinavi");
            return (Criteria) this;
        }

        public Criteria andCpinaviGreaterThanOrEqualTo(String value) {
            addCriterion("cpinavi >=", value, "cpinavi");
            return (Criteria) this;
        }

        public Criteria andCpinaviLessThan(String value) {
            addCriterion("cpinavi <", value, "cpinavi");
            return (Criteria) this;
        }

        public Criteria andCpinaviLessThanOrEqualTo(String value) {
            addCriterion("cpinavi <=", value, "cpinavi");
            return (Criteria) this;
        }

        public Criteria andCpinaviLike(String value) {
            addCriterion("cpinavi like", value, "cpinavi");
            return (Criteria) this;
        }

        public Criteria andCpinaviNotLike(String value) {
            addCriterion("cpinavi not like", value, "cpinavi");
            return (Criteria) this;
        }

        public Criteria andCpinaviIn(List<String> values) {
            addCriterion("cpinavi in", values, "cpinavi");
            return (Criteria) this;
        }

        public Criteria andCpinaviNotIn(List<String> values) {
            addCriterion("cpinavi not in", values, "cpinavi");
            return (Criteria) this;
        }

        public Criteria andCpinaviBetween(String value1, String value2) {
            addCriterion("cpinavi between", value1, value2, "cpinavi");
            return (Criteria) this;
        }

        public Criteria andCpinaviNotBetween(String value1, String value2) {
            addCriterion("cpinavi not between", value1, value2, "cpinavi");
            return (Criteria) this;
        }

        public Criteria andNaciTypeIsNull() {
            addCriterion("naci_type is null");
            return (Criteria) this;
        }

        public Criteria andNaciTypeIsNotNull() {
            addCriterion("naci_type is not null");
            return (Criteria) this;
        }

        public Criteria andNaciTypeEqualTo(String value) {
            addCriterion("naci_type =", value, "naciType");
            return (Criteria) this;
        }

        public Criteria andNaciTypeNotEqualTo(String value) {
            addCriterion("naci_type <>", value, "naciType");
            return (Criteria) this;
        }

        public Criteria andNaciTypeGreaterThan(String value) {
            addCriterion("naci_type >", value, "naciType");
            return (Criteria) this;
        }

        public Criteria andNaciTypeGreaterThanOrEqualTo(String value) {
            addCriterion("naci_type >=", value, "naciType");
            return (Criteria) this;
        }

        public Criteria andNaciTypeLessThan(String value) {
            addCriterion("naci_type <", value, "naciType");
            return (Criteria) this;
        }

        public Criteria andNaciTypeLessThanOrEqualTo(String value) {
            addCriterion("naci_type <=", value, "naciType");
            return (Criteria) this;
        }

        public Criteria andNaciTypeLike(String value) {
            addCriterion("naci_type like", value, "naciType");
            return (Criteria) this;
        }

        public Criteria andNaciTypeNotLike(String value) {
            addCriterion("naci_type not like", value, "naciType");
            return (Criteria) this;
        }

        public Criteria andNaciTypeIn(List<String> values) {
            addCriterion("naci_type in", values, "naciType");
            return (Criteria) this;
        }

        public Criteria andNaciTypeNotIn(List<String> values) {
            addCriterion("naci_type not in", values, "naciType");
            return (Criteria) this;
        }

        public Criteria andNaciTypeBetween(String value1, String value2) {
            addCriterion("naci_type between", value1, value2, "naciType");
            return (Criteria) this;
        }

        public Criteria andNaciTypeNotBetween(String value1, String value2) {
            addCriterion("naci_type not between", value1, value2, "naciType");
            return (Criteria) this;
        }

        public Criteria andNaciKeyIsNull() {
            addCriterion("naci_key is null");
            return (Criteria) this;
        }

        public Criteria andNaciKeyIsNotNull() {
            addCriterion("naci_key is not null");
            return (Criteria) this;
        }

        public Criteria andNaciKeyEqualTo(String value) {
            addCriterion("naci_key =", value, "naciKey");
            return (Criteria) this;
        }

        public Criteria andNaciKeyNotEqualTo(String value) {
            addCriterion("naci_key <>", value, "naciKey");
            return (Criteria) this;
        }

        public Criteria andNaciKeyGreaterThan(String value) {
            addCriterion("naci_key >", value, "naciKey");
            return (Criteria) this;
        }

        public Criteria andNaciKeyGreaterThanOrEqualTo(String value) {
            addCriterion("naci_key >=", value, "naciKey");
            return (Criteria) this;
        }

        public Criteria andNaciKeyLessThan(String value) {
            addCriterion("naci_key <", value, "naciKey");
            return (Criteria) this;
        }

        public Criteria andNaciKeyLessThanOrEqualTo(String value) {
            addCriterion("naci_key <=", value, "naciKey");
            return (Criteria) this;
        }

        public Criteria andNaciKeyLike(String value) {
            addCriterion("naci_key like", value, "naciKey");
            return (Criteria) this;
        }

        public Criteria andNaciKeyNotLike(String value) {
            addCriterion("naci_key not like", value, "naciKey");
            return (Criteria) this;
        }

        public Criteria andNaciKeyIn(List<String> values) {
            addCriterion("naci_key in", values, "naciKey");
            return (Criteria) this;
        }

        public Criteria andNaciKeyNotIn(List<String> values) {
            addCriterion("naci_key not in", values, "naciKey");
            return (Criteria) this;
        }

        public Criteria andNaciKeyBetween(String value1, String value2) {
            addCriterion("naci_key between", value1, value2, "naciKey");
            return (Criteria) this;
        }

        public Criteria andNaciKeyNotBetween(String value1, String value2) {
            addCriterion("naci_key not between", value1, value2, "naciKey");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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