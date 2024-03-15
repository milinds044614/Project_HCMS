package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Employees;
import com.amigos.entities.Users;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsersDAOImpl implements UsersDAO {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from Users", Users.class).getResultList();
	}

	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).saveOrUpdate(user);
	}

	@Override
	public void updateUser(Users user) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).merge(user);
	}

	@Override
	public void deleteUser(Users obj) {
		// TODO Auto-generated method stub
		entityManager.unwrap(Session.class).remove(obj);
	}

	@Override
	public Users getUserById(int userId) {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).get(Users.class, userId);
	}
	
	
}
