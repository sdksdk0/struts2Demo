package cn.tf.login;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


public class LoginDemo  extends ActionSupport {
	
	public String login(){
		//获取用户名和密码：
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals(new StringBuffer(password).reverse().toString())){
			request.getSession().setAttribute("user", username);
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
}
