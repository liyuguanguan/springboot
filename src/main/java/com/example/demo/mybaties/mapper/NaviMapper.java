package com.example.demo.mybaties.mapper;

import com.example.demo.mybaties.model.Navi;
import com.example.demo.mybaties.model.NaviExample;
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

public interface NaviMapper {
    @SelectProvider(type=NaviSqlProvider.class, method="countByExample")
    int countByExample(NaviExample example);

    @DeleteProvider(type=NaviSqlProvider.class, method="deleteByExample")
    int deleteByExample(NaviExample example);

    @Delete({
        "delete from navi",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into navi (id, type, ",
        "key)",
        "values (#{id,jdbcType=INTEGER}, #{type,jdbcType=VARCHAR}, ",
        "#{key,jdbcType=VARCHAR})"
    })
    int insert(Navi record);

    @InsertProvider(type=NaviSqlProvider.class, method="insertSelective")
    int insertSelective(Navi record);

    @SelectProvider(type=NaviSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="key", property="key", jdbcType=JdbcType.VARCHAR)
    })
    List<Navi> selectByExample(NaviExample example);

    @Select({
        "select",
        "id, type, key",
        "from navi",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="key", property="key", jdbcType=JdbcType.VARCHAR)
    })
    Navi selectByPrimaryKey(Integer id);

    @UpdateProvider(type=NaviSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Navi record, @Param("example") NaviExample example);

    @UpdateProvider(type=NaviSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Navi record, @Param("example") NaviExample example);

    @UpdateProvider(type=NaviSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Navi record);

    @Update({
        "update navi",
        "set type = #{type,jdbcType=VARCHAR},",
          "key = #{key,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Navi record);
}