package cn.javass.hello.struts2impl.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


/*
 * 
 * 第一种实现模型驱动方式是通过实现ModelDriven接口，然后通过	public Object getModel() 
 * 方法返回模型对象
 * 
 * */
public class LoginAction extends ActionSupport implements ModelDriven {

	Customer customer = new Customer();

	// business logic
	public String execute() {
		System.out.println("进入execute方法");
		return SUCCESS;

	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return customer;
	}

}
