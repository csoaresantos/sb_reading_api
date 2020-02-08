package com.css.reading.domain.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.css.reading.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> getUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User("1", "charles", "charles@gmail.com"));
		users.add(new User("2", "soares", "soares@gmail.com"));
		return ResponseEntity.ok(users);
	}
}
