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

import com.example.demo.mybaties.model.IadtCpiNaciTotal;
import com.example.demo.mybaties.model.IadtCpiNaciTotalExample.Criteria;
import com.example.demo.mybaties.model.IadtCpiNaciTotalExample.Criterion;
import com.example.demo.mybaties.model.IadtCpiNaciTotalExample;
import java.util.List;
import java.util.Map;

public class IadtCpiNaciTotalSqlProvider {

    public String countByExample(IadtCpiNaciTotalExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("iadtcpinacitotal");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(IadtCpiNaciTotalExample example) {
        BEGIN();
        DELETE_FROM("iadtcpinacitotal");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(IadtCpiNaciTotal record) {
        BEGIN();
        INSERT_INTO("iadtcpinacitotal");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getIadtcpiadtyp() != null) {
            VALUES("iadtcpiadtyp", "#{iadtcpiadtyp,jdbcType=VARCHAR}");
        }
        
        if (record.getIadtcpiadver() != null) {
            VALUES("iadtcpiadver", "#{iadtcpiadver,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalKey() != null) {
            VALUES("total_key", "#{totalKey,jdbcType=VARCHAR}");
        }
        
        if (record.getBeginTime() != null) {
            VALUES("begin_time", "#{beginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            VALUES("end_time", "#{endTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(IadtCpiNaciTotalExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("iadtcpiadtyp");
        SELECT("iadtcpiadver");
        SELECT("total_key");
        SELECT("begin_time");
        SELECT("end_time");
        FROM("iadtcpinacitotal");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        IadtCpiNaciTotal record = (IadtCpiNaciTotal) parameter.get("record");
        IadtCpiNaciTotalExample example = (IadtCpiNaciTotalExample) parameter.get("example");
        
        BEGIN();
        UPDATE("iadtcpinacitotal");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getIadtcpiadtyp() != null) {
            SET("iadtcpiadtyp = #{record.iadtcpiadtyp,jdbcType=VARCHAR}");
        }
        
        if (record.getIadtcpiadver() != null) {
            SET("iadtcpiadver = #{record.iadtcpiadver,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalKey() != null) {
            SET("total_key = #{record.totalKey,jdbcType=VARCHAR}");
        }
        
        if (record.getBeginTime() != null) {
            SET("begin_time = #{record.beginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("iadtcpinacitotal");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("iadtcpiadtyp = #{record.iadtcpiadtyp,jdbcType=VARCHAR}");
        SET("iadtcpiadver = #{record.iadtcpiadver,jdbcType=VARCHAR}");
        SET("total_key = #{record.totalKey,jdbcType=VARCHAR}");
        SET("begin_time = #{record.beginTime,jdbcType=TIMESTAMP}");
        SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        
        IadtCpiNaciTotalExample example = (IadtCpiNaciTotalExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(IadtCpiNaciTotal record) {
        BEGIN();
        UPDATE("iadtcpinacitotal");
        
        if (record.getIadtcpiadtyp() != null) {
            SET("iadtcpiadtyp = #{iadtcpiadtyp,jdbcType=VARCHAR}");
        }
        
        if (record.getIadtcpiadver() != null) {
            SET("iadtcpiadver = #{iadtcpiadver,jdbcType=VARCHAR}");
        }
        
        if (record.getTotalKey() != null) {
            SET("total_key = #{totalKey,jdbcType=VARCHAR}");
        }
        
        if (record.getBeginTime() != null) {
            SET("begin_time = #{beginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            SET("end_time = #{endTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(IadtCpiNaciTotalExample example, boolean includeExamplePhrase) {
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