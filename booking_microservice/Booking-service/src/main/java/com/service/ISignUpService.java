package com.service;

import com.entity.SignUp;
import com.exception.InvalidCredentialsException;

public interface ISignUpService {

	public SignUp createUser(SignUp signup);
	
	public boolean loginUser(String username, String password) throws InvalidCredentialsException;

	public SignUp logout(String userName);
}
