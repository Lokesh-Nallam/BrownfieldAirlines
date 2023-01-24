package com.hackathon.CheckinMicroservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.CheckinMicroservice.entity.CheckInList;

public interface ICheckInRepository extends JpaRepository<CheckInList,Long>{

	Optional<CheckInList> findByBookid(long bookingid);

}
