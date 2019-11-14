package com.Rise435.WeTube.entity;

import java.util.Date;

public class Hall extends BaseEntity {

	//Hall:放映厅
	
	private static final long serialVersionUID = 1L;

	private Integer hid;//放映id
	private Integer fid;//电影id
	private String seatTable;//座位表
	private String hallName;//放映厅名称
	private Date startTime;//开始时间
	private double filmPrice;//票价
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getSeatTable() {
		return seatTable;
	}
	public void setSeatTable(String seatTable) {
		this.seatTable = seatTable;
	}
	public String getHallName() {
		return hallName;
	}
	public void setHallName(String hallName) {
		this.hallName = hallName;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public double getFilmPrice() {
		return filmPrice;
	}
	public void setFilmPrice(double filmPrice) {
		this.filmPrice = filmPrice;
	}
	@Override
	public String toString() {
		return "Hall [hid=" + hid + ", fid=" + fid + ", seatTable=" + seatTable + ", hallName=" + hallName
				+ ", startTime=" + startTime + ", filmPrice=" + filmPrice + "]";
	}
	
	
}
