package cn.javass.hello.struts2impl.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;



/*
 * 
 * 第一种实现模型驱动方式是通过模型对象的get和set方法，然后再jsp中通过（对象.属性）的方式来存取数据
 * 
 * 
 * */
public class LoginAction2 extends ActionSupport {

	Customer customer = new Customer();

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	// business logic
	public String execute() {
		System.out.println("进入execute2方法");
		System.out.println(customer.getAge()+"-------->"+customer.getName());
		return SUCCESS;

	}

}
