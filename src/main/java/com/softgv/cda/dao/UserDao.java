package com.softgv.cda.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softgv.cda.entity.User;
import com.softgv.cda.repository.UserRepository;

@Repository
public class UserDao {

	@Autowired
	UserRepository repository;

	public Optional<User> findByUsernameAndPassword(String username, String password) {
		return repository.findByUsernameAndPassword(username, password);
	}

}
