package com.i2i.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.i2i.exception.DatabaseException;
import com.i2i.model.Reservation;
import com.i2i.model.Route;
import com.i2i.model.TripRoute;
import com.i2i.model.User;
import com.i2i.service.GenericService;
import com.i2i.service.ReservationService;
import com.i2i.service.RouteService;
import com.i2i.service.TripRouteService;
import com.i2i.service.TripService;
import com.i2i.service.UserService;

@Controller
@Scope("session")
@SessionAttributes("sessionObj")
public class ApplicationController {
    @Autowired 
    UserService userService;
  
    @Autowired 
    RouteService routeService;
  
    @Autowired
    TripRouteService tripRouteService;
  
    @Autowired
    ReservationService reservationService;
  
    @Autowired
    TripService tripService;
 
    private User user = null;
    private TripRoute tripRoute = null;
    private ModelAndView modelAndView = new ModelAndView();
    private Reservation reservation = null;
  
    /**
     * <p>Returns the Home page to the user</p>
     *
     * @return ModelAndView
     *     Returns ModelAndView object which is rendered with the View 'HomePage'
     *  
     */
    @RequestMapping(value = "/HomePage")
    public ModelAndView getHomePage() {
        return new ModelAndView("HomePage");
    }
  
    /**
     * <p>Returns the Home page to the user</p>
     *
     * @return ModelAndView
     *     Returns ModelAndView object which is rendered with the View 'HomePage'
     *  
     */
    @RequestMapping(value = "/logOut")
    public ModelAndView getLogOutPage() {
        this.user = null;
        return new ModelAndView("HomePage");
    }
  
  
    /**
     * <p>Returns the Sign Up page to the user</p>
     *
     * @return ModelAndView
     *     Returns ModelAndView object which is rendered with the View 'RegisterPage'
     *  
     */
    @RequestMapping(value = "/registerPage")
    public ModelAndView getRegisterForm() {
        return new ModelAndView("RegisterPage");
    }
  
    /**
     * <p>Returns the Log In page to the user</p>
     *
     * @return ModelAndView
     *     Returns ModelAndView object which is rendered with the View 'LoginPage'
     *  
     */
    @RequestMapping(value = "/loginPage")
    public ModelAndView getLoginForm() {
        return new ModelAndView("LoginPage");

    }
  
    /**
     * <p>Returns the Search Bus page to the user</p>
     *
     * @return ModelAndView
     *     Returns ModelAndView object which is rendered with the View 'SearchBus'
     *  
     */
    @RequestMapping(value = "/searchBusPage")
    public ModelAndView getSearchPage() {
        modelAndView.setViewName("SearchBus");
        return modelAndView;

    }
  
    /**
     * <p>Returns the UserHome page to the user</p>
     *
     * @return ModelAndView
     *     Returns ModelAndView object which is rendered with the View 'UserHomePage'
     *  
     */
    @RequestMapping(value = "/UserHomePage")
    public ModelAndView getUserHomePage() {
        return new ModelAndView("UserHomePage");

    }
  
    /**
     * <p>Registers the new user into the database and displays the login page if registration is successful
     *  and displays exception page if exception occurs in the database</p>
     *
     * @param user
     *     user object whose authentication has to be done
     *   
     * @return ModelAndView
     *     Returns ModelAndView object which is rendered with the View 'LoginPage'
     *     Returns ModelAndView object which is rendered with the View 'ExceptionPage' when exception occurred
     */
    @RequestMapping("/saveUser")
    public ModelAndView saveUserData(@ModelAttribute("user") User user, BindingResult result) {
        try {
            userService.addUser(user);
            return new ModelAndView("LoginPage");
        } catch (DatabaseException e) {
            GenericService.exceptionWriter(e);
            return new ModelAndView("ExceptionPage");
        }
    }
  
    /**
     * <p>Checks the mail-id and password given by the user with the mail-id and password in the database and
     *  displays the userhome page if both values matches with the database and
     *  displays relogin page if the values given by the user doesn't matches with the values in database
     *  and displays exception page some exception occurred in the database
     *
     * @param user
     *     user object whose authentication has to be done
     *
     * @return ModelAndView
     *     Returns ModelAndView object which is rendered with the View 'UserHomePage' for valid user
     *     Returns ModelAndView object which is rendered with the View 'ReLogin' for invalid user
     *     Returns ModelAndView object which is rendered with the View 'ExceptionPage' when exception occurred
     */
   @RequestMapping(value = "/authenticate")
   public ModelAndView authenticateUser(@ModelAttribute("user") User user, BindingResult result) {
     
       boolean isValid;
       try {
           isValid = userService.isValid(user.getEmail(), user.getPassword());

           if (isValid) {
                List<User>users = userService.getUserByMailId(user.getEmail());
                for (User foundUser : users) {
                    this.user = foundUser;
                    modelAndView.addObject("sessionObj", foundUser);
                    modelAndView.setViewName("UserHomePage");
                }
                return modelAndView;
           } else {
               return new ModelAndView("ReLogin");
           }
       } catch (DatabaseException e) {
           GenericService.exceptionWriter(e);
           return new ModelAndView("ExceptionPage");
       }
   }
 
    /**
    * <p>Returns the SearchBus page to the user</p>
    *
    * @return ModelAndView
    *     Returns ModelAndView object which is rendered with the View 'SearchBus'
    *  
    */
   @RequestMapping(value = "/SearchBus", method = RequestMethod.POST)
   public ModelAndView getSearchForm() {
       modelAndView.setViewName("SearchBus");
       return modelAndView;
   }
   

