package com.example.demo.mybaties.mapper;

import com.example.demo.mybaties.model.IadtCpiNaci;
import com.example.demo.mybaties.model.IadtCpiNaciExample;
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

public interface IadtCpiNaciMapper {
    @SelectProvider(type=IadtCpiNaciSqlProvider.class, method="countByExample")
    int countByExample(IadtCpiNaciExample example);

    @DeleteProvider(type=IadtCpiNaciSqlProvider.class, method="deleteByExample")
    int deleteByExample(IadtCpiNaciExample example);

    @Delete({
        "delete from iadtcpinaci",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into iadtcpinaci (id, cpinavi, ",
        "naci_type, naci_key, ",
        "create_time, update_time)",
        "values (#{id,jdbcType=INTEGER}, #{cpinavi,jdbcType=VARCHAR}, ",
        "#{naciType,jdbcType=VARCHAR}, #{naciKey,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(IadtCpiNaci record);

    @InsertProvider(type=IadtCpiNaciSqlProvider.class, method="insertSelective")
    int insertSelective(IadtCpiNaci record);

    @SelectProvider(type=IadtCpiNaciSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cpinavi", property="cpinavi", jdbcType=JdbcType.VARCHAR),
        @Result(column="naci_type", property="naciType", jdbcType=JdbcType.VARCHAR),
        @Result(column="naci_key", property="naciKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<IadtCpiNaci> selectByExample(IadtCpiNaciExample example);

    @Select({
        "select",
        "id, cpinavi, naci_type, naci_key, create_time, update_time",
        "from iadtcpinaci",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cpinavi", property="cpinavi", jdbcType=JdbcType.VARCHAR),
        @Result(column="naci_type", property="naciType", jdbcType=JdbcType.VARCHAR),
        @Result(column="naci_key", property="naciKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    IadtCpiNaci selectByPrimaryKey(Integer id);

    @UpdateProvider(type=IadtCpiNaciSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") IadtCpiNaci record, @Param("example") IadtCpiNaciExample example);

    @UpdateProvider(type=IadtCpiNaciSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") IadtCpiNaci record, @Param("example") IadtCpiNaciExample example);

    @UpdateProvider(type=IadtCpiNaciSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(IadtCpiNaci record);

    @Update({
        "update iadtcpinaci",
        "set cpinavi = #{cpinavi,jdbcType=VARCHAR},",
          "naci_type = #{naciType,jdbcType=VARCHAR},",
          "naci_key = #{naciKey,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(IadtCpiNaci record);
}