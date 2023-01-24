package com.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FareDto {

	private long fareId;
	private double economyFare;
	private double premiumFare;
	private double businessFare;
}
