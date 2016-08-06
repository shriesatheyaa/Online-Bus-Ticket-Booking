package com.i2i.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i2i.dao.UserDao;
import com.i2i.exception.DatabaseException;
import com.i2i.model.User;

/**
 * <h1> UserService </h1>
 * <p>  
 * service which permits to perform the User operations
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
	
	/**
     * <p>Adds an User object into the database.</p>
     *
     * @param user 
     *    User Object to be added
     *
     * @throws DatabaseException 
     *    If there is any interruption occurred in adding the user object.
     */
	public void addUser(User user) throws DatabaseException {
		Date createdAt = new Date();
		user.setCreatedAt(createdAt);
		System.out.println("User: " + user);
		userDao.insertUser(user);
	}
	
	/**
     * <p>Authenticates the user by comparing their mail-id and password</p>
     *
     * @param email 
     *    Mail-Id given by the user
     *    
     * @param password
     *    Password given by the user
     *
     * @throws DatabaseException 
     *    If there is any interruption occurred while validating the user.
     */
	public boolean isValid(String email, String password) throws DatabaseException{
		return userDao.authenticateUser(email, password);
	}
	
	/**
     * <p>Returns the user object when the given mail-id matches the mail-id in the database</p>
     *
     * @param email 
     *    Mail id of the User to be found
     *
     * @return users
     *    List of User objects found
     *    
     * @throws DatabaseException 
     *    If there is any interruption occurred while retrieving the user from the database.
     */
	public List<User> getUserByMailId(String email) throws DatabaseException {
		List<User> users = null;
		try {
			users = userDao.retrieveUserByMailId(email);
		} catch (DatabaseException e) {
			e.printStackTrace();
		}
		return users;
	}
}