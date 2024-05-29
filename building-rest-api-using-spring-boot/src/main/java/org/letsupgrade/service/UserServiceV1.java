package org.letsupgrade.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.letsupgrade.entity.UserBean;
import org.springframework.stereotype.Component;

@Component
public class UserServiceV1 {
	private static List<UserBean> users = generateDummyUsers();

	public List<UserBean> fetchAllUsers() {
		return users;
	}

	private static List<UserBean> generateDummyUsers() {
		List<UserBean> users = new ArrayList<UserBean>();
		users.add(new UserBean(1L, "Ram", LocalDate.now().minusYears(25), "9867676", "ram@gmail.com", "abc@123",
				LocalDateTime.now(), null));
		users.add(new UserBean(2L, "Krishna", LocalDate.now().minusYears(45), "786786734", "krishna@gmail.com",
				"abc@123", LocalDateTime.now(), null));
		return users;
	}

	public UserBean findById(Long userId) {
		/*
		 * for(UserBean user:users) { if(user.getUserId() == userId) { return user; } }
		 * return null;
		 */
		return users.stream().filter(user -> user.getUserId() == userId).findFirst().orElse(null);
	}

	public void deleteById(Long userId) {
		users.removeIf(user -> user.getUserId().equals(userId));
	}
	
	public boolean existsById(long userId) {
		return users.stream().anyMatch(user -> user.getUserId() == userId);
	}
}