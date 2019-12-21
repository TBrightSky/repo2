package cn.sky.service.impl;

import cn.sky.dao.IAccountDao;
import cn.sky.domain.Account;
import cn.sky.service.IAccountrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService3")
public class AccountServiceImpl3 implements IAccountrService {

    @Autowired
    private IAccountDao accountDao2;

    public IAccountDao getAccountDao() {
        return accountDao2;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao2 = accountDao;
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao2.findAllAccount();
    }

    @Override
    public Account findAccountById(Integer id) {
        return accountDao2.findAccountById(id);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao2.saveAccount(account);
    }

    @Override
    public void deleteAccount(Integer id) {
        accountDao2.deleteAccount(id);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao2.updateAccount(account);
    }
}
