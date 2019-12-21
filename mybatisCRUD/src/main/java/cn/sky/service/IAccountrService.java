package cn.sky.service;

import cn.sky.domain.Account;

import java.util.List;

public interface IAccountrService {
    List<Account> findAllAccount();
    Account findAccountById(Integer id);
    void saveAccount(Account account);
    void deleteAccount(Integer id);
    void updateAccount(Account account);

}
