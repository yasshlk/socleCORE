package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.dao.IUserDao;
import com.capgemini.model.User;

public class UserServiceImpl implements IUserService {
	

	@Autowired
	private IUserDao  userDao;

	public User addUser(User user) {
		
		
		return userDao.save(user);
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.saveAndFlush(user);
	}

	public void deleteUser(Long idUser) {

		userDao.delete(idUser);
	}



	
}
