package org.letsupgrade.repository;

import org.letsupgrade.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserJDBCRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_USER_SQL = "insert into users(full_name, dob,mobile,email,password,create_date,update_date) VALUES(?,?,?,?,?,?,?)";

	public int save(User user) {
		return jdbcTemplate.update(INSERT_USER_SQL, user.getFullName(), user.getDob(), user.getMobile(),
				user.getPassword(), user.getEmail(), user.getCreateDate(), user.getUpdateDate());
	}
}
