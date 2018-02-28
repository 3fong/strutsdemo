package com.yonyou.demo;

/**
 * @Description: TODO
 * @author liulei
 * @date 2018年1月11日 下午3:31:26
 */
public class HelloWorldAction {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute() throws Exception {
		System.out.println("fkalfjlakjf...");
		return "success";
	}
}
