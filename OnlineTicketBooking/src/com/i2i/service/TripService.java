package com.i2i.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i2i.dao.TripDao;
import com.i2i.exception.DatabaseException;
import com.i2i.model.Trip;
/**
 * <p>Service which permits to perform all the tasks related to Trip</p>
 * @author Shrie Satheyaa
 * @created 2016-08-03
 */

@Service("tripService")
public class TripService {
    @Autowired
    TripDao tripDao;
    
	/**
     * Updates a Trip object in the record.
     *
     * @param noOfSeatsBooked 
     *    noOfSeatsBooked booked by the updated.
     *
     * @return Trip
     *     Trip object after modifying number of seat vacancies
     *     
     * @throws DatabaseException 
     *     If there is any interruption occurred in the database.
     */
    public Trip modifySeatVacancy (int noOfSeatsBooked, Trip trip) throws DatabaseException {
    	int seatCount = trip.getSeatVacancy();
    	seatCount = seatCount - noOfSeatsBooked;
    	trip.setSeatVacancy(seatCount);
        return tripDao.updateTrip(trip);
    }
}
