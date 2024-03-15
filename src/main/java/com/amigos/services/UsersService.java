package com.amigos.services;

import java.util.List;

import com.amigos.entities.Users;

public interface UsersService {
	List<Users> getAllUsers();

	void addUsers(Users user);

	void updateUsers(Users user);

	void deleteUsers(Users user);

	Users getUsersById(int userId);
}
