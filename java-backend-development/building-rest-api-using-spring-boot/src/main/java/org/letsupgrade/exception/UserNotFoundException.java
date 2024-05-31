package org.letsupgrade.exception;

import java.text.MessageFormat;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(Long id) {
		super(MessageFormat.format("User not found with id:{0}",id));
	}

}
