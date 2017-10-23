package com.client.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.client.model.FareMasterPriceResponseVO;
import com.client.model.FlightDetailsVO;
import com.client.model.FlightIndexVO;
import com.client.model.FlightSearch;
import com.client.model.Flights;
import com.client.model.GroupOfFlightsVO;



@Controller
public class DeemContoller {

	@RequestMapping(value="/getFlights",method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody FareMasterPriceResponseVO greeting(@RequestBody FlightSearch flightSearch) {
		System.out.println(" Inside call ");
		
		//http://localhost:8191/flightRetrieveJSON?strFrom=Delhi&strTo=Chennai
		RestTemplate restTemplate = new RestTemplate(); 
        // http://localhost:8191/flightRetrieveJSON?strFrom=Delhi&strTo=Trivandrum
        /*FareMasterPriceResponseVO result = restTemplate.getForObject("http://localhost:8191/flightRetrieveJSON?strFrom={Delhi}&strTo={Chennai}", 
        		FareMasterPriceResponseVO.class,"Delhi","Chennai");*/

        FareMasterPriceResponseVO result = restTemplate.getForObject("http://cg1149:8191/flightRetrieveXML?strFrom={Delhi}&strTo={Chennai}", 
        		FareMasterPriceResponseVO.class,"Delhi","Chennai");
        
        System.out.println("Inside result "+result);  
        FlightIndexVO flightIndexVO = result.getFlightindex();
        
        /*List<GroupOfFlightsVO> grpofFlightsVOList = result.getFlightindex().getGroupOfFlights();
        
        for (GroupOfFlightsVO groupOfFlightsVO : grpofFlightsVOList) {
        	groupOfFlightsVO.getFlightDetails()
        	
            //code
        }*/
        
		return result;		
		
		/*List<FlightDetailsVO> flightsList = new ArrayList<FlightDetailsVO>();
		FlightDetailsVO fd = new FlightDetailsVO();
		fd.setFlightName(flightSearch.getSource());
		flightsList.add(fd);
		
		FlightDetailsVO fd1 = new FlightDetailsVO();
		fd1.setFlightName(flightSearch.getDestination());
		flightsList.add(fd1);
		
		FlightDetailsVO fd2 = new FlightDetailsVO();
		fd2.setFlightName(flightSearch.getDate());			
		flightsList.add(fd2);
		
		Flights flights = new Flights();
		flights.setFlights(flightsList);
		return flights;*/
	}
}
