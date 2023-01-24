package com.hackathon.CheckinMicroservice.service;

import org.springframework.stereotype.Service;

import com.hackathon.CheckinMicroservice.entity.BaggageList;
import com.hackathon.CheckinMicroservice.entity.CheckInList;
import com.hackathon.CheckinMicroservice.exception.BookingIdNotFoundException;

@Service
public interface ICheckInService {

	long checkIn(CheckInList checkin);

	CheckInList getCheckInRecord(long id) throws BookingIdNotFoundException;

	long bagTag(BaggageList bList) throws BookingIdNotFoundException;

}
