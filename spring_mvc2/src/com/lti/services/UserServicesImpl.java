package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.User;
import com.lti.repository.UserRepository;

@Service("userServices")
public class UserServicesImpl implements UserServices {

	@Autowired
	UserRepository repository;
	@Override
	public User addUser(User u) {
		return repository.addUser(u);
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		 repository.updateUser(u);
	}

	@Override
	public void deleteUser(User u) {
		 repository.deleteUser(u);
		
	}

	@Override
	public User findUserById(int id) {
		User u=repository.findUserById(id);
		return u;
	}



	@Override
	public List<User> findAllUsers() {
		List<User> list=repository.findAllUsers();
		return list;
	}
	
	@Override
	public User login(User u) {

		User userReturn=null;
		User uDB=repository.findUserByEmail(u.getEmail());
		
		if(uDB== null)
		{
			
		}
		
		else if(uDB.getEmail().equals(u.getEmail())&&(uDB.getPassword().equals(u.getPassword())));
		{
			userReturn=uDB;
		}
	
		return userReturn;
	}

}
