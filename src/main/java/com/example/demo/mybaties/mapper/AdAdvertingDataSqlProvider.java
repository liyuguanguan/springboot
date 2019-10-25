package com.example.demo.mybaties.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.example.demo.mybaties.model.AdAdvertingData;
import com.example.demo.mybaties.model.AdAdvertingDataExample.Criteria;
import com.example.demo.mybaties.model.AdAdvertingDataExample.Criterion;
import com.example.demo.mybaties.model.AdAdvertingDataExample;
import java.util.List;
import java.util.Map;

public class AdAdvertingDataSqlProvider {

    public String countByExample(AdAdvertingDataExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("ad_adverting_data");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(AdAdvertingDataExample example) {
        BEGIN();
        DELETE_FROM("ad_adverting_data");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(AdAdvertingData record) {
        BEGIN();
        INSERT_INTO("ad_adverting_data");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getDatestr() != null) {
            VALUES("datestr", "#{datestr,jdbcType=VARCHAR}");
        }
        
        if (record.getPlatform() != null) {
            VALUES("platform", "#{platform,jdbcType=TINYINT}");
        }
        
        if (record.getHaha() != null) {
            VALUES("haha", "#{haha,jdbcType=BIT}");
        }
        
        if (record.getPositionId() != null) {
            VALUES("position_id", "#{positionId,jdbcType=INTEGER}");
        }
        
        if (record.getThirdAdId() != null) {
            VALUES("third_ad_id", "#{thirdAdId,jdbcType=VARCHAR}");
        }
        
        if (record.getShowType() != null) {
            VALUES("show_type", "#{showType,jdbcType=SMALLINT}");
        }
        
        if (record.getAdvertId() != null) {
            VALUES("advert_id", "#{advertId,jdbcType=BIGINT}");
        }
        
        if (record.getAdType() != null) {
            VALUES("ad_type", "#{adType,jdbcType=INTEGER}");
        }
        
        if (record.getAdPropertyType() != null) {
            VALUES("ad_property_type", "#{adPropertyType,jdbcType=INTEGER}");
        }
        
        if (record.getAdPurpose() != null) {
            VALUES("ad_purpose", "#{adPurpose,jdbcType=INTEGER}");
        }
        
        if (record.getAdvertiserId() != null) {
            VALUES("advertiser_id", "#{advertiserId,jdbcType=INTEGER}");
        }
        
        if (record.getAdId() != null) {
            VALUES("ad_id", "#{adId,jdbcType=BIGINT}");
        }
        
        if (record.getAdShow() != null) {
            VALUES("ad_show", "#{adShow,jdbcType=INTEGER}");
        }
        
        if (record.getAdClick() != null) {
            VALUES("ad_click", "#{adClick,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            VALUES("price", "#{price,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelRules() != null) {
            VALUES("channel_rules", "#{channelRules,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelRulesId() != null) {
            VALUES("channel_rules_id", "#{channelRulesId,jdbcType=INTEGER}");
        }
        
        if (record.getLocationRulesId() != null) {
            VALUES("location_rules_id", "#{locationRulesId,jdbcType=INTEGER}");
        }
        
        if (record.getLocationRulesName() != null) {
            VALUES("location_rules_name", "#{locationRulesName,jdbcType=VARCHAR}");
        }
        
        if (record.getAdvertType() != null) {
            VALUES("advert_type", "#{advertType,jdbcType=TINYINT}");
        }
        
        if (record.getAdName() != null) {
            VALUES("ad_name", "#{adName,jdbcType=VARCHAR}");
        }
        
        if (record.getAdClickRate() != null) {
            VALUES("ad_click_rate", "#{adClickRate,jdbcType=REAL}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(AdAdvertingDataExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("datestr");
        SELECT("platform");
        SELECT("haha");
        SELECT("position_id");
        SELECT("third_ad_id");
        SELECT("show_type");
        SELECT("advert_id");
        SELECT("ad_type");
        SELECT("ad_property_type");
        SELECT("ad_purpose");
        SELECT("advertiser_id");
        SELECT("ad_id");
        SELECT("ad_show");
        SELECT("ad_click");
        SELECT("price");
        SELECT("channel_rules");
        SELECT("channel_rules_id");
        SELECT("location_rules_id");
        SELECT("location_rules_name");
        SELECT("advert_type");
        SELECT("ad_name");
        SELECT("ad_click_rate");
        SELECT("create_time");
        FROM("ad_adverting_data");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        AdAdvertingData record = (AdAdvertingData) parameter.get("record");
        AdAdvertingDataExample example = (AdAdvertingDataExample) parameter.get("example");
        
        BEGIN();
        UPDATE("ad_adverting_data");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getDatestr() != null) {
            SET("datestr = #{record.datestr,jdbcType=VARCHAR}");
        }
        
        if (record.getPlatform() != null) {
            SET("platform = #{record.platform,jdbcType=TINYINT}");
        }
        
        if (record.getHaha() != null) {
            SET("haha = #{record.haha,jdbcType=BIT}");
        }
        
        if (record.getPositionId() != null) {
            SET("position_id = #{record.positionId,jdbcType=INTEGER}");
        }
        
        if (record.getThirdAdId() != null) {
            SET("third_ad_id = #{record.thirdAdId,jdbcType=VARCHAR}");
        }
        
        if (record.getShowType() != null) {
            SET("show_type = #{record.showType,jdbcType=SMALLINT}");
        }
        
        if (record.getAdvertId() != null) {
            SET("advert_id = #{record.advertId,jdbcType=BIGINT}");
        }
        
        if (record.getAdType() != null) {
            SET("ad_type = #{record.adType,jdbcType=INTEGER}");
        }
        
        if (record.getAdPropertyType() != null) {
            SET("ad_property_type = #{record.adPropertyType,jdbcType=INTEGER}");
        }
        
        if (record.getAdPurpose() != null) {
            SET("ad_purpose = #{record.adPurpose,jdbcType=INTEGER}");
        }
        
        if (record.getAdvertiserId() != null) {
            SET("advertiser_id = #{record.advertiserId,jdbcType=INTEGER}");
        }
        
        if (record.getAdId() != null) {
            SET("ad_id = #{record.adId,jdbcType=BIGINT}");
        }
        
        if (record.getAdShow() != null) {
            SET("ad_show = #{record.adShow,jdbcType=INTEGER}");
        }
        
        if (record.getAdClick() != null) {
            SET("ad_click = #{record.adClick,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            SET("price = #{record.price,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelRules() != null) {
            SET("channel_rules = #{record.channelRules,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelRulesId() != null) {
            SET("channel_rules_id = #{record.channelRulesId,jdbcType=INTEGER}");
        }
        
        if (record.getLocationRulesId() != null) {
            SET("location_rules_id = #{record.locationRulesId,jdbcType=INTEGER}");
        }
        
        if (record.getLocationRulesName() != null) {
            SET("location_rules_name = #{record.locationRulesName,jdbcType=VARCHAR}");
        }
        
        if (record.getAdvertType() != null) {
            SET("advert_type = #{record.advertType,jdbcType=TINYINT}");
        }
        
        if (record.getAdName() != null) {
            SET("ad_name = #{record.adName,jdbcType=VARCHAR}");
        }
        
        if (record.getAdClickRate() != null) {
            SET("ad_click_rate = #{record.adClickRate,jdbcType=REAL}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("ad_adverting_data");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("datestr = #{record.datestr,jdbcType=VARCHAR}");
        SET("platform = #{record.platform,jdbcType=TINYINT}");
        SET("haha = #{record.haha,jdbcType=BIT}");
        SET("position_id = #{record.positionId,jdbcType=INTEGER}");
        SET("third_ad_id = #{record.thirdAdId,jdbcType=VARCHAR}");
        SET("show_type = #{record.showType,jdbcType=SMALLINT}");
        SET("advert_id = #{record.advertId,jdbcType=BIGINT}");
        SET("ad_type = #{record.adType,jdbcType=INTEGER}");
        SET("ad_property_type = #{record.adPropertyType,jdbcType=INTEGER}");
        SET("ad_purpose = #{record.adPurpose,jdbcType=INTEGER}");
        SET("advertiser_id = #{record.advertiserId,jdbcType=INTEGER}");
        SET("ad_id = #{record.adId,jdbcType=BIGINT}");
        SET("ad_show = #{record.adShow,jdbcType=INTEGER}");
        SET("ad_click = #{record.adClick,jdbcType=INTEGER}");
        SET("price = #{record.price,jdbcType=DECIMAL}");
        SET("channel_rules = #{record.channelRules,jdbcType=VARCHAR}");
        SET("channel_rules_id = #{record.channelRulesId,jdbcType=INTEGER}");
        SET("location_rules_id = #{record.locationRulesId,jdbcType=INTEGER}");
        SET("location_rules_name = #{record.locationRulesName,jdbcType=VARCHAR}");
        SET("advert_type = #{record.advertType,jdbcType=TINYINT}");
        SET("ad_name = #{record.adName,jdbcType=VARCHAR}");
        SET("ad_click_rate = #{record.adClickRate,jdbcType=REAL}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        
        AdAdvertingDataExample example = (AdAdvertingDataExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(AdAdvertingData record) {
        BEGIN();
        UPDATE("ad_adverting_data");
        
        if (record.getDatestr() != null) {
            SET("datestr = #{datestr,jdbcType=VARCHAR}");
        }
        
        if (record.getPlatform() != null) {
            SET("platform = #{platform,jdbcType=TINYINT}");
        }
        
        if (record.getHaha() != null) {
            SET("haha = #{haha,jdbcType=BIT}");
        }
        
        if (record.getPositionId() != null) {
            SET("position_id = #{positionId,jdbcType=INTEGER}");
        }
        
        if (record.getThirdAdId() != null) {
            SET("third_ad_id = #{thirdAdId,jdbcType=VARCHAR}");
        }
        
        if (record.getShowType() != null) {
            SET("show_type = #{showType,jdbcType=SMALLINT}");
        }
        
        if (record.getAdvertId() != null) {
            SET("advert_id = #{advertId,jdbcType=BIGINT}");
        }
        
        if (record.getAdType() != null) {
            SET("ad_type = #{adType,jdbcType=INTEGER}");
        }
        
        if (record.getAdPropertyType() != null) {
            SET("ad_property_type = #{adPropertyType,jdbcType=INTEGER}");
        }
        
        if (record.getAdPurpose() != null) {
            SET("ad_purpose = #{adPurpose,jdbcType=INTEGER}");
        }
        
        if (record.getAdvertiserId() != null) {
            SET("advertiser_id = #{advertiserId,jdbcType=INTEGER}");
        }
        
        if (record.getAdId() != null) {
            SET("ad_id = #{adId,jdbcType=BIGINT}");
        }
        
        if (record.getAdShow() != null) {
            SET("ad_show = #{adShow,jdbcType=INTEGER}");
        }
        
        if (record.getAdClick() != null) {
            SET("ad_click = #{adClick,jdbcType=INTEGER}");
        }
        
        if (record.getPrice() != null) {
            SET("price = #{price,jdbcType=DECIMAL}");
        }
        
        if (record.getChannelRules() != null) {
            SET("channel_rules = #{channelRules,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelRulesId() != null) {
            SET("channel_rules_id = #{channelRulesId,jdbcType=INTEGER}");
        }
        
        if (record.getLocationRulesId() != null) {
            SET("location_rules_id = #{locationRulesId,jdbcType=INTEGER}");
        }
        
        if (record.getLocationRulesName() != null) {
            SET("location_rules_name = #{locationRulesName,jdbcType=VARCHAR}");
        }
        
        if (record.getAdvertType() != null) {
            SET("advert_type = #{advertType,jdbcType=TINYINT}");
        }
        
        if (record.getAdName() != null) {
            SET("ad_name = #{adName,jdbcType=VARCHAR}");
        }
        
        if (record.getAdClickRate() != null) {
            SET("ad_click_rate = #{adClickRate,jdbcType=REAL}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(AdAdvertingDataExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}