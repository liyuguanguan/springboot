package com.example.demo.mybaties.mapper;

import com.example.demo.mybaties.model.IadtCpiNaciTotal;
import com.example.demo.mybaties.model.IadtCpiNaciTotalExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface IadtCpiNaciTotalMapper {
    @SelectProvider(type=IadtCpiNaciTotalSqlProvider.class, method="countByExample")
    int countByExample(IadtCpiNaciTotalExample example);

    @DeleteProvider(type=IadtCpiNaciTotalSqlProvider.class, method="deleteByExample")
    int deleteByExample(IadtCpiNaciTotalExample example);

    @Delete({
        "delete from iadtcpinacitotal",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into iadtcpinacitotal (id, iadtcpiadtyp, ",
        "iadtcpiadver, total_key, ",
        "begin_time, end_time)",
        "values (#{id,jdbcType=INTEGER}, #{iadtcpiadtyp,jdbcType=VARCHAR}, ",
        "#{iadtcpiadver,jdbcType=VARCHAR}, #{totalKey,jdbcType=VARCHAR}, ",
        "#{beginTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP})"
    })
    int insert(IadtCpiNaciTotal record);

    @InsertProvider(type=IadtCpiNaciTotalSqlProvider.class, method="insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = int.class)
    int insertSelective(IadtCpiNaciTotal record);

    @SelectProvider(type=IadtCpiNaciTotalSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="iadtcpiadtyp", property="iadtcpiadtyp", jdbcType=JdbcType.VARCHAR),
        @Result(column="iadtcpiadver", property="iadtcpiadver", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_key", property="totalKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="begin_time", property="beginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<IadtCpiNaciTotal> selectByExample(IadtCpiNaciTotalExample example);

    @Select({
        "select",
        "id, iadtcpiadtyp, iadtcpiadver, total_key, begin_time, end_time",
        "from iadtcpinacitotal",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="iadtcpiadtyp", property="iadtcpiadtyp", jdbcType=JdbcType.VARCHAR),
        @Result(column="iadtcpiadver", property="iadtcpiadver", jdbcType=JdbcType.VARCHAR),
        @Result(column="total_key", property="totalKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="begin_time", property="beginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP)
    })
    IadtCpiNaciTotal selectByPrimaryKey(Integer id);

    @UpdateProvider(type=IadtCpiNaciTotalSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") IadtCpiNaciTotal record, @Param("example") IadtCpiNaciTotalExample example);

    @UpdateProvider(type=IadtCpiNaciTotalSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") IadtCpiNaciTotal record, @Param("example") IadtCpiNaciTotalExample example);

    @UpdateProvider(type=IadtCpiNaciTotalSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(IadtCpiNaciTotal record);

    @Update({
        "update iadtcpinacitotal",
        "set iadtcpiadtyp = #{iadtcpiadtyp,jdbcType=VARCHAR},",
          "iadtcpiadver = #{iadtcpiadver,jdbcType=VARCHAR},",
          "total_key = #{totalKey,jdbcType=VARCHAR},",
          "begin_time = #{beginTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(IadtCpiNaciTotal record);
}