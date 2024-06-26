package org.letsupgrade.controller;

import java.util.List;

import org.letsupgrade.entity.UserBean;
import org.letsupgrade.service.UserServiceWithExceptionHandling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;


@RestController
public class UserController {

	@Autowired
	private UserServiceWithExceptionHandling userService;

	@GetMapping(path = "/users")
	public ResponseEntity<List<UserBean>> getAllUsers() {
		List<UserBean> users = userService.fetchAllUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);

	}

	@GetMapping(path = "/users/{userId}")
	public ResponseEntity<UserBean> getUserById(@PathVariable("userId") Long userId) {
		UserBean user = userService.findById(userId);
		if (user == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.ok(user);
	}

	@DeleteMapping(path = "/users/{userId}")
	public ResponseEntity<String> deleteUserById(@PathVariable("userId") Long userId) {
		if (!userService.existsById(userId)) {
			return new ResponseEntity<String>("User with id " + userId + " doesn't exists", HttpStatus.NOT_FOUND);
		}
		userService.deleteById(userId);
		return new ResponseEntity<String>("User deleted successfully", HttpStatus.OK);
	}

	@PostMapping(path="/users")
	public ResponseEntity<UserBean> createUser(@Valid @RequestBody UserBean user) {
		System.out.println(user);
		UserBean savedUser = userService.create(user);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}
}
