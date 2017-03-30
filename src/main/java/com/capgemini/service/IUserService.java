package com.capgemini.service;

import java.util.List;

import com.capgemini.model.User;



public interface IUserService {
	
	
	public User addUser (User user );
	
	public List<User> getUsers();
	
	public User updateUser(User user);
	
	public void deleteUser(Long idUser);
	

}
