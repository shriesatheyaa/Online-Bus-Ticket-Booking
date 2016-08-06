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
	
	/**
     * <p>Adds an User object in the record.</p>
     *
     * @param user 
     *    Object of the User to be added
     *
     * @throws DatabaseException 
     *    If there is any failure in adding the user object.
     */
	public void addUser(User user) throws DatabaseException {
		Date createdAt = new Date();
		user.setCreatedAt(createdAt);
		System.out.println("User: " + user);
		userDao.insertUser(user);
	}
	
	/**
     * <p>Adds an User object in the record.</p>
     *
     * @param user 
     *    Object of the User to be added
     *
     * @throws DatabaseException 
     *    If there is any failure in adding the user object.
     */
	public boolean isValid(String email, String password) throws DatabaseException{
		return userDao.authenticateUser(email, password);
	}
	
	/**
     * <p>Gets an User object for the given mail id from the record.</p>
     *
     * @param email 
     *    Mail id of the User to be found
     *
     * @return users
     *    List of User objects found
     *    
     * @throws DatabaseException 
     *    If there is any failure in getting the user object.
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
	
	public void modifyUser(User user) {
		userDao.updateUser(user);
	}
	
}