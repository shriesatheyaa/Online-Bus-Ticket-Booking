/**
 * 
 */
package com.i2i.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.i2i.exception.DatabaseException;
import com.i2i.model.Reservation;

/**
 * <p>Dao which permits all tasks related to Reservation.
 * </p>
 * @author Shrie Satheyaa
 * @created 2016-08-01
 */
@Repository("reservationDao")
public class ReservationDao extends GenericDao {
    
	/**
     * <p>
     * Inserts Reservation details into the database.
     * </p>
     *
     * @param reservation 
     *     Reservation object that is to be inserted into the database. 
     *     
     * @throws DatabaseException 
     *     If there is any interruption occurred in the database.
     */
	public void insertReservation(Reservation reservation) throws DatabaseException{
        Session session = createSession();
        Transaction transaction = null;
        try {
        	if (reservation.getNoOfSeatsBooked() <= reservation.getTripRoute().getTrip().getSeatVacancy()) {
                transaction = session.beginTransaction(); System.out.println("transaction : " + transaction);
                session.save(reservation);
                transaction.commit();
                System.out.println("Reserved Successfully");
        	} else {
        		throw new DatabaseException("Sorry. We dont have enough seats!");
        	}
        } catch (HibernateException e) {
            throw new DatabaseException("Some problem occured while inserting reservation details with id" 
                                        + reservation.getId() + " records", e);
        } 
	}
}
