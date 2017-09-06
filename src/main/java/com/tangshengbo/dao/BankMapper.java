package com.tangshengbo.dao;

import com.tangshengbo.model.Bank;

public interface BankMapper {
    /**
     *
     * @mbggenerated 2017-09-06
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-09-06
     */
    int insert(Bank record);

    /**
     *
     * @mbggenerated 2017-09-06
     */
    int insertSelective(Bank record);

    /**
     *
     * @mbggenerated 2017-09-06
     */
    Bank selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-09-06
     */
    int updateByPrimaryKeySelective(Bank record);

    /**
     *
     * @mbggenerated 2017-09-06
     */
    int updateByPrimaryKey(Bank record);
}