/**
 * 
 */
package com.i2i.service;

import java.sql.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i2i.dao.TripRouteDao;
import com.i2i.exception.DatabaseException;
import com.i2i.model.Route;
import com.i2i.model.TripRoute;

/**
 * <p>Service which permits to perform all the tasks related to TripRoute</p>
 * @author Shrie Satheyaa
 * @created 2016-08-01
 */
@Service("tripRouteService")
public class TripRouteService {
    @Autowired
    TripRouteDao tripRouteDao;
    
    /*
	 * <p>Gets TripRoute records for given route and Date of travel.
	 * </p>
	 * @param route 
     *     Object of Route for which Trip Route object is to be found. 
     * 
     * @param dateOfTravel 
     *     date of travel for Trip.  
     *     
     * @throws DatabaseException 
     *     If there is any interruption occurred in the database.
	 */
    public List<TripRoute> getTripRoutes (Route route, Date dateOfTravel) throws DatabaseException {
    	return tripRouteDao.retrieveTripRoutes(route, dateOfTravel);
    }
    
    /**
     * Gets a Trip Route record for the given Id.
     *
     * @param id 
     *    Id of the Trip Route to be found
     *
     * @return tripRoute
     *    TripRoute object found
     *
     * @throws DatabaseException 
     *    If there is any failure in retrieving the employee object.
     */
    public TripRoute getTripRouteById (int id) throws DatabaseException {
        return tripRouteDao.retrieveTripRouteById(id);
    }
}
