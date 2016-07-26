/**
 * 
 */
package dao;

import org.hibernate.Session; 
import org.hibernate.Transaction;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import model.Trip;
import exception.DatabaseException;

/**
 * <p>Dao which permits to do database tasks related to 
 * Trip records using Hibernate</p>
 * @author Shrie Satheyaa
 * @version 1.0
 * @created 2016-07-23
 */
public class TripDao extends GenericDao{
	/*
	 * <p>Retrieves All Trip records which has the match in source
	 * and destination cities
	 * </p>
	 * @param sourceCity
	 *     Name of Departure City in String type
	 * @param destinationCity
	 *     Name of Arrival City in String type 
	 * @return List of trips which matches the source and destination cities
	 * @throws DatabaseException
	 *     When there is a problem in retrieving records
	 */
	public List<Trip> retrieveTrips (String sourceCity, String destinationCity)
			                        throws DatabaseException {
        Session session = createSession();
        Transaction transaction = null;
        List<Trip> trips = null;
        try {
            transaction = session.beginTransaction();
            String hql = "FROM Trip T WHERE T.sourceCity.getName() = '"+sourceCity+"',"+
                         "T.destinationCity.getName()= '"+destinationCity+"'";
            Query query = session.createQuery(hql);
            trips = query.list();
            transaction.commit();
        } catch (HibernateException e) {
            throw new DatabaseException("Something went wrong while retrieving " +
                                        "Trip details!!" + e); 
        } finally {
        	closeSession(session); 
        } 
        return trips;
    }
}
