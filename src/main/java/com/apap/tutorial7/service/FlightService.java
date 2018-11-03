package com.apap.tutorial7.service;


import java.util.List;

import com.apap.tutorial7.model.FlightModel;

/**
 * 
 * FlightService
 * @author ivanabdurrahman
 *
 */
public interface FlightService {
	FlightModel getFlightDetailById (Long id);
	
	FlightModel getFlightDetailByFlightNumber (String flightNumber);
	
	void addFlight(FlightModel flight);
	
	void deleteFlightById(Long id);
	
	List<FlightModel> getFlightList();
}
