package com.css.reading.domain.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.css.reading.domain.User;
import com.css.reading.services.UserServices;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	UserServices userService;

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> getUsers() {
		List<User> users = userService.findAll();
		return ResponseEntity.ok(users);
	}
}
