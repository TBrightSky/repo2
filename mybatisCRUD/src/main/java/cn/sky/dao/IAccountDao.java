package cn.sky.dao;

import cn.sky.domain.Account;

import java.util.List;

public interface IAccountDao {
    List<Account> findAllAccount();
    Account findAccountById(Integer id);
    void saveAccount(Account account);
    void deleteAccount(Integer id);
    void updateAccount(Account account);
}
