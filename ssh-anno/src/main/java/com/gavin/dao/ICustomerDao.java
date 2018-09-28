package com.gavin.dao;

import com.gavin.domain.Customer;

import java.io.Serializable;
import java.util.List;

/**
 * 客户的持久层接口
 */
public interface ICustomerDao {

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
