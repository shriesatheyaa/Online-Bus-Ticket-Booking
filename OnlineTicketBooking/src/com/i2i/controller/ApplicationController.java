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
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.i2i.exception.DatabaseException;
import com.i2i.model.Route;
import com.i2i.model.TripRoute;
import com.i2i.model.User;
import com.i2i.service.GenericService;
import com.i2i.service.RouteService;
import com.i2i.service.TripRouteService;
import com.i2i.service.UserService;
@Controller
public class ApplicationController {
    @Autowired   
    UserService userService;
    
    @Autowired   
    RouteService routeService;
    
    @Autowired
    TripRouteService tripRouteService;
    
    private User user = null;
    
    
    @RequestMapping(value = "/HomePage")
    public ModelAndView getHomePage() {
        return new ModelAndView("HomePage");
    }
    
    @RequestMapping(value = "/registerPage")
    public ModelAndView getRegisterForm() {
        return new ModelAndView("RegisterPage");
    }
     
    @RequestMapping(value = "/loginPage")
    public ModelAndView getLoginForm() {
        return new ModelAndView("LoginPage");

    }
    
    @RequestMapping(value = "/searchBusPage")
    public ModelAndView getSearchPage() {
        return new ModelAndView("SearchBus");

    }
    
    @RequestMapping(value = "/UserHomePage")
    public ModelAndView getUserHomePage() {
        return new ModelAndView("UserHomePage");

    }
    
    @RequestMapping(value = "/NoBusAlertPage")
    public ModelAndView getNoBusAlertPage() {
        return new ModelAndView("NoBusAlertPage");

    }
   
    @RequestMapping("/saveUser")
    public ModelAndView saveUserData(@ModelAttribute("user") User user, BindingResult result) {
        System.out.println("Save User Data");
        System.out.println(userService);
        System.out.println(user);
        try {
			userService.addUser(user);
	        return new ModelAndView("LoginPage");
		} catch (DatabaseException e) {
			GenericService.exceptionWriter(e);
			return new ModelAndView("ExceptionPage");
		}
    }
   
    
   @RequestMapping("/authenticate")
   public ModelAndView authenticateUser(@ModelAttribute("user") User user, BindingResult result) {
       System.out.println("Authenticate");
       System.out.println(userService);
       System.out.println(user);
       
       this.user = user;
       
       if (user.getEmail() != "") {
           if (user.getPassword() != ""){
    		   boolean isValid;
			   try {
				   isValid = userService.isValid(user.getEmail(), user.getPassword());
         	       if (isValid) {
	    	           return new ModelAndView("UserHomePage");
	    	       } else {
	    	           return new ModelAndView("ReLogin");
	    	       }
         	       
			    } catch (DatabaseException e) {
				    GenericService.exceptionWriter(e);
				    return new ModelAndView("ExceptionPage");
			    } 
			} else {
        	    return new ModelAndView("LoginPage");
            }
        } else {
    	    return new ModelAndView("LoginPage");
        }
    }
   
   @RequestMapping(value = "/SearchBus", method = RequestMethod.POST)
   public ModelAndView getSearchForm() {
       return new ModelAndView("SearchBus");       
   }
   
   @RequestMapping(value = "/SearchBus", method = RequestMethod.GET)
   public ModelAndView getSearchBusForm() {
       return new ModelAndView("SearchBus");       
   }
   
@RequestMapping(value = "/Search",method = RequestMethod.POST)
   public ModelAndView test(@RequestParam("source") String source,
		                    @RequestParam("destination") String destination,@RequestParam("date") String date) {

	   System.out.println("Date not empty");
       DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
       Date travelDate =null;
       try {
           travelDate = df.parse(date);
           System.out.println("dateOfTravel:"+travelDate);
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
       System.out.println(routes);
       for (Route route : routes) {
           try {
        	   model.put("tripRoutes", tripRouteService.getTripRoutes(route, dateOfTravel));
           } catch (DatabaseException e) {
    	       GenericService.exceptionWriter(e);
    	       return new ModelAndView("ExceptionPage");
           }
       }
       System.out.println(model);
       return new ModelAndView("ResultBus",model);
   }         

   
   @RequestMapping(value = "/ConfirmBooking",method = RequestMethod.POST)
   public ModelAndView getBookingForm(@RequestParam("tripRoutes")int tripRouteId) {
	   System.out.println(tripRouteId);
	   Map<String, Object> model = new HashMap<String, Object>();
	   List<TripRoute> tripRoutes = new ArrayList<TripRoute>();
	   
	   try {
		   System.out.println(tripRouteService.getTripRouteById(tripRouteId));
		   tripRoutes.add(tripRouteService.getTripRouteById(tripRouteId));
		   model.put("tripRoute", tripRoutes );
		   System.out.println("MODEL : " + model);
	       return new ModelAndView("PayNow",model);  
		
	   } catch (DatabaseException e) {
	    	e.printStackTrace();
	    	return new ModelAndView("ExceptionPage");	    	
	   }
   }
   
   @RequestMapping(value = "/payment")
   public ModelAndView getPaymentPage() {
       return new ModelAndView("UserHomePage");

   }
}
   
