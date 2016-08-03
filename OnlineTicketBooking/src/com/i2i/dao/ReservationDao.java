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
 * <p>Dao which permits all tasks related to Reservation related database tasks using Hibernate.
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
     *     User object that is to be inserted into the database. 
     *     
     * @throws DatabaseException 
     *     If there is any interruption occurred in the database.
     */
	public void insertReservation(Reservation reservation) throws DatabaseException{
        Session session = createSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction(); System.out.println("transaction : " + transaction);
            session.save(reservation);
            System.out.println("TRYYYYYYY");
            transaction.commit();
            System.out.println("Inserted Successfully");
        } catch (HibernateException e) {
            throw new DatabaseException("Some problem occured while inserting reservation details with id" 
                                        + reservation.getId() + " records", e);
        } 
	}
}
