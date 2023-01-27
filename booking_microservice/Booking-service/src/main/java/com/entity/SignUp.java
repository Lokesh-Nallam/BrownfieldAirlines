package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author dharicha
 *
 */
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SignUp {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int signId;
    private String fullName;
    private String userName;
    private String email;
    private String password;
    private long loyaltyPoints;
    
	
	@Override
	public String toString() {
		return "SignUp [signId=" + signId + ", fullName=" + fullName + ", userName=" + userName + ", email=" + email
				+ ", password=" + password + ", loyaltyPoints=" + loyaltyPoints + "]";
	}
	public int getSignId() {
		return signId;
	}
	public void setSignId(int signId) {
		this.signId = signId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public SignUp(int signId, String fullName, String userName, String email, String password, long loyaltyPoints) {
		super();
		this.signId = signId;
		this.fullName = fullName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.loyaltyPoints = loyaltyPoints;
	}
	public long getLoyaltyPoints() {
		return loyaltyPoints;
	}
	public void setLoyaltyPoints(long loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}
	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
