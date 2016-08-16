package cn.tf.action;

import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

//获取servlet的API
//实现servletRequestAware接口
public class ActionDemo3 extends ActionSupport  implements ServletRequestAware{

	private HttpServletRequest request;
	public String execute() throws Exception {
		
		System.out.println(request);
		
		return null;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
		
	}
	
	
}
