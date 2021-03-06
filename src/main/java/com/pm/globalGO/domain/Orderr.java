package com.pm.globalGO.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Orderr implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long orderID;
	@Column(nullable = false)
	private String userID;
	@Column(nullable = false)
	private Date time;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private String addressee;
	@Column(nullable = false)
	private String contact;
	@Column(nullable = false)
	private String state;
	
	public Orderr() {
		super();
	}
	public Orderr(Long orderID,String userID,Date time,String address,String addressee,String contact,String state) {
		super();
		this.orderID=orderID;
		this.userID=userID;
		this.time=time;
		this.address=address;
		this.addressee=addressee;
		this.contact=contact;
		this.state=state;
	}
	public Long getOrderID() {
		return orderID;
	}
	public void setOrderID(Long orderID) {
		this.orderID=orderID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID=userID;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time=time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddressee() {
		return addressee;
	}
	public void setAddressee(String addressee){
		this.addressee=addressee;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact){
		this.contact=contact;
	}
	public String getState() {
		return state;
	}
	public void setState(String state){
		this.state=state;
	}
}

