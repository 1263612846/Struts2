package com.demo.action;

public class DemoAction {

	private String name;
	private String sex;
	private String age;
	private String num;
	private String phoneNum;

	private String username;
	private String password;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String demo() {
		if (sex.equals("male")) {
			sex = "ÄÐ";
		} else {
			sex = "Å®";
		}
		return "result";
	}

	public String execute() {
		if (("admin").equals(username)) {
			return "success";
		} else {
			return "fail";
		}
	}

}
