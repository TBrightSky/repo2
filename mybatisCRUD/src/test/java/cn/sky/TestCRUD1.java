package cn.sky;

import cn.sky.domain.Account;
import cn.sky.service.IAccountrService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class TestCRUD1 {
    @Test
    public void testFindAll(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("bean1.xml");
        IAccountrService as = ac.getBean("accountService1", IAccountrService.class);
        List<Account> accounts = as.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
    @Test
    public void testFindOne(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("bean1.xml");
        IAccountrService as = ac.getBean("accountService1", IAccountrService.class);
        Account account = as.findAccountById(1);
        System.out.println(account);

    }
    @Test
    public void testUpdate(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("bean1.xml");
        IAccountrService as = ac.getBean("accountService1", IAccountrService.class);
        Account account = as.findAccountById(1);
        account.setMoney(1230.2f);
        account.setName("ggg");
        as.updateAccount(account);
        testFindAll();
    }
    @Test
    public void testDelete(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("bean1.xml");
        IAccountrService as = ac.getBean("accountService1", IAccountrService.class);
        as.deleteAccount(9);

    }
    @Test
    public void testSave(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("bean1.xml");
        IAccountrService as = ac.getBean("accountService1", IAccountrService.class);
        Account account=new Account();
        account.setMoney(1010.0f);
        account.setName("kkk");
        as.saveAccount(account);
    }
}
