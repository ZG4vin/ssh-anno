package com.gavin.test;

import com.gavin.domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试hibernate框架是否能够独立在web工程中运行
 */
public class test02_hibernate {
    public static void main(String[] args) {
        Customer c=new Customer();
        c.setCustName("ssh-hibernate单独测试");


        //1.加载配置文件
        Configuration cfg=new Configuration();
        cfg.configure();

        //2.根据配置文件加载SessionFactory
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        //3.根据SessionFactory创建Session
        Session session = sessionFactory.openSession();

        //4.开启事务
        Transaction tx = session.beginTransaction();

        //5.执行操作
        session.save(c);

        //6.提交或回滚
        tx.commit();

        //7.释放资源
        session.close();
        sessionFactory.close();
    }
}
