package com.i2i.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.i2i.exception.DatabaseException;
import com.i2i.model.User;

/**
 * <p>Dao which permits all tasks related to User related database tasks using Hibernate.
 * </p>
 * @author Shrie Satheyaa
 * @created 2016-08-01
 */
@Repository ("userDao")
public class UserDao extends GenericDao {
	
    /**
     * <p>
     * Inserts User details into the database.
     * </p>
     *
     * @param user 
     *     User object that is to be inserted into the database. 
     *     
     * @throws DatabaseException 
     *     If there is any interruption occurred in the database.
     */
	public void insertUser(User user) throws DatabaseException{
        Session session = createSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (HibernateException e) {
            throw new DatabaseException("Some problem occured while inserting " + user.getName() + " records", e);
        } 
	}
	
    /**
     * <p>
     * Validates the user by matching the user email and password
     * </p>
     *
     * @param email 
     *     Email given by the user which should be validated with the given password.
     * @param password
     *     Password given by the user which should be validated with given email   
     *     
     * @return boolean
     *     true if email and password matches
     *     false if email and password does not matches
     *         
     * @throws DatabaseException 
     *     If there is any interruption occurred in the database.
     */
	public boolean authenticateUser(String email, String password) throws DatabaseException {
        Session session = createSession();
        try {
		    String sql = "SELECT * FROM Users WHERE Email = :email and Password= :password";
	    	SQLQuery query = session.createSQLQuery(sql);
 		    query.addEntity(User.class);
    		query.setParameter("email", email);
	    	query.setParameter("password", password);
		    List<User> users = query.list();
     		return(!users.isEmpty());
        } catch (HibernateException e) {
        	throw new DatabaseException("Some problem occured while getting " + email + " records", e);
        }
    }
	
	/**
     * <p>Retrieves an User object for the given mail id from the record.</p>
     *
     * @param email 
     *    Mail id of the User to be found
     *
     * @return users
     *    List of User objects retrieved
     *    
     * @throws DatabaseException 
     *    If there is any failure in getting the user object.
     */
	public List<User> retrieveUserByMailId(String email) throws DatabaseException {
        Session session = createSession();
        List<User> users = null;
        try {
        	String sql = "SELECT * FROM Users WHERE Email = :email";
	    	SQLQuery query = session.createSQLQuery(sql);
 		    query.addEntity(User.class);
    		query.setParameter("email", email);
		    users = query.list();
        } catch (HibernateException e) {
            throw new DatabaseException("Some problem occured while retrieving records" + e.getMessage(), e); 
        } 
        return users;
	}
}
