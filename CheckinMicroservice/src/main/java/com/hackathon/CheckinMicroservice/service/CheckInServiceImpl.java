package com.hackathon.CheckinMicroservice.service;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hackathon.CheckinMicroservice.entity.BaggageList;
import com.hackathon.CheckinMicroservice.entity.CheckInList;
import com.hackathon.CheckinMicroservice.exception.BookingIdNotFoundException;
import com.hackathon.CheckinMicroservice.repository.IBaggageRepository;
import com.hackathon.CheckinMicroservice.repository.ICheckInRepository;

@Service
public class CheckInServiceImpl implements ICheckInService {
	
	@Autowired
	private ICheckInRepository checkRep;
	@Autowired
	private IBaggageRepository bagRep;
	@Autowired
	private RestTemplate restTemp;

	@Override
	public long checkIn(CheckInList checkin) {
		Date date=new Date();
		checkin.setCheckintime(date);
		long id = checkRep.save(checkin).getId();
		//need to update loyalty and status to boarded using booking
		ResponseEntity<String> st=restTemp.getForEntity("http://localhost:8065/updateStatus/"+checkin.getBookid(),String.class);
		
		return id;
		}

	@Override
	public CheckInList getCheckInRecord(long id) {
		CheckInList ch=checkRep.findById(id).get();
		long bk=ch.getBookid();
		if(bk==0) {
			throw new BookingIdNotFoundException("No booking id found");
		}
		return  ch;
	}

	@Override
	public long bagTag(BaggageList bList) throws BookingIdNotFoundException{
		CheckInList c=checkRep.findByBookid(bList.getBookingid()).get();
		String f=c.getFirstname();
		if(f==""||f==null) {
			throw new BookingIdNotFoundException("No Booking id found");
		}
		long id=bagRep.save(bList).getId();
		return id;
	}

}
