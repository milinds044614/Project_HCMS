package com.amigos.dao;

import java.util.List;

import com.amigos.entities.Users;

public interface UsersDAO {
	List<Users> getAllUsers();

	void addUser(Users User);

	void updateUser(Users User);

	void deleteUser(Users obj);

	Users getUserById(int UserId);
}