    /**
    * <p>Takes source city, destination city, date of travel as input and
    *  returns the details of available busses if bus is available for the given input </p>
    *   
    * @param source
    *     Source City given by the user
    * @param destination  
    *     destination City given by the user
    * @param date
    *     date of travel given by the user
    *
    * @return ModelAndView
    *     Returns ModelAndView object which is rendered with the View 'ResultBus'
    *     Returns ModelAndView object which is rendered with the View 'ExceptionPage' when exception occurred
    */
   @RequestMapping(value = "/Search",method = RequestMethod.POST)
   public ModelAndView test(@RequestParam("source") String source,
		                    @RequestParam("destination") String destination,@RequestParam("date") String date) {
       DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
       Date travelDate =null;
       try {
           travelDate = df.parse(date);
       } catch (ParseException e) {
           GenericService.exceptionWriter(e);
           return new ModelAndView("ExceptionPage");
       }
   	   java.sql.Date dateOfTravel = new java.sql.Date(travelDate.getTime());
	   Map<String, Object> model = new HashMap<String, Object>();
       List<Route> routes = null;
       try {
           routes = routeService.getRoute(source, destination);
       } catch (DatabaseException e) {
    	  GenericService.exceptionWriter(e);
    	  return new ModelAndView("ExceptionPage");
       }
       for (Route route : routes) {
           try {
        	  model.put("tripRoutes", tripRouteService.getTripRoutes(route, dateOfTravel));
           } catch (DatabaseException e) {
    	      GenericService.exceptionWriter(e);
    	      return new ModelAndView("ExceptionPage");
           }
       }
       modelAndView.addAllObjects(model);
       modelAndView.setViewName("ResultBus"); 
       return modelAndView;
   }       

 
    /**
    * <p>Gets the required trip from the user and redirects to booking page</p>
    *
    * @param tripRouteId
    *     tripRouteId which is to be booked by the user
    *
    * @return ModelAndView
    *     Returns ModelAndView object which is rendered with the View 'PayNow'
    *     Returns ModelAndView object which is rendered with the View 'ExceptionPage' when exception occurred
    */
   @RequestMapping(value = "/ConfirmBooking",method = RequestMethod.POST)
   public ModelAndView getBookingForm(@RequestParam("tripRoutes")int tripRouteId) {
     
     
       Map<String, Object> model = new HashMap<String, Object>();
       List<TripRoute> tripRoutes = new ArrayList<TripRoute>();
     
       try {
         
           tripRoutes.add(tripRouteService.getTripRouteById(tripRouteId));
           model.put("tripRoute", tripRoutes );
           for (TripRoute tripRoute : tripRoutes) {
               this.tripRoute = tripRoute;
           }
           modelAndView.addAllObjects(model);
           modelAndView.setViewName("PayNow");
           return modelAndView;
       } catch (DatabaseException e) {
            GenericService.exceptionWriter(e);
            return new ModelAndView("ExceptionPage");          
       }
   }
 
 
    /**
    * <p>Returns the SearchBus page to the user</p>
    *
    * @return ModelAndView
    *     Returns ModelAndView object which is rendered with the View 'SearchBus'
    *  
    */
   @RequestMapping(value = "/SearchBus", method = RequestMethod.GET)
   public ModelAndView getSearchBusForm() {
       modelAndView.setViewName("SearchBus");
       return modelAndView;
   }
 
    /**
    * <p>Once payment is done the booked ticket is show to the user</p>
    *
    * @param noOfSeatsBooked
    *     noOfSeatsBooked booked by the user
    * @param totalPrice  
    *     totalPrice for the booked tickets
    * @param paymentMode
    *     paymentMode given by the user
    *   
    * @return ModelAndView
    *     Returns ModelAndView object which is rendered with the View 'PaymentSuccess' if payment is success
    *     Returns ModelAndView object which is rendered with the View 'PaymentFailure' if payment is failed
    *     Returns ModelAndView object which is rendered with the View 'ExceptionPage' when exception occurred
    */
   @RequestMapping(value = "/payment")
   public ModelAndView getPaymentPage(@RequestParam("noOfSeatsBooked")int noOfSeatsBooked, 
		                              @RequestParam("totalPrice") double totalPrice, 
		                              @RequestParam("paymentMode") String paymentMode) {
	  
	  boolean status = false;
	  try {
	      tripRoute = tripRouteService.getTripRouteById(tripRoute.getId());
	  } catch (DatabaseException e) {
		  return new ModelAndView("ExceptionPage");
	  }
	  
	  if(noOfSeatsBooked > tripRoute.getTrip().getSeatVacancy()) {
		  return new ModelAndView("ExceptionPage"); 
	  } else {
	      if (paymentMode.equals("Net Banking")) {
		      return new ModelAndView("PaymentFailure");
	      } else {
    		  status = true;
	   	      try {
		   	      reservation = reservationService.addReservation(user, tripRoute, noOfSeatsBooked, totalPrice, paymentMode, status);
		   	      Map<String, Reservation> model = new HashMap<String, Reservation>();
		   	      model.put("reservation", reservation);
		   	      modelAndView.addAllObjects(model);
	              modelAndView.setViewName("PaymentSuccess");
	              return modelAndView;
		      } catch (DatabaseException e) {
		       	  GenericService.exceptionWriter(e);
			      return new ModelAndView("ExceptionPage");
		      }
	      }     	  
	  }
   }
}
 


