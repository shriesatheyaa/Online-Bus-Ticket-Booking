/**
 * 
 */
package service;

import java.util.List;

import dao.TripDao;
import exception.DatabaseException;
import model.Trip;

/**
 * <p> Service which permits operations on Trip records</p>
 * @author Shrie Satheyaa
 * @version 1.0
 * @created 2016-07-25 
 */
public class TripService {
	TripDao tripDao = new TripDao();
	
	/*
	 * <p> Gets a list of trips which matches the source and destination cities</p>
	 * @param sourceCity
	 *     Name of Departure City in String type
	 * @param destinationCity
	 *     Name of Arrival City in String type 
	 * @return List of trips which matches the source and destination cities
	 * @throws DatabaseException
	 *     When there is a problem in retrieving records
	 */
	public List<Trip> getTrips ( String sourceCity, String destinationCity) 
			                   throws DatabaseException {
		return tripDao.retrieveTrips(sourceCity, destinationCity);		
	}

}
