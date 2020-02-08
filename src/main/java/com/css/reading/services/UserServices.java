package com.css.reading.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.css.reading.domain.User;
import com.css.reading.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}
