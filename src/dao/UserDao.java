package dao;

import java.util.List;              
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;

import model.User;
import exception.DatabaseException;

/**
 * <h1> UserDao </h1>
 * <p>  
 * Dao which permits to perform all the database operations related to the User entity.
 * </p>
 *
 * @author Sivaranjani
 * 
 * @created 2016-07-23
 */
public class UserDao extends GenericDao{
 
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
    public void insertUser(User user) throws DatabaseException {
        Session session = createSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (HibernateException e) {
            throw new DatabaseException("Some problem occured while registering " + user.getName() + " !! Try Again !! ", e);
        } finally {
        	closeSession(session);
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
	public boolean isValidUser(String email, String password) throws DatabaseException {
    	boolean isValid = false;
        Session session = createSession();
        try {
            List<User> users = session.createQuery("FROM Users").list();
            for (User user : users) {
            	if (user.getEmail() == email) {
            		if (user.getPassword() == password) {
                    	isValid = true;
                    }
            	}
            }           
        } catch (HibernateException e) {
            throw new DatabaseException("Some problem occured" + e.getMessage(), e); 
        } finally {
        	closeSession(session);
        }
    	return isValid;
    }
}