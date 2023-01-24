package com.hackathon.CheckinMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.CheckinMicroservice.entity.BaggageList;

public interface IBaggageRepository extends JpaRepository<BaggageList,Long>{

}
