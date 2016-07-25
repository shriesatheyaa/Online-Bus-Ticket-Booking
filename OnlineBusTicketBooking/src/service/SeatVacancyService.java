package service;

import dao.SeatVacancyDao;
import exception.DatabaseException;
import model.SeatVacancy;

/**
 * <p> Service which permits operations on SeatVacancy records</p>
 * @author Shrie Satheyaa
 * @version 1.0
 * @created 2016-07-25
 */
public class SeatVacancyService {
    SeatVacancyDao seatVacancyDao = new SeatVacancyDao();
    
    public void modifyAvailableSeats(SeatVacancy seatVacancy) throws DatabaseException {
    	seatVacancyDao.updateAvailableSeats(seatVacancy);
    }
}
