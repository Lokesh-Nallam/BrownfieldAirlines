package com.hackathon.CheckinMicroservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="baggage")
public class BaggageList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long id;
	@Column
	private long bookingid;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private int numberofbags;
	@Override
	public String toString() {
		return "BaggageList [id=" + id + ", bookingid=" + bookingid + ", firstname=" + firstname + ", lastname="
				+ lastname + ", numberofbags=" + numberofbags + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getBookingid() {
		return bookingid;
	}
	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getNumberofbags() {
		return numberofbags;
	}
	public void setNumberofbags(int numberofbags) {
		this.numberofbags = numberofbags;
	}
	public BaggageList(long id, long bookingid, String firstname, String lastname, int numberofbags) {
		super();
		this.id = id;
		this.bookingid = bookingid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.numberofbags = numberofbags;
	}
	public BaggageList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
