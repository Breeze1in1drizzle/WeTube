package com.Rise435.WeTube.entity;

public class Person extends BaseEntity {
	
	//Person:人员类型
	
	private static final long serialVersionUID = 1L;
	
	private Integer pid;//人员id
	private Integer fid;//电影id
	private String personName;//人员名称
	private Integer personType;//人员类型 0-导演，1-演员，2-编剧，3制片人
	private String personImage;//人员照片
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Integer getPersonType() {
		return personType;
	}
	public void setPersonType(Integer personType) {
		this.personType = personType;
	}
	public String getPersonImage() {
		return personImage;
	}
	public void setPersonImage(String personImage) {
		this.personImage = personImage;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", fid=" + fid + ", personName=" + personName + ", personType=" + personType
				+ ", personImage=" + personImage + "]";
	}
	
	

}
