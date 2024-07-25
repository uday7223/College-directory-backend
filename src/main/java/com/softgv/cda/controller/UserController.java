package com.softgv.cda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softgv.cda.entity.User;
import com.softgv.cda.responsestructure.ResponseStructure;
import com.softgv.cda.service.UserService;
import com.softgv.cda.util.AuthUser;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	UserService service;

	public ResponseEntity<ResponseStructure<User>> findByUsernameAndPassword(@RequestBody AuthUser authUser) {
		return service.findByUsernameAndPassword(authUser.getUsername(), authUser.getPassword());
	}

}
