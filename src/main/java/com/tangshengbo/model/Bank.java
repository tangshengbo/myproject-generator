package com.tangshengbo.model;

public class Bank {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 账户编号
     */
    private Integer accountId;

    /**
     * 账户金额
     */
    private Double money;

    /**
     * 编号
     * @return id 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 编号
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 账户编号
     * @return account_id 账户编号
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * 账户编号
     * @param accountId 账户编号
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * 账户金额
     * @return money 账户金额
     */
    public Double getMoney() {
        return money;
    }

    /**
     * 账户金额
     * @param money 账户金额
     */
    public void setMoney(Double money) {
        this.money = money;
    }
}