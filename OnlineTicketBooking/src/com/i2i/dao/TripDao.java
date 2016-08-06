package com.i2i.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.i2i.exception.DatabaseException;
import com.i2i.model.Trip;

/**
 * <p>Dao which permits all tasks related to Trip.
 * </p>
 * @author Shrie Satheyaa
 * @created 2016-08-03
 */
@Repository("tripDao")
public class TripDao extends GenericDao {
    
	/**
     * Updates a Trip object in the record.
     *
     * @param trip 
     *    Trip object which is to be updated
     *
     * @return Trip
     *     Trip object after updation 
     *     
     * @throws DatabaseException 
     *     If there is any interruption occurred in the database.
     */
	public Trip updateTrip(Trip trip) throws DatabaseException{
        Session session = createSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.update(trip);
            transaction.commit();
            return trip;
        } catch (HibernateException e) {
            throw new DatabaseException("Some problem occured while updating trip with id: " + trip.getId() +
            		                   " records", e);
        } 
	}
}
