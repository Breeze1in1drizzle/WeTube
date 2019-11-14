package com.Rise435.WeTube.entity;

public class User extends BaseEntity {

	//User:用户
	
	private static final long serialVersionUID = 1L;

	private Integer uid;//用户id
	private String userName;//用户名字
	private String password;//用户密码
	private Integer gender;//性别
	private String phone;//电话
	private String userAvatar;//头像
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserAvatar() {
		return userAvatar;
	}
	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", password=" + password + ", gender=" + gender
				+ ", phone=" + phone + ", userAvatar=" + userAvatar + "]";
	}
	
	
}
