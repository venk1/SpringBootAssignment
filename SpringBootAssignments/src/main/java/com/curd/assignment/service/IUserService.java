package com.curd.assignment.service;

import com.curd.assignment.entity.User;
import com.curd.assignment.entity.UserResponse;

public interface IUserService {

	UserResponse createUser(User user);

	UserResponse updateUser(User user, Integer userId);

	UserResponse delete(Integer userId);

}
