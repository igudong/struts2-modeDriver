package cn.javass.hello.struts2impl.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;



/*
 * 
 * ��һ��ʵ��ģ��������ʽ��ͨ��ģ�Ͷ����get��set������Ȼ����jsp��ͨ��������.���ԣ��ķ�ʽ����ȡ����
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
		System.out.println("����execute2����");
		System.out.println(customer.getAge()+"-------->"+customer.getName());
		return SUCCESS;

	}

}
