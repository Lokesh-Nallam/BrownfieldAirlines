package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.SignUp;
import com.exception.InvalidCredentialsException;
import com.service.IBookService;
import com.service.ISignUpService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/signUp")
@AllArgsConstructor
@CrossOrigin
public class SignUpController {

	@Autowired
	ISignUpService signService;
	
	@PostMapping("/add")
    public ResponseEntity<SignUp> addUser(@RequestBody SignUp sign) 
    {
        SignUp s= signService.createUser(sign);
        return new ResponseEntity<SignUp>(s,HttpStatus.CREATED);
        
    }
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody SignUp request) throws InvalidCredentialsException
	{
		if(signService.loginUser(request.getUserName(), request.getPassword()))
		{
			return ResponseEntity.ok().body("login successful");
		}

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
		
	}
	
	@PatchMapping("/logout/{username}")
	public ResponseEntity<SignUp> logout(@PathVariable("userName") String userName) throws InvalidCredentialsException  {
		
		SignUp s = signService.logout(userName);
		return new ResponseEntity<>(s, HttpStatus.OK);
	}
	/*@PostMapping("/updateLoyalty/")
    public ResponseEntity<SignUp> addUser(@RequestBody SignUp sign) 
    {
        SignUp s= signService.createUser(sign);
        return new ResponseEntity<SignUp>(s,HttpStatus.CREATED);
        
    }*/
	
}
