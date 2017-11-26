package com.curd.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curd.assignment.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

	default void delete(Integer userId){
		User user=findOne(userId);
		user.setActive(false);
		save(user);
	}
}
