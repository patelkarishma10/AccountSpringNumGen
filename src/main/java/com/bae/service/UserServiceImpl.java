package com.bae.service;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public ResponseEntity<String> createUser() {

		Random random = new Random();
		Integer num = random.nextInt(899999) + 100000;
		String chars = "abc";
		char letter = chars.charAt(random.nextInt(3));
		String numString = letter + num.toString();
		ResponseEntity<String> retVal = new ResponseEntity<String>(numString, HttpStatus.OK);
		return retVal;
	}

}
