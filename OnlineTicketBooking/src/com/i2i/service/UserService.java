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
	public void addUser(User user) {
		Date createdAt = new Date();
		user.setCreatedAt(createdAt);
		System.out.println("User: " + user);
		try {
			userDao.insertUser(user);
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isValid(String email, String password){
		boolean isValid = false;
		try {
			 System.out.println("Email : " +email);
			 System.out.println("Password : " +password);
			 isValid = userDao.authenticateUser(email, password);
			 if (isValid) {
				 System.out.println("WELCOME");				 
			 }
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isValid;
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