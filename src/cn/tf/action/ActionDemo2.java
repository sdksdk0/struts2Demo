package cn.tf.action;

import com.opensymphony.xwork2.ActionSupport;

public class ActionDemo2 extends ActionSupport{


	public String add()  {
		System.out.println("add执行了");
		
		return SUCCESS;
	}
	
	

}
