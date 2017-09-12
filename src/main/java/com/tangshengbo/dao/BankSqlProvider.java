package com.tangshengbo.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.tangshengbo.model.Bank;

public class BankSqlProvider {

    /**
     *
     * @mbggenerated 2017-09-12
     */
    public String insertSelective(Bank record) {
        BEGIN();
        INSERT_INTO("bank");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getAccountId() != null) {
            VALUES("account_id", "#{accountId,jdbcType=INTEGER}");
        }
        
        if (record.getMoney() != null) {
            VALUES("money", "#{money,jdbcType=DOUBLE}");
        }
        
        return SQL();
    }

    /**
     *
     * @mbggenerated 2017-09-12
     */
    public String updateByPrimaryKeySelective(Bank record) {
        BEGIN();
        UPDATE("bank");
        
        if (record.getAccountId() != null) {
            SET("account_id = #{accountId,jdbcType=INTEGER}");
        }
        
        if (record.getMoney() != null) {
            SET("money = #{money,jdbcType=DOUBLE}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}