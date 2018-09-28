package com.gavin.test;

import com.gavin.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试spring框架是否能够独立在web工程中运行
 */
public class test01_spring {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        ICustomerService customerService = (ICustomerService)ac.getBean("customerService");
        customerService.findAllCustomer();
    }
}
