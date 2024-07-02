package com.zhiwu.domain;

/**
 * 功能：
 *
 * @author zhiwu
 * @Data 2024/7/2 22:22
 */
public class Account {

    private int id;

    private String username;

    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
