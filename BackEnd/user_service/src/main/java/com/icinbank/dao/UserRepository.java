package com.icinbank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icinbank.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
 
	public User findByUsername(String username);
	public User findByEmail(String email);
	public User findByPhone(long phone);
}
