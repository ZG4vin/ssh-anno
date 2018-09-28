package com.gavin.web.action;

import com.gavin.domain.Customer;
import com.gavin.service.ICustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * 客户的动作类
 */
@Controller
@ParentPackage("struts-default")
@Namespace("/customer")
@Results({
        @Result(name = "addUICustomer",type = "dispatcher",location = "/jsp/customer/add.jsp"),
        @Result(name = "findAllCustomer",type = "dispatcher",location = "/jsp/customer/list.jsp"),
        @Result(name = "listCustomer",type = "redirect",location = "findAllCustomer.action")
})
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    private List<Customer> customers;

    private Customer customer=new Customer();

    @Autowired
    private ICustomerService customerService;

    @Override
    public Customer getModel() {
        return customer;
    }


    /**
     * 添加客户页面
     * @return
     */
    @Action("addUICustomer")
    public String addUICustomer(){
        return "addUICustomer";
    }

    /**
     * 查询所有客户
     * @return
     */
    @Action("findAllCustomer")
    public String findAllCustomer(){
        customers=customerService.findAllCustomer();
        return "findAllCustomer";
    }

    @Action("addCustomer")
    public String addCustomer(){
        customerService.saveCustomer(customer);
        return "listCustomer";
    }
















    //-----getter/setter--------
    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

}
