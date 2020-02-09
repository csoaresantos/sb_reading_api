package com.css.reading.domain.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.css.reading.domain.User;
import com.css.reading.dto.UserDTO;
import com.css.reading.services.UserServices;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@Autowired
	UserServices userService;

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> getUsers() {
		List<User> users = userService.findAll();
		List<UserDTO> userDTO = users.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok(userDTO);
	}
}
