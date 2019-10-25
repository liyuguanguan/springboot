package com.example.demo.mybaties.mapper;

import com.example.demo.dto.TotalDetailDTO;
import com.example.demo.mybaties.model.IadtCpiNaciDetail;
import com.example.demo.mybaties.model.IadtCpiNaciDetailExample;
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

public interface IadtCpiNaciDetailMapper {
    @SelectProvider(type=IadtCpiNaciDetailSqlProvider.class, method="countByExample")
    int countByExample(IadtCpiNaciDetailExample example);

    @DeleteProvider(type=IadtCpiNaciDetailSqlProvider.class, method="deleteByExample")
    int deleteByExample(IadtCpiNaciDetailExample example);

    @Delete({
        "delete from iadtcpinacidetail",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into iadtcpinacidetail (id, iadtcpiadurl, ",
        "iadtcpiadclk, create_time, ",
        "update_time, total_id)",
        "values (#{id,jdbcType=INTEGER}, #{iadtcpiadurl,jdbcType=VARCHAR}, ",
        "#{iadtcpiadclk,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{totalId,jdbcType=INTEGER})"
    })
    int insert(IadtCpiNaciDetail record);

    @InsertProvider(type=IadtCpiNaciDetailSqlProvider.class, method="insertSelective")
    int insertSelective(IadtCpiNaciDetail record);

    @SelectProvider(type=IadtCpiNaciDetailSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="iadtcpiadurl", property="iadtcpiadurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="iadtcpiadclk", property="iadtcpiadclk", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="total_id", property="totalId", jdbcType=JdbcType.INTEGER)
    })
    List<IadtCpiNaciDetail> selectByExample(IadtCpiNaciDetailExample example);

    @Select({
        "select",
        "id, iadtcpiadurl, iadtcpiadclk, create_time, update_time, total_id",
        "from iadtcpinacidetail",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="iadtcpiadurl", property="iadtcpiadurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="iadtcpiadclk", property="iadtcpiadclk", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="total_id", property="totalId", jdbcType=JdbcType.INTEGER)
    })
    IadtCpiNaciDetail selectByPrimaryKey(Integer id);

    @UpdateProvider(type=IadtCpiNaciDetailSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") IadtCpiNaciDetail record, @Param("example") IadtCpiNaciDetailExample example);

    @UpdateProvider(type=IadtCpiNaciDetailSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") IadtCpiNaciDetail record, @Param("example") IadtCpiNaciDetailExample example);

    @UpdateProvider(type=IadtCpiNaciDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(IadtCpiNaciDetail record);

    @Update({
        "update iadtcpinacidetail",
        "set iadtcpiadurl = #{iadtcpiadurl,jdbcType=VARCHAR},",
          "iadtcpiadclk = #{iadtcpiadclk,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "total_id = #{totalId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(IadtCpiNaciDetail record);

    @Select({"select a.id, a.iadtcpiadurl, a.iadtcpiadclk, a.create_time, a.update_time, a.total_id,b.id as bid, b.iadtcpiadtyp, b.iadtcpiadver, b.total_key, b.begin_time, b.end_time from iadtcpinacidetail a LEFT JOIN iadtcpinacitotal b on a.total_id=b.id order by a.id desc"})
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="iadtcpiadurl", property="iadtcpiadurl", jdbcType=JdbcType.VARCHAR),
            @Result(column="iadtcpiadclk", property="iadtcpiadclk", jdbcType=JdbcType.VARCHAR),
            @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="total_id", property="totalId", jdbcType=JdbcType.INTEGER),
            @Result(column="bid", property="ttid", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="iadtcpiadtyp", property="iadtcpiadtyp", jdbcType=JdbcType.VARCHAR),
            @Result(column="iadtcpiadver", property="iadtcpiadver", jdbcType=JdbcType.VARCHAR),
            @Result(column="total_key", property="totalKey", jdbcType=JdbcType.VARCHAR),
            @Result(column="begin_time", property="beginTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TotalDetailDTO> selectTotalDetailDTO();
}