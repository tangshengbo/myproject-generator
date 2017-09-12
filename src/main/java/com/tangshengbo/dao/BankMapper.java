package com.tangshengbo.dao;

import com.tangshengbo.model.Bank;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface BankMapper {
    /**
     *
     * @mbggenerated 2017-09-12
     */
    @Delete({
        "delete from bank",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-09-12
     */
    @Insert({
        "insert into bank (id, account_id, ",
        "money)",
        "values (#{id,jdbcType=INTEGER}, #{accountId,jdbcType=INTEGER}, ",
        "#{money,jdbcType=DOUBLE})"
    })
    int insert(Bank record);

    /**
     *
     * @mbggenerated 2017-09-12
     */
    @InsertProvider(type=BankSqlProvider.class, method="insertSelective")
    int insertSelective(Bank record);

    /**
     *
     * @mbggenerated 2017-09-12
     */
    @Select({
        "select",
        "id, account_id, money",
        "from bank",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
        @Result(column="money", property="money", jdbcType=JdbcType.DOUBLE)
    })
    Bank selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-09-12
     */
    @UpdateProvider(type=BankSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Bank record);

    /**
     *
     * @mbggenerated 2017-09-12
     */
    @Update({
        "update bank",
        "set account_id = #{accountId,jdbcType=INTEGER},",
          "money = #{money,jdbcType=DOUBLE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Bank record);
}