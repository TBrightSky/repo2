package cn.sky;

import cn.sky.domain.Account;
import cn.sky.service.IAccountrService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class TestCRUD3 {
    @Autowired
    @Qualifier("accountService3")
    private IAccountrService as;
    @Test
    public void testFindAll(){
        List<Account> accounts = as.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    @Test
    public void testFindOne(){
        Account account = as.findAccountById(1);
        System.out.println(account);

    }
    @Test
    public void testUpdate(){
        Account account = as.findAccountById(2);
        account.setMoney(1230.2f);
        account.setName("ggg");
        as.updateAccount(account);
        testFindAll();
    }
    @Test
    public void testDelete(){
        as.deleteAccount(8);
        testFindAll();
    }
    @Test
    public void testSave(){
        Account account=new Account();
        account.setMoney(1010.0f);
        account.setName("sdf");
        as.saveAccount(account);
        testFindAll();
    }
}
