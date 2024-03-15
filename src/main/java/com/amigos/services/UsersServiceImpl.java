package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.UsersDAO;
import com.amigos.entities.Users;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersDAO usersDAO;

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return usersDAO.getAllUsers();
	}

	@Override
	public void addUsers(Users user) {
		// TODO Auto-generated method stub
		usersDAO.addUser(user);
	}

	@Override
	public void updateUsers(Users user) {
		// TODO Auto-generated method stub
		usersDAO.updateUser(user);
	}

	@Override
	public void deleteUsers(Users user) {
		// TODO Auto-generated method stub
		usersDAO.deleteUser(user);
	}

	@Override
	public Users getUsersById(int userId) {
		// TODO Auto-generated method stub
		return usersDAO.getUserById(userId);
	}

	
	
	
}
