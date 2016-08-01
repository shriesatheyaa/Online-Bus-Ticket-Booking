/**
 * 
 */
package com.i2i.service;

import java.sql.Date;
import java.util.List;

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
    public List<TripRoute> getTripRoutes (Route route, Date dateOfTravel) throws DatabaseException {
    	return tripRouteDao.retrieveTripRoutes(route, dateOfTravel);
    }
}
