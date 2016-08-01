/**
 * 
 */
package com.i2i.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i2i.dao.RouteDao;
import com.i2i.exception.DatabaseException;
import com.i2i.model.Route;

/**
 * <p>Service which permits to perform all the tasks related to Route</p>
 * @author Shrie Satheyaa
 * @created 2016-08-01
 */
@Service("routeService")
public class RouteService {
	
	@Autowired 
	RouteDao routeDao;
	public Route getRoute (String sourceCityName, String destinationCityName) throws DatabaseException {
		return routeDao.retrieveRoute(sourceCityName, destinationCityName);
	}
}
