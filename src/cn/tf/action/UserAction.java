package cn.tf.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

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
	public String login(){
		
		HttpServletRequest  request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		HttpServletResponse response=ServletActionContext.getResponse();
		ServletContext  sc=ServletActionContext.getServletContext();
		System.out.println(request);
		System.out.println(session);
		System.out.println(response);
		System.out.println(sc);
		return SUCCESS;
	}
	
	
}
