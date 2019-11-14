package com.lti.services;
import java.util.List;

import com.lti.model.User;

public interface UserServices {

	public User addUser(User u);
	
	public void updateUser(User u);
	
	public void deleteUser(User u);
	
	public User findUserById(int id);
	
	public User login(User u);
	
	public List<User> findAllUsers();
	
}
