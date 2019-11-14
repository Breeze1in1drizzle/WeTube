package com.Rise435.WeTube.entity;

public class Order extends BaseEntity {
	
	//Order:订单

	private static final long serialVersionUID = 1L;
	
	private Integer oid;//订单id
	private Integer fid;//电影id
	private Integer hid;//放映id
	private Integer uid;//用户id
	private String seats;//座位号
	private double totalPrice;//总价
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", fid=" + fid + ", hid=" + hid + ", uid=" + uid + ", seats=" + seats
				+ ", totalPrice=" + totalPrice + "]";
	}
	
	

}
