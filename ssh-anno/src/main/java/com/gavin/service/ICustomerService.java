package com.gavin.service;

import com.gavin.domain.Customer;

import java.util.List;

/**
 * 客户的业务层接口
 */
public interface ICustomerService {
    /**
     * 查询所有客户
     * @return 所有客户
     */
    List<Customer> findAllCustomer();

    /**
     * 保存用户
     */
    void saveCustomer(Customer customer);
}
