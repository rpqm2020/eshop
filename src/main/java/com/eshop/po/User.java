package com.eshop.po;

public class User {
private Integer uid;
private String loginname;
private String loginpass;
private String realname;
private Integer age;
private String sex;
public Integer getUid() {
	return uid;
}
public void setUid(Integer uid) {
	this.uid = uid;
}
public String getLoginname() {
	return loginname;
}
public void setLoginname(String loginname) {
	this.loginname = loginname;
}
public String getLoginpass() {
	return loginpass;
}
public void setLoginpass(String loginpass) {
	this.loginpass = loginpass;
}
public String getRealname() {
	return realname;
}
public void setRealname(String realname) {
	this.realname = realname;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
@Override
public String toString() {
	return "User [uid=" + uid + ", loginname=" + loginname + ", loginpass=" + loginpass + ", realname=" + realname
			+ ", age=" + age + ", sex=" + sex + "]";
}

}
