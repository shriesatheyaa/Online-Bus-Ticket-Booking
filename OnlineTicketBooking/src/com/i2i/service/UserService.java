package com.i2i.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i2i.dao.UserDao;
import com.i2i.exception.DatabaseException;
import com.i2i.model.User;
//import com.i2i.exception.DatabaseException;

/**
 * <h1> UserService </h1>
 * <p>  
 * service which permits to perform all the User operations
 * </p>
 *
 * @author Sivaranjani
 * 
 * @created 2016-07-23
 */

@Service ("userService")
public class UserService {
	
	@Autowired 
	UserDao userDao;
	public void addUser(User user) throws DatabaseException {
		Date createdAt = new Date();
		user.setCreatedAt(createdAt);
		System.out.println("User: " + user);
		userDao.insertUser(user);
	}
	
	public boolean isValid(String email, String password) throws DatabaseException{
		boolean isValid = false;
		System.out.println("Email : " +email);
		System.out.println("Password : " +password);
		return userDao.authenticateUser(email, password);
	}
	
	public List<User> getUserByMailId(String email) {
		List<User> users = null;
		try {
			users = userDao.retrieveUserByMailId(email);
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
}