package com.example.demo.mybaties.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IadtCpiNaciTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IadtCpiNaciTotalExample() {
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

        public Criteria andIadtcpiadtypIsNull() {
            addCriterion("iadtcpiadtyp is null");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadtypIsNotNull() {
            addCriterion("iadtcpiadtyp is not null");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadtypEqualTo(String value) {
            addCriterion("iadtcpiadtyp =", value, "iadtcpiadtyp");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadtypNotEqualTo(String value) {
            addCriterion("iadtcpiadtyp <>", value, "iadtcpiadtyp");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadtypGreaterThan(String value) {
            addCriterion("iadtcpiadtyp >", value, "iadtcpiadtyp");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadtypGreaterThanOrEqualTo(String value) {
            addCriterion("iadtcpiadtyp >=", value, "iadtcpiadtyp");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadtypLessThan(String value) {
            addCriterion("iadtcpiadtyp <", value, "iadtcpiadtyp");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadtypLessThanOrEqualTo(String value) {
            addCriterion("iadtcpiadtyp <=", value, "iadtcpiadtyp");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadtypLike(String value) {
            addCriterion("iadtcpiadtyp like", value, "iadtcpiadtyp");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadtypNotLike(String value) {
            addCriterion("iadtcpiadtyp not like", value, "iadtcpiadtyp");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadtypIn(List<String> values) {
            addCriterion("iadtcpiadtyp in", values, "iadtcpiadtyp");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadtypNotIn(List<String> values) {
            addCriterion("iadtcpiadtyp not in", values, "iadtcpiadtyp");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadtypBetween(String value1, String value2) {
            addCriterion("iadtcpiadtyp between", value1, value2, "iadtcpiadtyp");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadtypNotBetween(String value1, String value2) {
            addCriterion("iadtcpiadtyp not between", value1, value2, "iadtcpiadtyp");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverIsNull() {
            addCriterion("iadtcpiadver is null");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverIsNotNull() {
            addCriterion("iadtcpiadver is not null");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverEqualTo(String value) {
            addCriterion("iadtcpiadver =", value, "iadtcpiadver");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverNotEqualTo(String value) {
            addCriterion("iadtcpiadver <>", value, "iadtcpiadver");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverGreaterThan(String value) {
            addCriterion("iadtcpiadver >", value, "iadtcpiadver");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverGreaterThanOrEqualTo(String value) {
            addCriterion("iadtcpiadver >=", value, "iadtcpiadver");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverLessThan(String value) {
            addCriterion("iadtcpiadver <", value, "iadtcpiadver");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverLessThanOrEqualTo(String value) {
            addCriterion("iadtcpiadver <=", value, "iadtcpiadver");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverLike(String value) {
            addCriterion("iadtcpiadver like", value, "iadtcpiadver");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverNotLike(String value) {
            addCriterion("iadtcpiadver not like", value, "iadtcpiadver");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverIn(List<String> values) {
            addCriterion("iadtcpiadver in", values, "iadtcpiadver");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverNotIn(List<String> values) {
            addCriterion("iadtcpiadver not in", values, "iadtcpiadver");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverBetween(String value1, String value2) {
            addCriterion("iadtcpiadver between", value1, value2, "iadtcpiadver");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadverNotBetween(String value1, String value2) {
            addCriterion("iadtcpiadver not between", value1, value2, "iadtcpiadver");
            return (Criteria) this;
        }

        public Criteria andTotalKeyIsNull() {
            addCriterion("total_key is null");
            return (Criteria) this;
        }

        public Criteria andTotalKeyIsNotNull() {
            addCriterion("total_key is not null");
            return (Criteria) this;
        }

        public Criteria andTotalKeyEqualTo(String value) {
            addCriterion("total_key =", value, "totalKey");
            return (Criteria) this;
        }

        public Criteria andTotalKeyNotEqualTo(String value) {
            addCriterion("total_key <>", value, "totalKey");
            return (Criteria) this;
        }

        public Criteria andTotalKeyGreaterThan(String value) {
            addCriterion("total_key >", value, "totalKey");
            return (Criteria) this;
        }

        public Criteria andTotalKeyGreaterThanOrEqualTo(String value) {
            addCriterion("total_key >=", value, "totalKey");
            return (Criteria) this;
        }

        public Criteria andTotalKeyLessThan(String value) {
            addCriterion("total_key <", value, "totalKey");
            return (Criteria) this;
        }

        public Criteria andTotalKeyLessThanOrEqualTo(String value) {
            addCriterion("total_key <=", value, "totalKey");
            return (Criteria) this;
        }

        public Criteria andTotalKeyLike(String value) {
            addCriterion("total_key like", value, "totalKey");
            return (Criteria) this;
        }

        public Criteria andTotalKeyNotLike(String value) {
            addCriterion("total_key not like", value, "totalKey");
            return (Criteria) this;
        }

        public Criteria andTotalKeyIn(List<String> values) {
            addCriterion("total_key in", values, "totalKey");
            return (Criteria) this;
        }

        public Criteria andTotalKeyNotIn(List<String> values) {
            addCriterion("total_key not in", values, "totalKey");
            return (Criteria) this;
        }

        public Criteria andTotalKeyBetween(String value1, String value2) {
            addCriterion("total_key between", value1, value2, "totalKey");
            return (Criteria) this;
        }

        public Criteria andTotalKeyNotBetween(String value1, String value2) {
            addCriterion("total_key not between", value1, value2, "totalKey");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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