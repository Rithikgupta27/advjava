package com.app.bookshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.bookshop.dao.UserDao;
import com.app.bookshop.model.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User registerUser(User user) {
		
//		User newUser = new User(user.getFirstName(),user.getLastName(),user.getAge(),user.getPassword());
		return userDao.save(user);
	}

	@SuppressWarnings("deprecation")
	@Override
	public User getUser(long userId) {
		// TODO Auto-generated method stub
		User user = userDao.getOne(userId);
		return user; 
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAll(); 
	}

	@Override
	public Optional<User> deleteUser(String userId) {
		
		 Optional<User> user = userDao.findById(Long.parseLong(userId));
		 
		 if(user.isPresent()) {
		userDao.deleteById(Long.parseLong(userId));}
		 else {
			 System.out.println("user not found ");
		 }		 	 
		 return user;
		
	}

}
