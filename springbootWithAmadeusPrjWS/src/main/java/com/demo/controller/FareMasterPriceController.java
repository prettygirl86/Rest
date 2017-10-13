package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


import com.demo.model.FlightInformation;
import com.demo.service.FareMasterPriceService;
import com.demo.model.FareMasterPriceResponseVO;
import com.demo.model.FlightDetailsVO;
import com.demo.model.FlightIndexVO;
import com.demo.model.FlightInfoVO;

@Controller
public class FareMasterPriceController {
	
	@Autowired
	public FareMasterPriceService fareMasterPriceServiceObj;
	
	@RequestMapping(value ="fareRetrieve",method=RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody FlightInformation retrieveFare( ) {
        //return new Greeting(counter.incrementAndGet(), String.format(template, name));
		System.out.println("inside faremasterprice");
		return fareMasterPriceServiceObj.getAllFares();
    	
    }

	@RequestMapping(value ="flightRetrieveXML",method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody FareMasterPriceResponseVO retrieveFlightXMLParam(@RequestParam String strFrom, @RequestParam String strTo) {
		System.out.println("inside faremasterprice");
		return fareMasterPriceServiceObj.getAllFlightXML(strFrom, strTo);
    	
    }
	
	@RequestMapping(value ="flightRetrieveXML2",method=RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody FareMasterPriceResponseVO retrieveFlightXMLParam2(@RequestParam String strFrom, @RequestParam String strTo) {
		System.out.println("inside faremasterprice");
		return fareMasterPriceServiceObj.getAllFlightXML(strFrom, strTo);
    	
    }
	
	@RequestMapping(value ="flightRetrieveJSON",method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody FareMasterPriceResponseVO retrieveFlightJSONParam(@RequestParam String strFrom, @RequestParam String strTo) {
		System.out.println("inside faremasterprice");
		return fareMasterPriceServiceObj.getAllFlight(strFrom, strTo);
    	
    }
	
	/*@RequestMapping(value="/getFlights",method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Flights greeting(@RequestBody FlightSearch flightSearch) {
		RestTemplate restTemplate = new RestTemplate(); 
		// http://localhost:8191/flightRetrieveJSON?strFrom=Delhi&strTo=Trivandrum
		FareMasterPriceResponseVO result = restTemplate.getForObject("http://localhost:8191/flightRetrieveJSON?strFrom={strFrom}&strTo={strTo}", FareMasterPriceResponseVO.class,"Delhi","Trivandrum");
	}
*/
}
