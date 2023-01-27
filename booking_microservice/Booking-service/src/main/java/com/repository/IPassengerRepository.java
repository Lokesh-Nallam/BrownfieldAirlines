package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Inventory;
import com.entity.Passenger;

@Repository
public interface IPassengerRepository extends JpaRepository<Passenger,Long>{

}
