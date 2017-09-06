package com.tangshengbo.dao;

import com.tangshengbo.model.Account;

public interface AccountMapper {
    /**
     *
     * @mbggenerated 2017-09-06
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-09-06
     */
    int insert(Account record);

    /**
     *
     * @mbggenerated 2017-09-06
     */
    int insertSelective(Account record);

    /**
     *
     * @mbggenerated 2017-09-06
     */
    Account selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2017-09-06
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     *
     * @mbggenerated 2017-09-06
     */
    int updateByPrimaryKey(Account record);
}