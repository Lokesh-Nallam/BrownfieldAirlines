package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.SignUp;

@Repository
public interface ISignUpRepository extends JpaRepository<SignUp,Integer>{

	SignUp findByUserName(String username);

}
