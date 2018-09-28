package com.gavin.test;

import com.gavin.domain.Customer;
import com.gavin.service.ICustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试spring和hibernate整合之后是否可用
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class test03_SpringHibernate {

    @Autowired
    private ICustomerService customerService;

    @Test
    public void testSave(){
        Customer c=new Customer();
        c.setCustName("ssh-spring和hibernate测试整合");
        customerService.saveCustomer(c);
    }
    @Test
    public void testFindAll(){

    }
}
