package cn.sky.service.impl;

import cn.sky.dao.IAccountDao;
import cn.sky.domain.Account;
import cn.sky.service.IAccountrService;

import java.util.List;


public class AccountServiceImpl1 implements IAccountrService {
    private IAccountDao accountDao;

    public IAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void deleteAccount(Integer id) {
        accountDao.deleteAccount(id);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }
}
