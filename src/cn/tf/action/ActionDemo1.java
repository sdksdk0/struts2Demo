package cn.tf.action;

import com.opensymphony.xwork2.Action;

public class ActionDemo1  implements Action  {

	@Override
	public String execute() throws Exception {
	
		//可以使用接口中定义的常量
		
		return SUCCESS;
	}
	
	

}
