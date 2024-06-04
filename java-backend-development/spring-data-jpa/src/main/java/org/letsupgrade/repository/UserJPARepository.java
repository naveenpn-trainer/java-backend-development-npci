package org.letsupgrade.repository;

import org.letsupgrade.entities.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Transactional
@Repository
public class UserJPARepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long save(User user) {
		return entityManager.merge(user).getUserId();
	}
}
