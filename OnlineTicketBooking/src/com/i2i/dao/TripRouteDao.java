/**
 * 
 */
package com.i2i.dao;

import java.sql.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.i2i.exception.DatabaseException;
import com.i2i.model.Route;
import com.i2i.model.TripRoute;

/**
 * <p>Dao which permits all tasks related to Trip Route related.
 * </p>
 * @author Shrie Satheyaa
 * @created 2016-08-01
 */
@Repository("tripRouteDao")
public class TripRouteDao extends GenericDao {
	
	/**
     * <p>
     * Retrieves a list of Trip Route objects for given route object and date of travel from the database.
     * </p>
     *
     * @param route 
     *     Route object for TripRoute which is to be retrieved. 
     * 
     * @param dateOfTravel 
     *     Date of travel for Trip. 
     * 
     * @return tripRoutes
     *    List of TripRoute objects retrieved
     *    
     * @throws DatabaseException 
     *     If there is any interruption occurred in the database.
     */
	public List<TripRoute> retrieveTripRoutes (Route route, Date dateOfTravel) throws DatabaseException {
        Session session = createSession();
        Transaction transaction = null;
        List<TripRoute> tripRoutes = null;
        try{
            transaction = session.beginTransaction();
            String hql = "FROM " + TripRoute.class.getName() + " tripRoute WHERE tripRoute.route =:route "+
                         "and tripRoute.dateOfTravel =:dateOfTravel";
            Query query = session.createQuery(hql);
            query.setParameter("route", route);
            query.setParameter("dateOfTravel", dateOfTravel);
            tripRoutes = query.list();
            transaction.commit();
        } catch (HibernateException e) {
            throw new DatabaseException("Some problem occured while retrieving route records with route id"+
                                        route.getId() +" and date:"+ dateOfTravel + " records", e);
        }
        return tripRoutes; 
	} 
	
	/**
     * Retrieves a Trip Route object for the given Id from database.
     *
     * @param id 
     *    Id of the Trip Route to be retrieved
     *
     * @return tripRoute
     *    TripRoute object that matches the given Id.
     *
     * @throws DatabaseException 
     *     If there is any interruption occurred in the database while retrieving the record.
     */
    public TripRoute retrieveTripRouteById (int id) throws DatabaseException {
        Session session = createSession();
        TripRoute tripRoute = null;
        try {
        	tripRoute = (TripRoute)session.get(TripRoute.class, id);
        } catch (HibernateException e) {
            throw new DatabaseException("Something went wrong while getting employee details of id:" 
                                        + tripRoute.getId(),e); 
        } finally {
            closeSession(session); 
        }
        return tripRoute;
    }
}
