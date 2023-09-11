package com.learnArrow.services;

import com.learnArrow.entities.Users;

public interface UsersService {
	String addUser(Users user);
	Users findUserByEmail(String email);
	
	boolean checkEmail(String email);
	
	String saveUsers(Users user);
}
