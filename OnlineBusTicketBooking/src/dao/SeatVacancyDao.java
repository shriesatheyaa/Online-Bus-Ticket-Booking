/**
 * 
 */
package dao;

import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.HibernateException;

import model.SeatVacancy;
import exception.DatabaseException;
/**
 * <p>Dao which permits to do database tasks related to 
 * SeatVacancy records using Hibernate</p>
 * @author Shrie Satheyaa
 * @version 1.0
 * @created 2016-07-23
 */
public class SeatVacancyDao extends GenericDao {
	/*
	 * <p>Updates the seatVacancy in the records</p> 
	 * @param seatVacancy
	 *     object of SeatVacancy which has to be updated
	 * @throws DatabaseException
	 *     When there is a problem in updating records
	 */
	public void updateAvailableSeats (SeatVacancy seatVacancy) 
			                          throws DatabaseException {
        Session session = createSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(seatVacancy); 
            transaction.commit();
        } catch (HibernateException e) {
            throw new DatabaseException("Something went wrong while updating " +
                                        "seat vacancy details of trip with id:" + 
            		                    seatVacancy.getTrip().getId(), e); 
        } finally {
        	closeSession(session); 
        } 
    }
}
