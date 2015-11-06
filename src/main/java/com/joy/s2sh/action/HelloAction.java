package com.joy.s2sh.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println(1111111);
		return "success";
	}

}
