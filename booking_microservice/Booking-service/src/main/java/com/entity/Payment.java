package com.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int paymentId;
	private int cardNumber;
	private String cardHolderName;	
	private String expirationDate;
	private long cvv;
	
}
