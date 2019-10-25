package com.example.demo.mybaties.mapper;

import com.example.demo.mybaties.model.AdAdvertingData;
import com.example.demo.mybaties.model.AdAdvertingDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface AdAdvertingDataMapper {
    @SelectProvider(type=AdAdvertingDataSqlProvider.class, method="countByExample")
    int countByExample(AdAdvertingDataExample example);

    @DeleteProvider(type=AdAdvertingDataSqlProvider.class, method="deleteByExample")
    int deleteByExample(AdAdvertingDataExample example);

    @Delete({
        "delete from ad_adverting_data",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into ad_adverting_data (id, datestr, ",
        "platform, haha, position_id, ",
        "third_ad_id, show_type, ",
        "advert_id, ad_type, ",
        "ad_property_type, ad_purpose, ",
        "advertiser_id, ad_id, ",
        "ad_show, ad_click, ",
        "price, channel_rules, ",
        "channel_rules_id, location_rules_id, ",
        "location_rules_name, advert_type, ",
        "ad_name, ad_click_rate, ",
        "create_time)",
        "values (#{id,jdbcType=BIGINT}, #{datestr,jdbcType=VARCHAR}, ",
        "#{platform,jdbcType=TINYINT}, #{haha,jdbcType=BIT}, #{positionId,jdbcType=INTEGER}, ",
        "#{thirdAdId,jdbcType=VARCHAR}, #{showType,jdbcType=SMALLINT}, ",
        "#{advertId,jdbcType=BIGINT}, #{adType,jdbcType=INTEGER}, ",
        "#{adPropertyType,jdbcType=INTEGER}, #{adPurpose,jdbcType=INTEGER}, ",
        "#{advertiserId,jdbcType=INTEGER}, #{adId,jdbcType=BIGINT}, ",
        "#{adShow,jdbcType=INTEGER}, #{adClick,jdbcType=INTEGER}, ",
        "#{price,jdbcType=DECIMAL}, #{channelRules,jdbcType=VARCHAR}, ",
        "#{channelRulesId,jdbcType=INTEGER}, #{locationRulesId,jdbcType=INTEGER}, ",
        "#{locationRulesName,jdbcType=VARCHAR}, #{advertType,jdbcType=TINYINT}, ",
        "#{adName,jdbcType=VARCHAR}, #{adClickRate,jdbcType=REAL}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(AdAdvertingData record);

    @InsertProvider(type=AdAdvertingDataSqlProvider.class, method="insertSelective")
    int insertSelective(AdAdvertingData record);

    @SelectProvider(type=AdAdvertingDataSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="datestr", property="datestr", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.TINYINT),
        @Result(column="haha", property="haha", jdbcType=JdbcType.BIT),
        @Result(column="position_id", property="positionId", jdbcType=JdbcType.INTEGER),
        @Result(column="third_ad_id", property="thirdAdId", jdbcType=JdbcType.VARCHAR),
        @Result(column="show_type", property="showType", jdbcType=JdbcType.SMALLINT),
        @Result(column="advert_id", property="advertId", jdbcType=JdbcType.BIGINT),
        @Result(column="ad_type", property="adType", jdbcType=JdbcType.INTEGER),
        @Result(column="ad_property_type", property="adPropertyType", jdbcType=JdbcType.INTEGER),
        @Result(column="ad_purpose", property="adPurpose", jdbcType=JdbcType.INTEGER),
        @Result(column="advertiser_id", property="advertiserId", jdbcType=JdbcType.INTEGER),
        @Result(column="ad_id", property="adId", jdbcType=JdbcType.BIGINT),
        @Result(column="ad_show", property="adShow", jdbcType=JdbcType.INTEGER),
        @Result(column="ad_click", property="adClick", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="channel_rules", property="channelRules", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_rules_id", property="channelRulesId", jdbcType=JdbcType.INTEGER),
        @Result(column="location_rules_id", property="locationRulesId", jdbcType=JdbcType.INTEGER),
        @Result(column="location_rules_name", property="locationRulesName", jdbcType=JdbcType.VARCHAR),
        @Result(column="advert_type", property="advertType", jdbcType=JdbcType.TINYINT),
        @Result(column="ad_name", property="adName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ad_click_rate", property="adClickRate", jdbcType=JdbcType.REAL),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AdAdvertingData> selectByExample(AdAdvertingDataExample example);

    @Select({
        "select",
        "id, datestr, platform, haha, position_id, third_ad_id, show_type, advert_id, ",
        "ad_type, ad_property_type, ad_purpose, advertiser_id, ad_id, ad_show, ad_click, ",
        "price, channel_rules, channel_rules_id, location_rules_id, location_rules_name, ",
        "advert_type, ad_name, ad_click_rate, create_time",
        "from ad_adverting_data",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="datestr", property="datestr", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.TINYINT),
        @Result(column="haha", property="haha", jdbcType=JdbcType.BIT),
        @Result(column="position_id", property="positionId", jdbcType=JdbcType.INTEGER),
        @Result(column="third_ad_id", property="thirdAdId", jdbcType=JdbcType.VARCHAR),
        @Result(column="show_type", property="showType", jdbcType=JdbcType.SMALLINT),
        @Result(column="advert_id", property="advertId", jdbcType=JdbcType.BIGINT),
        @Result(column="ad_type", property="adType", jdbcType=JdbcType.INTEGER),
        @Result(column="ad_property_type", property="adPropertyType", jdbcType=JdbcType.INTEGER),
        @Result(column="ad_purpose", property="adPurpose", jdbcType=JdbcType.INTEGER),
        @Result(column="advertiser_id", property="advertiserId", jdbcType=JdbcType.INTEGER),
        @Result(column="ad_id", property="adId", jdbcType=JdbcType.BIGINT),
        @Result(column="ad_show", property="adShow", jdbcType=JdbcType.INTEGER),
        @Result(column="ad_click", property="adClick", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="channel_rules", property="channelRules", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel_rules_id", property="channelRulesId", jdbcType=JdbcType.INTEGER),
        @Result(column="location_rules_id", property="locationRulesId", jdbcType=JdbcType.INTEGER),
        @Result(column="location_rules_name", property="locationRulesName", jdbcType=JdbcType.VARCHAR),
        @Result(column="advert_type", property="advertType", jdbcType=JdbcType.TINYINT),
        @Result(column="ad_name", property="adName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ad_click_rate", property="adClickRate", jdbcType=JdbcType.REAL),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    AdAdvertingData selectByPrimaryKey(Long id);

    @UpdateProvider(type=AdAdvertingDataSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") AdAdvertingData record, @Param("example") AdAdvertingDataExample example);

    @UpdateProvider(type=AdAdvertingDataSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") AdAdvertingData record, @Param("example") AdAdvertingDataExample example);

    @UpdateProvider(type=AdAdvertingDataSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AdAdvertingData record);

    @Update({
        "update ad_adverting_data",
        "set datestr = #{datestr,jdbcType=VARCHAR},",
          "platform = #{platform,jdbcType=TINYINT},",
          "haha = #{haha,jdbcType=BIT},",
          "position_id = #{positionId,jdbcType=INTEGER},",
          "third_ad_id = #{thirdAdId,jdbcType=VARCHAR},",
          "show_type = #{showType,jdbcType=SMALLINT},",
          "advert_id = #{advertId,jdbcType=BIGINT},",
          "ad_type = #{adType,jdbcType=INTEGER},",
          "ad_property_type = #{adPropertyType,jdbcType=INTEGER},",
          "ad_purpose = #{adPurpose,jdbcType=INTEGER},",
          "advertiser_id = #{advertiserId,jdbcType=INTEGER},",
          "ad_id = #{adId,jdbcType=BIGINT},",
          "ad_show = #{adShow,jdbcType=INTEGER},",
          "ad_click = #{adClick,jdbcType=INTEGER},",
          "price = #{price,jdbcType=DECIMAL},",
          "channel_rules = #{channelRules,jdbcType=VARCHAR},",
          "channel_rules_id = #{channelRulesId,jdbcType=INTEGER},",
          "location_rules_id = #{locationRulesId,jdbcType=INTEGER},",
          "location_rules_name = #{locationRulesName,jdbcType=VARCHAR},",
          "advert_type = #{advertType,jdbcType=TINYINT},",
          "ad_name = #{adName,jdbcType=VARCHAR},",
          "ad_click_rate = #{adClickRate,jdbcType=REAL},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(AdAdvertingData record);
}