package com.example.demo.mybaties.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdAdvertingDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdAdvertingDataExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDatestrIsNull() {
            addCriterion("datestr is null");
            return (Criteria) this;
        }

        public Criteria andDatestrIsNotNull() {
            addCriterion("datestr is not null");
            return (Criteria) this;
        }

        public Criteria andDatestrEqualTo(String value) {
            addCriterion("datestr =", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotEqualTo(String value) {
            addCriterion("datestr <>", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrGreaterThan(String value) {
            addCriterion("datestr >", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrGreaterThanOrEqualTo(String value) {
            addCriterion("datestr >=", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrLessThan(String value) {
            addCriterion("datestr <", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrLessThanOrEqualTo(String value) {
            addCriterion("datestr <=", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrLike(String value) {
            addCriterion("datestr like", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotLike(String value) {
            addCriterion("datestr not like", value, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrIn(List<String> values) {
            addCriterion("datestr in", values, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotIn(List<String> values) {
            addCriterion("datestr not in", values, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrBetween(String value1, String value2) {
            addCriterion("datestr between", value1, value2, "datestr");
            return (Criteria) this;
        }

        public Criteria andDatestrNotBetween(String value1, String value2) {
            addCriterion("datestr not between", value1, value2, "datestr");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(Byte value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(Byte value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(Byte value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(Byte value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(Byte value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(Byte value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<Byte> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<Byte> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(Byte value1, Byte value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(Byte value1, Byte value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andHahaIsNull() {
            addCriterion("haha is null");
            return (Criteria) this;
        }

        public Criteria andHahaIsNotNull() {
            addCriterion("haha is not null");
            return (Criteria) this;
        }

        public Criteria andHahaEqualTo(Boolean value) {
            addCriterion("haha =", value, "haha");
            return (Criteria) this;
        }

        public Criteria andHahaNotEqualTo(Boolean value) {
            addCriterion("haha <>", value, "haha");
            return (Criteria) this;
        }

        public Criteria andHahaGreaterThan(Boolean value) {
            addCriterion("haha >", value, "haha");
            return (Criteria) this;
        }

        public Criteria andHahaGreaterThanOrEqualTo(Boolean value) {
            addCriterion("haha >=", value, "haha");
            return (Criteria) this;
        }

        public Criteria andHahaLessThan(Boolean value) {
            addCriterion("haha <", value, "haha");
            return (Criteria) this;
        }

        public Criteria andHahaLessThanOrEqualTo(Boolean value) {
            addCriterion("haha <=", value, "haha");
            return (Criteria) this;
        }

        public Criteria andHahaIn(List<Boolean> values) {
            addCriterion("haha in", values, "haha");
            return (Criteria) this;
        }

        public Criteria andHahaNotIn(List<Boolean> values) {
            addCriterion("haha not in", values, "haha");
            return (Criteria) this;
        }

        public Criteria andHahaBetween(Boolean value1, Boolean value2) {
            addCriterion("haha between", value1, value2, "haha");
            return (Criteria) this;
        }

        public Criteria andHahaNotBetween(Boolean value1, Boolean value2) {
            addCriterion("haha not between", value1, value2, "haha");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNull() {
            addCriterion("position_id is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("position_id is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(Integer value) {
            addCriterion("position_id =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(Integer value) {
            addCriterion("position_id <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(Integer value) {
            addCriterion("position_id >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_id >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(Integer value) {
            addCriterion("position_id <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("position_id <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<Integer> values) {
            addCriterion("position_id in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<Integer> values) {
            addCriterion("position_id not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(Integer value1, Integer value2) {
            addCriterion("position_id between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("position_id not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdIsNull() {
            addCriterion("third_ad_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdIsNotNull() {
            addCriterion("third_ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdEqualTo(String value) {
            addCriterion("third_ad_id =", value, "thirdAdId");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdNotEqualTo(String value) {
            addCriterion("third_ad_id <>", value, "thirdAdId");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdGreaterThan(String value) {
            addCriterion("third_ad_id >", value, "thirdAdId");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_ad_id >=", value, "thirdAdId");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdLessThan(String value) {
            addCriterion("third_ad_id <", value, "thirdAdId");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdLessThanOrEqualTo(String value) {
            addCriterion("third_ad_id <=", value, "thirdAdId");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdLike(String value) {
            addCriterion("third_ad_id like", value, "thirdAdId");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdNotLike(String value) {
            addCriterion("third_ad_id not like", value, "thirdAdId");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdIn(List<String> values) {
            addCriterion("third_ad_id in", values, "thirdAdId");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdNotIn(List<String> values) {
            addCriterion("third_ad_id not in", values, "thirdAdId");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdBetween(String value1, String value2) {
            addCriterion("third_ad_id between", value1, value2, "thirdAdId");
            return (Criteria) this;
        }

        public Criteria andThirdAdIdNotBetween(String value1, String value2) {
            addCriterion("third_ad_id not between", value1, value2, "thirdAdId");
            return (Criteria) this;
        }

        public Criteria andShowTypeIsNull() {
            addCriterion("show_type is null");
            return (Criteria) this;
        }

        public Criteria andShowTypeIsNotNull() {
            addCriterion("show_type is not null");
            return (Criteria) this;
        }

        public Criteria andShowTypeEqualTo(Short value) {
            addCriterion("show_type =", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotEqualTo(Short value) {
            addCriterion("show_type <>", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThan(Short value) {
            addCriterion("show_type >", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("show_type >=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThan(Short value) {
            addCriterion("show_type <", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThanOrEqualTo(Short value) {
            addCriterion("show_type <=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeIn(List<Short> values) {
            addCriterion("show_type in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotIn(List<Short> values) {
            addCriterion("show_type not in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeBetween(Short value1, Short value2) {
            addCriterion("show_type between", value1, value2, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotBetween(Short value1, Short value2) {
            addCriterion("show_type not between", value1, value2, "showType");
            return (Criteria) this;
        }

        public Criteria andAdvertIdIsNull() {
            addCriterion("advert_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvertIdIsNotNull() {
            addCriterion("advert_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertIdEqualTo(Long value) {
            addCriterion("advert_id =", value, "advertId");
            return (Criteria) this;
        }

        public Criteria andAdvertIdNotEqualTo(Long value) {
            addCriterion("advert_id <>", value, "advertId");
            return (Criteria) this;
        }

        public Criteria andAdvertIdGreaterThan(Long value) {
            addCriterion("advert_id >", value, "advertId");
            return (Criteria) this;
        }

        public Criteria andAdvertIdGreaterThanOrEqualTo(Long value) {
            addCriterion("advert_id >=", value, "advertId");
            return (Criteria) this;
        }

        public Criteria andAdvertIdLessThan(Long value) {
            addCriterion("advert_id <", value, "advertId");
            return (Criteria) this;
        }

        public Criteria andAdvertIdLessThanOrEqualTo(Long value) {
            addCriterion("advert_id <=", value, "advertId");
            return (Criteria) this;
        }

        public Criteria andAdvertIdIn(List<Long> values) {
            addCriterion("advert_id in", values, "advertId");
            return (Criteria) this;
        }

        public Criteria andAdvertIdNotIn(List<Long> values) {
            addCriterion("advert_id not in", values, "advertId");
            return (Criteria) this;
        }

        public Criteria andAdvertIdBetween(Long value1, Long value2) {
            addCriterion("advert_id between", value1, value2, "advertId");
            return (Criteria) this;
        }

        public Criteria andAdvertIdNotBetween(Long value1, Long value2) {
            addCriterion("advert_id not between", value1, value2, "advertId");
            return (Criteria) this;
        }

        public Criteria andAdTypeIsNull() {
            addCriterion("ad_type is null");
            return (Criteria) this;
        }

        public Criteria andAdTypeIsNotNull() {
            addCriterion("ad_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdTypeEqualTo(Integer value) {
            addCriterion("ad_type =", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotEqualTo(Integer value) {
            addCriterion("ad_type <>", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeGreaterThan(Integer value) {
            addCriterion("ad_type >", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_type >=", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeLessThan(Integer value) {
            addCriterion("ad_type <", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ad_type <=", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeIn(List<Integer> values) {
            addCriterion("ad_type in", values, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotIn(List<Integer> values) {
            addCriterion("ad_type not in", values, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeBetween(Integer value1, Integer value2) {
            addCriterion("ad_type between", value1, value2, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_type not between", value1, value2, "adType");
            return (Criteria) this;
        }

        public Criteria andAdPropertyTypeIsNull() {
            addCriterion("ad_property_type is null");
            return (Criteria) this;
        }

        public Criteria andAdPropertyTypeIsNotNull() {
            addCriterion("ad_property_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdPropertyTypeEqualTo(Integer value) {
            addCriterion("ad_property_type =", value, "adPropertyType");
            return (Criteria) this;
        }

        public Criteria andAdPropertyTypeNotEqualTo(Integer value) {
            addCriterion("ad_property_type <>", value, "adPropertyType");
            return (Criteria) this;
        }

        public Criteria andAdPropertyTypeGreaterThan(Integer value) {
            addCriterion("ad_property_type >", value, "adPropertyType");
            return (Criteria) this;
        }

        public Criteria andAdPropertyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_property_type >=", value, "adPropertyType");
            return (Criteria) this;
        }

        public Criteria andAdPropertyTypeLessThan(Integer value) {
            addCriterion("ad_property_type <", value, "adPropertyType");
            return (Criteria) this;
        }

        public Criteria andAdPropertyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ad_property_type <=", value, "adPropertyType");
            return (Criteria) this;
        }

        public Criteria andAdPropertyTypeIn(List<Integer> values) {
            addCriterion("ad_property_type in", values, "adPropertyType");
            return (Criteria) this;
        }

        public Criteria andAdPropertyTypeNotIn(List<Integer> values) {
            addCriterion("ad_property_type not in", values, "adPropertyType");
            return (Criteria) this;
        }

        public Criteria andAdPropertyTypeBetween(Integer value1, Integer value2) {
            addCriterion("ad_property_type between", value1, value2, "adPropertyType");
            return (Criteria) this;
        }

        public Criteria andAdPropertyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_property_type not between", value1, value2, "adPropertyType");
            return (Criteria) this;
        }

        public Criteria andAdPurposeIsNull() {
            addCriterion("ad_purpose is null");
            return (Criteria) this;
        }

        public Criteria andAdPurposeIsNotNull() {
            addCriterion("ad_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andAdPurposeEqualTo(Integer value) {
            addCriterion("ad_purpose =", value, "adPurpose");
            return (Criteria) this;
        }

        public Criteria andAdPurposeNotEqualTo(Integer value) {
            addCriterion("ad_purpose <>", value, "adPurpose");
            return (Criteria) this;
        }

        public Criteria andAdPurposeGreaterThan(Integer value) {
            addCriterion("ad_purpose >", value, "adPurpose");
            return (Criteria) this;
        }

        public Criteria andAdPurposeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_purpose >=", value, "adPurpose");
            return (Criteria) this;
        }

        public Criteria andAdPurposeLessThan(Integer value) {
            addCriterion("ad_purpose <", value, "adPurpose");
            return (Criteria) this;
        }

        public Criteria andAdPurposeLessThanOrEqualTo(Integer value) {
            addCriterion("ad_purpose <=", value, "adPurpose");
            return (Criteria) this;
        }

        public Criteria andAdPurposeIn(List<Integer> values) {
            addCriterion("ad_purpose in", values, "adPurpose");
            return (Criteria) this;
        }

        public Criteria andAdPurposeNotIn(List<Integer> values) {
            addCriterion("ad_purpose not in", values, "adPurpose");
            return (Criteria) this;
        }

        public Criteria andAdPurposeBetween(Integer value1, Integer value2) {
            addCriterion("ad_purpose between", value1, value2, "adPurpose");
            return (Criteria) this;
        }

        public Criteria andAdPurposeNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_purpose not between", value1, value2, "adPurpose");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdIsNull() {
            addCriterion("advertiser_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdIsNotNull() {
            addCriterion("advertiser_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdEqualTo(Integer value) {
            addCriterion("advertiser_id =", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdNotEqualTo(Integer value) {
            addCriterion("advertiser_id <>", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdGreaterThan(Integer value) {
            addCriterion("advertiser_id >", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("advertiser_id >=", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdLessThan(Integer value) {
            addCriterion("advertiser_id <", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdLessThanOrEqualTo(Integer value) {
            addCriterion("advertiser_id <=", value, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdIn(List<Integer> values) {
            addCriterion("advertiser_id in", values, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdNotIn(List<Integer> values) {
            addCriterion("advertiser_id not in", values, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdBetween(Integer value1, Integer value2) {
            addCriterion("advertiser_id between", value1, value2, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdvertiserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("advertiser_id not between", value1, value2, "advertiserId");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(Long value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(Long value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(Long value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(Long value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Long value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<Long> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<Long> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(Long value1, Long value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(Long value1, Long value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdShowIsNull() {
            addCriterion("ad_show is null");
            return (Criteria) this;
        }

        public Criteria andAdShowIsNotNull() {
            addCriterion("ad_show is not null");
            return (Criteria) this;
        }

        public Criteria andAdShowEqualTo(Integer value) {
            addCriterion("ad_show =", value, "adShow");
            return (Criteria) this;
        }

        public Criteria andAdShowNotEqualTo(Integer value) {
            addCriterion("ad_show <>", value, "adShow");
            return (Criteria) this;
        }

        public Criteria andAdShowGreaterThan(Integer value) {
            addCriterion("ad_show >", value, "adShow");
            return (Criteria) this;
        }

        public Criteria andAdShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_show >=", value, "adShow");
            return (Criteria) this;
        }

        public Criteria andAdShowLessThan(Integer value) {
            addCriterion("ad_show <", value, "adShow");
            return (Criteria) this;
        }

        public Criteria andAdShowLessThanOrEqualTo(Integer value) {
            addCriterion("ad_show <=", value, "adShow");
            return (Criteria) this;
        }

        public Criteria andAdShowIn(List<Integer> values) {
            addCriterion("ad_show in", values, "adShow");
            return (Criteria) this;
        }

        public Criteria andAdShowNotIn(List<Integer> values) {
            addCriterion("ad_show not in", values, "adShow");
            return (Criteria) this;
        }

        public Criteria andAdShowBetween(Integer value1, Integer value2) {
            addCriterion("ad_show between", value1, value2, "adShow");
            return (Criteria) this;
        }

        public Criteria andAdShowNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_show not between", value1, value2, "adShow");
            return (Criteria) this;
        }

        public Criteria andAdClickIsNull() {
            addCriterion("ad_click is null");
            return (Criteria) this;
        }

        public Criteria andAdClickIsNotNull() {
            addCriterion("ad_click is not null");
            return (Criteria) this;
        }

        public Criteria andAdClickEqualTo(Integer value) {
            addCriterion("ad_click =", value, "adClick");
            return (Criteria) this;
        }

        public Criteria andAdClickNotEqualTo(Integer value) {
            addCriterion("ad_click <>", value, "adClick");
            return (Criteria) this;
        }

        public Criteria andAdClickGreaterThan(Integer value) {
            addCriterion("ad_click >", value, "adClick");
            return (Criteria) this;
        }

        public Criteria andAdClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_click >=", value, "adClick");
            return (Criteria) this;
        }

        public Criteria andAdClickLessThan(Integer value) {
            addCriterion("ad_click <", value, "adClick");
            return (Criteria) this;
        }

        public Criteria andAdClickLessThanOrEqualTo(Integer value) {
            addCriterion("ad_click <=", value, "adClick");
            return (Criteria) this;
        }

        public Criteria andAdClickIn(List<Integer> values) {
            addCriterion("ad_click in", values, "adClick");
            return (Criteria) this;
        }

        public Criteria andAdClickNotIn(List<Integer> values) {
            addCriterion("ad_click not in", values, "adClick");
            return (Criteria) this;
        }

        public Criteria andAdClickBetween(Integer value1, Integer value2) {
            addCriterion("ad_click between", value1, value2, "adClick");
            return (Criteria) this;
        }

        public Criteria andAdClickNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_click not between", value1, value2, "adClick");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIsNull() {
            addCriterion("channel_rules is null");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIsNotNull() {
            addCriterion("channel_rules is not null");
            return (Criteria) this;
        }

        public Criteria andChannelRulesEqualTo(String value) {
            addCriterion("channel_rules =", value, "channelRules");
            return (Criteria) this;
        }

        public Criteria andChannelRulesNotEqualTo(String value) {
            addCriterion("channel_rules <>", value, "channelRules");
            return (Criteria) this;
        }

        public Criteria andChannelRulesGreaterThan(String value) {
            addCriterion("channel_rules >", value, "channelRules");
            return (Criteria) this;
        }

        public Criteria andChannelRulesGreaterThanOrEqualTo(String value) {
            addCriterion("channel_rules >=", value, "channelRules");
            return (Criteria) this;
        }

        public Criteria andChannelRulesLessThan(String value) {
            addCriterion("channel_rules <", value, "channelRules");
            return (Criteria) this;
        }

        public Criteria andChannelRulesLessThanOrEqualTo(String value) {
            addCriterion("channel_rules <=", value, "channelRules");
            return (Criteria) this;
        }

        public Criteria andChannelRulesLike(String value) {
            addCriterion("channel_rules like", value, "channelRules");
            return (Criteria) this;
        }

        public Criteria andChannelRulesNotLike(String value) {
            addCriterion("channel_rules not like", value, "channelRules");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIn(List<String> values) {
            addCriterion("channel_rules in", values, "channelRules");
            return (Criteria) this;
        }

        public Criteria andChannelRulesNotIn(List<String> values) {
            addCriterion("channel_rules not in", values, "channelRules");
            return (Criteria) this;
        }

        public Criteria andChannelRulesBetween(String value1, String value2) {
            addCriterion("channel_rules between", value1, value2, "channelRules");
            return (Criteria) this;
        }

        public Criteria andChannelRulesNotBetween(String value1, String value2) {
            addCriterion("channel_rules not between", value1, value2, "channelRules");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIdIsNull() {
            addCriterion("channel_rules_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIdIsNotNull() {
            addCriterion("channel_rules_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIdEqualTo(Integer value) {
            addCriterion("channel_rules_id =", value, "channelRulesId");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIdNotEqualTo(Integer value) {
            addCriterion("channel_rules_id <>", value, "channelRulesId");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIdGreaterThan(Integer value) {
            addCriterion("channel_rules_id >", value, "channelRulesId");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_rules_id >=", value, "channelRulesId");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIdLessThan(Integer value) {
            addCriterion("channel_rules_id <", value, "channelRulesId");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIdLessThanOrEqualTo(Integer value) {
            addCriterion("channel_rules_id <=", value, "channelRulesId");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIdIn(List<Integer> values) {
            addCriterion("channel_rules_id in", values, "channelRulesId");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIdNotIn(List<Integer> values) {
            addCriterion("channel_rules_id not in", values, "channelRulesId");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIdBetween(Integer value1, Integer value2) {
            addCriterion("channel_rules_id between", value1, value2, "channelRulesId");
            return (Criteria) this;
        }

        public Criteria andChannelRulesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_rules_id not between", value1, value2, "channelRulesId");
            return (Criteria) this;
        }

        public Criteria andLocationRulesIdIsNull() {
            addCriterion("location_rules_id is null");
            return (Criteria) this;
        }

        public Criteria andLocationRulesIdIsNotNull() {
            addCriterion("location_rules_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocationRulesIdEqualTo(Integer value) {
            addCriterion("location_rules_id =", value, "locationRulesId");
            return (Criteria) this;
        }

        public Criteria andLocationRulesIdNotEqualTo(Integer value) {
            addCriterion("location_rules_id <>", value, "locationRulesId");
            return (Criteria) this;
        }

        public Criteria andLocationRulesIdGreaterThan(Integer value) {
            addCriterion("location_rules_id >", value, "locationRulesId");
            return (Criteria) this;
        }

        public Criteria andLocationRulesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("location_rules_id >=", value, "locationRulesId");
            return (Criteria) this;
        }

        public Criteria andLocationRulesIdLessThan(Integer value) {
            addCriterion("location_rules_id <", value, "locationRulesId");
            return (Criteria) this;
        }

        public Criteria andLocationRulesIdLessThanOrEqualTo(Integer value) {
            addCriterion("location_rules_id <=", value, "locationRulesId");
            return (Criteria) this;
        }

        public Criteria andLocationRulesIdIn(List<Integer> values) {
            addCriterion("location_rules_id in", values, "locationRulesId");
            return (Criteria) this;
        }

        public Criteria andLocationRulesIdNotIn(List<Integer> values) {
            addCriterion("location_rules_id not in", values, "locationRulesId");
            return (Criteria) this;
        }

        public Criteria andLocationRulesIdBetween(Integer value1, Integer value2) {
            addCriterion("location_rules_id between", value1, value2, "locationRulesId");
            return (Criteria) this;
        }

        public Criteria andLocationRulesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("location_rules_id not between", value1, value2, "locationRulesId");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameIsNull() {
            addCriterion("location_rules_name is null");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameIsNotNull() {
            addCriterion("location_rules_name is not null");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameEqualTo(String value) {
            addCriterion("location_rules_name =", value, "locationRulesName");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameNotEqualTo(String value) {
            addCriterion("location_rules_name <>", value, "locationRulesName");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameGreaterThan(String value) {
            addCriterion("location_rules_name >", value, "locationRulesName");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameGreaterThanOrEqualTo(String value) {
            addCriterion("location_rules_name >=", value, "locationRulesName");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameLessThan(String value) {
            addCriterion("location_rules_name <", value, "locationRulesName");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameLessThanOrEqualTo(String value) {
            addCriterion("location_rules_name <=", value, "locationRulesName");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameLike(String value) {
            addCriterion("location_rules_name like", value, "locationRulesName");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameNotLike(String value) {
            addCriterion("location_rules_name not like", value, "locationRulesName");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameIn(List<String> values) {
            addCriterion("location_rules_name in", values, "locationRulesName");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameNotIn(List<String> values) {
            addCriterion("location_rules_name not in", values, "locationRulesName");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameBetween(String value1, String value2) {
            addCriterion("location_rules_name between", value1, value2, "locationRulesName");
            return (Criteria) this;
        }

        public Criteria andLocationRulesNameNotBetween(String value1, String value2) {
            addCriterion("location_rules_name not between", value1, value2, "locationRulesName");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeIsNull() {
            addCriterion("advert_type is null");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeIsNotNull() {
            addCriterion("advert_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeEqualTo(Byte value) {
            addCriterion("advert_type =", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeNotEqualTo(Byte value) {
            addCriterion("advert_type <>", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeGreaterThan(Byte value) {
            addCriterion("advert_type >", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("advert_type >=", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeLessThan(Byte value) {
            addCriterion("advert_type <", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeLessThanOrEqualTo(Byte value) {
            addCriterion("advert_type <=", value, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeIn(List<Byte> values) {
            addCriterion("advert_type in", values, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeNotIn(List<Byte> values) {
            addCriterion("advert_type not in", values, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeBetween(Byte value1, Byte value2) {
            addCriterion("advert_type between", value1, value2, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdvertTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("advert_type not between", value1, value2, "advertType");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNull() {
            addCriterion("ad_name is null");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNotNull() {
            addCriterion("ad_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdNameEqualTo(String value) {
            addCriterion("ad_name =", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotEqualTo(String value) {
            addCriterion("ad_name <>", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThan(String value) {
            addCriterion("ad_name >", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThanOrEqualTo(String value) {
            addCriterion("ad_name >=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThan(String value) {
            addCriterion("ad_name <", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThanOrEqualTo(String value) {
            addCriterion("ad_name <=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLike(String value) {
            addCriterion("ad_name like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotLike(String value) {
            addCriterion("ad_name not like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameIn(List<String> values) {
            addCriterion("ad_name in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotIn(List<String> values) {
            addCriterion("ad_name not in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameBetween(String value1, String value2) {
            addCriterion("ad_name between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotBetween(String value1, String value2) {
            addCriterion("ad_name not between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdClickRateIsNull() {
            addCriterion("ad_click_rate is null");
            return (Criteria) this;
        }

        public Criteria andAdClickRateIsNotNull() {
            addCriterion("ad_click_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAdClickRateEqualTo(Float value) {
            addCriterion("ad_click_rate =", value, "adClickRate");
            return (Criteria) this;
        }

        public Criteria andAdClickRateNotEqualTo(Float value) {
            addCriterion("ad_click_rate <>", value, "adClickRate");
            return (Criteria) this;
        }

        public Criteria andAdClickRateGreaterThan(Float value) {
            addCriterion("ad_click_rate >", value, "adClickRate");
            return (Criteria) this;
        }

        public Criteria andAdClickRateGreaterThanOrEqualTo(Float value) {
            addCriterion("ad_click_rate >=", value, "adClickRate");
            return (Criteria) this;
        }

        public Criteria andAdClickRateLessThan(Float value) {
            addCriterion("ad_click_rate <", value, "adClickRate");
            return (Criteria) this;
        }

        public Criteria andAdClickRateLessThanOrEqualTo(Float value) {
            addCriterion("ad_click_rate <=", value, "adClickRate");
            return (Criteria) this;
        }

        public Criteria andAdClickRateIn(List<Float> values) {
            addCriterion("ad_click_rate in", values, "adClickRate");
            return (Criteria) this;
        }

        public Criteria andAdClickRateNotIn(List<Float> values) {
            addCriterion("ad_click_rate not in", values, "adClickRate");
            return (Criteria) this;
        }

        public Criteria andAdClickRateBetween(Float value1, Float value2) {
            addCriterion("ad_click_rate between", value1, value2, "adClickRate");
            return (Criteria) this;
        }

        public Criteria andAdClickRateNotBetween(Float value1, Float value2) {
            addCriterion("ad_click_rate not between", value1, value2, "adClickRate");
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