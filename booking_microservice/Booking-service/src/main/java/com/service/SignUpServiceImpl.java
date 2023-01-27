package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.SignUp;
import com.exception.InvalidCredentialsException;
import com.repository.ISignUpRepository;


@Service
public class SignUpServiceImpl implements ISignUpService {

	@Autowired
	ISignUpRepository signRepo;
	@Override
	public SignUp createUser(SignUp signup) {
		
		return signRepo.save(signup);
		
	}
	@Override
	public boolean loginUser(String username, String password) throws InvalidCredentialsException {
		
		SignUp user=signRepo.findByUserName(username);
		
		if(user!=null && user.getPassword().equals(password))
		{
			return true;
		}
		else 
			return false;
	}
	@Override
	public SignUp logout(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
