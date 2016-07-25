package dao;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import exception.DatabaseException;
import service.GenericService;

/**
 * <h1> GenericDao </h1>
 * <p>  
 * Dao which permits to perform all the operations related to the Hibernate like creating and closing session factory, 
 * creating and closing sessions.
 * </p>
 *
 * @author Sivaranjani
 * 
 * @created 2016-06-24
 */
public class GenericDao {
    protected static SessionFactory factory; 

    static {
        createSessionFactory();
    }
 
    /**
     * <p>
     * This method is used to create a session factory
     * </p>
     *
     * @exception DatabaseException 
     *     Exception object created and written into the log file when problem occurs in building a session factory
     */    
    private static void createSessionFactory() {
        try{
            factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) { 
            DatabaseException e = new DatabaseException("Failed to create sessionFactory object", ex);
            GenericService.exceptionWriter(e); 
        } 
    }
    
    /**
     * <p>
     * This method is used to close a session factory.
     * </p>
     *
     * @throws DatabaseException 
     *     If any problem occurs in closing the session factory object or if the session factory object is null
     */
    protected static void closeSessionFactory() throws DatabaseException {
        if (null == factory) {
            throw new DatabaseException(" Could not Proceed : No factory Object !! ");
        } 
        try {
            factory.close();
        } catch (HibernateException ex) {
            throw new DatabaseException("Failed to close sessionFactory object", ex); 
        }
    }
    
    /**
     * <p>
     * This method is used to close the session object. 
     * </p>
     *
     * @param session
     *     Session object that is to be closed.
     *
     * @throws DatabaseException 
     *     If any problem occurs in closing the session object or if the session object is null
     */
    protected void closeSession(Session session) throws DatabaseException {
        if (null == session) {
            throw new DatabaseException(" Could not Proceed : No session Object !! ");
        } 
        try {
            session.close();
        } catch (HibernateException e) {
            throw new DatabaseException(" Problem While Destroying Session Object !!",e);
        }
    }
    
    /**
     * <p>
     * This method is used to close the session object.
     * </p>
     *
     * @param session
     *     Session object that is to be closed.
     *
     * @return Session
     *     Session object 
     * @throws DatabaseException 
     *     If any problem occurs in closing the session object or if the session object is null.
     */
    protected Session createSession() throws DatabaseException {
        if (null == factory) {
            throw new DatabaseException(" Could not Proceed : No SessionFactory Object !! ");
        } 
        try {
            return factory.openSession();
        } catch (HibernateException e) {
            throw new DatabaseException(" Could not Proceed : No Session Object created !!",e);
        }
    }
}
