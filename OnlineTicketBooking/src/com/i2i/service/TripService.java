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
     * @param trip 
     *    Object of the Trip to be updated.
     *
     * @throws DatabaseException 
     *    If there is any failure in retrieving the employee object.
     */
    public void modifySeatVacancy (int noOfSeatsBooked, Trip trip) throws DatabaseException {
    	System.out.println("Service :"+ trip.getId());
    	int seatCount = trip.getSeatVacancy();
    	seatCount = seatCount - noOfSeatsBooked;
    	System.out.println("Seat count :" +seatCount);
    	trip.setSeatVacancy(seatCount);
    	System.out.println("Seat count :" +trip.getSeatVacancy());
        tripDao.updateTrip(trip);
    }
}
