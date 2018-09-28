package com.gavin.service.impl;

import com.gavin.dao.ICustomerDao;
import com.gavin.domain.Customer;
import com.gavin.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 客户的业务层实现类
 */
@Service
@Transactional(readOnly = false,propagation = Propagation.REQUIRED)
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerDao customerDao;

    @Override
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public List<Customer> findAllCustomer() {
        return customerDao.findAllCustomer();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerDao.saveCustomer(customer);
    }
}
