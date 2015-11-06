package com.joy.s2sh.action;

import java.util.Date;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.joy.s2sh.entity.User;
import com.joy.s2sh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("struts-default")
@Namespace("/user")
public class UserAction extends ActionSupport {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 6288582921624795957L;

	@Autowired
	private UserService userService;

	private String userName;
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Action(value = "add", results = { @Result(name = "success", location = "/index.jsp") })
	public String addUser() {
		User user = new User();

		user.setId(4L);
		user.setUserName("lisi");
		user.setUserPassword("123456");
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());

		userService.save(user);
		return "success";
	}
}
