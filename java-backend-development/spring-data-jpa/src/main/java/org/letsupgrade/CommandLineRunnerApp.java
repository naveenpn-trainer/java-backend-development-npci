package org.letsupgrade;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.letsupgrade.entities.User;
import org.letsupgrade.repository.UserJDBCRepository;
import org.letsupgrade.repository.UserJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerApp implements CommandLineRunner {

	@Autowired
	private UserJPARepository respository;

	@Override
	public void run(String... args) throws Exception {
		respository.save(new User(1L, "Naveen Pn", LocalDate.now().minusYears(25), "95355", "ram@gmail.com",
				"abc@123", LocalDateTime.now(), null));
	}

}
