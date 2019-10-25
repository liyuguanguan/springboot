package com.example.demo.mybaties.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IadtCpiNaciDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IadtCpiNaciDetailExample() {
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

        public Criteria andIadtcpiadurlIsNull() {
            addCriterion("iadtcpiadurl is null");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadurlIsNotNull() {
            addCriterion("iadtcpiadurl is not null");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadurlEqualTo(String value) {
            addCriterion("iadtcpiadurl =", value, "iadtcpiadurl");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadurlNotEqualTo(String value) {
            addCriterion("iadtcpiadurl <>", value, "iadtcpiadurl");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadurlGreaterThan(String value) {
            addCriterion("iadtcpiadurl >", value, "iadtcpiadurl");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadurlGreaterThanOrEqualTo(String value) {
            addCriterion("iadtcpiadurl >=", value, "iadtcpiadurl");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadurlLessThan(String value) {
            addCriterion("iadtcpiadurl <", value, "iadtcpiadurl");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadurlLessThanOrEqualTo(String value) {
            addCriterion("iadtcpiadurl <=", value, "iadtcpiadurl");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadurlLike(String value) {
            addCriterion("iadtcpiadurl like", value, "iadtcpiadurl");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadurlNotLike(String value) {
            addCriterion("iadtcpiadurl not like", value, "iadtcpiadurl");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadurlIn(List<String> values) {
            addCriterion("iadtcpiadurl in", values, "iadtcpiadurl");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadurlNotIn(List<String> values) {
            addCriterion("iadtcpiadurl not in", values, "iadtcpiadurl");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadurlBetween(String value1, String value2) {
            addCriterion("iadtcpiadurl between", value1, value2, "iadtcpiadurl");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadurlNotBetween(String value1, String value2) {
            addCriterion("iadtcpiadurl not between", value1, value2, "iadtcpiadurl");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkIsNull() {
            addCriterion("iadtcpiadclk is null");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkIsNotNull() {
            addCriterion("iadtcpiadclk is not null");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkEqualTo(String value) {
            addCriterion("iadtcpiadclk =", value, "iadtcpiadclk");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkNotEqualTo(String value) {
            addCriterion("iadtcpiadclk <>", value, "iadtcpiadclk");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkGreaterThan(String value) {
            addCriterion("iadtcpiadclk >", value, "iadtcpiadclk");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkGreaterThanOrEqualTo(String value) {
            addCriterion("iadtcpiadclk >=", value, "iadtcpiadclk");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkLessThan(String value) {
            addCriterion("iadtcpiadclk <", value, "iadtcpiadclk");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkLessThanOrEqualTo(String value) {
            addCriterion("iadtcpiadclk <=", value, "iadtcpiadclk");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkLike(String value) {
            addCriterion("iadtcpiadclk like", value, "iadtcpiadclk");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkNotLike(String value) {
            addCriterion("iadtcpiadclk not like", value, "iadtcpiadclk");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkIn(List<String> values) {
            addCriterion("iadtcpiadclk in", values, "iadtcpiadclk");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkNotIn(List<String> values) {
            addCriterion("iadtcpiadclk not in", values, "iadtcpiadclk");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkBetween(String value1, String value2) {
            addCriterion("iadtcpiadclk between", value1, value2, "iadtcpiadclk");
            return (Criteria) this;
        }

        public Criteria andIadtcpiadclkNotBetween(String value1, String value2) {
            addCriterion("iadtcpiadclk not between", value1, value2, "iadtcpiadclk");
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

        public Criteria andTotalIdIsNull() {
            addCriterion("total_id is null");
            return (Criteria) this;
        }

        public Criteria andTotalIdIsNotNull() {
            addCriterion("total_id is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIdEqualTo(Integer value) {
            addCriterion("total_id =", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdNotEqualTo(Integer value) {
            addCriterion("total_id <>", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdGreaterThan(Integer value) {
            addCriterion("total_id >", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_id >=", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdLessThan(Integer value) {
            addCriterion("total_id <", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdLessThanOrEqualTo(Integer value) {
            addCriterion("total_id <=", value, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdIn(List<Integer> values) {
            addCriterion("total_id in", values, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdNotIn(List<Integer> values) {
            addCriterion("total_id not in", values, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdBetween(Integer value1, Integer value2) {
            addCriterion("total_id between", value1, value2, "totalId");
            return (Criteria) this;
        }

        public Criteria andTotalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("total_id not between", value1, value2, "totalId");
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