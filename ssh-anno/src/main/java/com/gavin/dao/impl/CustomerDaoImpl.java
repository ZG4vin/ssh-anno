package com.gavin.dao.impl;

import com.gavin.dao.ICustomerDao;
import com.gavin.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * 客户的持久层实现类
 */
@Repository
public class CustomerDaoImpl implements ICustomerDao {

    @Autowired
    private HibernateTemplate ht;

	// hibernateTemplate，相当于hibernate中的session，对session进一步的封装，不用关心事务控制，以及关闭session
    @Override
    public List<Customer> findAllCustomer() {
        return (List<Customer>) ht.find("from Customer");
    }

    @Override
    public void saveCustomer(Customer customer) {
        ht.save(customer);
    }
}
