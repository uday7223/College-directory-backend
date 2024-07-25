package com.softgv.cda.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.softgv.cda.dao.UserDao;
import com.softgv.cda.entity.User;
import com.softgv.cda.exceptionclasses.UserNotFoundException;
import com.softgv.cda.responsestructure.ResponseStructure;

@Service
public class UserService {

	@Autowired
	UserDao dao;

	public ResponseEntity<ResponseStructure<User>> findByUsernameAndPassword(String username, String password) {
		Optional<User> optional = dao.findByUsernameAndPassword(username, password);
		if (optional.isEmpty())
			throw new UserNotFoundException();
		ResponseStructure<User> structure = new ResponseStructure<>();
		structure.setHttpCode(HttpStatus.CREATED.value());
		structure.setMessage("User Login Successfull...");
		structure.setBody(optional.get());
		return new ResponseEntity<>(structure, HttpStatus.CREATED);
	}

}
