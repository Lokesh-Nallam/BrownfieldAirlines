package com.hackathon.CheckinMicroservice.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dharicha
 *
 */
@Entity
@Table(name="checkin")
public class CheckInList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long id;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String flightNumber;
	@Column
	private String flightDate;
	@Column
	private Date checkintime;
	@Column
	private long bookid;
	@Override
	public String toString() {
		return "CheckInList [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", flightNumber="
				+ flightNumber + ", flightDate=" + flightDate + ", checkintime=" + checkintime + ", bookid=" + bookid
				+ "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public Date getCheckintime() {
		return checkintime;
	}
	public void setCheckintime(Date checkintime) {
		this.checkintime = checkintime;
	}
	public long getBookid() {
		return bookid;
	}
	public void setBookid(long bookid) {
		this.bookid = bookid;
	}
	public CheckInList(long id, String firstname, String lastname, String flightNumber, String flightDate,
			Date checkintime, long bookid) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.flightNumber = flightNumber;
		this.flightDate = flightDate;
		this.checkintime = checkintime;
		this.bookid = bookid;
	}
	public CheckInList() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
