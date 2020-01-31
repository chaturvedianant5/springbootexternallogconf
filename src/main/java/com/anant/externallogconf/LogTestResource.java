/**
 * 
 */
package com.anant.externallogconf;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anant
 *
 */
@RestController
@RequestMapping(path = "/")
public class LogTestResource {
	
	private static final Logger LOGGER = LogManager.getLogger(LogTestResource.class);
	
	@GetMapping(path = "/")
	public ResponseEntity<String> printLog() {
		
		System.out.println("Printing debug log.");
		LOGGER.debug("This is debug log.");
		
		System.out.println("Printing info log.");
		LOGGER.info("This is info log.");
		
		System.out.println("Printing warn log.");
		LOGGER.warn("This is warn log.");
		
		System.out.println("Printing error log.");
		LOGGER.error("This is error log.");
		
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}

}
