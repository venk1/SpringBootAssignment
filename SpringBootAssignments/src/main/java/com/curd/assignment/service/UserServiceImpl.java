package com.curd.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.assignment.dao.UserDao;
import com.curd.assignment.entity.User;
import com.curd.assignment.entity.UserResponse;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserResponse createUser(User user) {
		User user1=userDao.save(user);
		UserResponse res=new UserResponse();
		res.setUserId(user1.getId());
		res.setResMsg("User has saved the data");
		return res;
	}

	@Override
	public UserResponse updateUser(User user, Integer userId) {
		user.setId(userId);
		userDao.save(user);
		UserResponse res=new UserResponse();
		res.setUserId(userId);
		res.setResMsg("User has updated the data");
		return res;
	}

	@Override
	public UserResponse delete(Integer userId) {
		userDao.delete(userId);
		UserResponse res=new UserResponse();
		res.setUserId(userId);
		res.setResMsg("User has updated the data");
		return res;
	}
}