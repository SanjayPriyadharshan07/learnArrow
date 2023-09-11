package com.learnArrow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnArrow.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	Users findByEmail(String email);
	
	boolean existsByEmail(String email);
}
