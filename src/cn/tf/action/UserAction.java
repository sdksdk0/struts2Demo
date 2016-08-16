package cn.tf.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	public String addUser(){
		System.out.println("addUser执行了");
		return SUCCESS;
	}
	
	public String delUser(){
		System.out.println("delUser执行了");
		return SUCCESS;
	}
}
