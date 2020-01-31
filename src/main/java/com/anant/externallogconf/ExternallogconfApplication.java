package com.anant.externallogconf;

import java.io.UnsupportedEncodingException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternallogconfApplication implements CommandLineRunner {
	
	private static final Logger LOGGER = LogManager.getLogger(ExternallogconfApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ExternallogconfApplication.class, args);
	}

	@Override
	public void run(String... param) throws UnsupportedEncodingException {
		LOGGER.warn("\n\n");
		LOGGER.warn("+==============================================================+");
		LOGGER.warn("|                                                              |");
		LOGGER.warn("|This should be the default log before logging is reconfigured.|");
		LOGGER.warn("|                                                              |");
		LOGGER.warn("+==============================================================+");

		Configurator.initialize(null, "/path/to/external/log4j2.xml");

		LOGGER.warn("\n\n");
		LOGGER.warn("+==================================================+");
		LOGGER.warn("|                                                  |");
		LOGGER.warn("|This should be the reconfigured log.              |");
		LOGGER.warn("|                                                  |");
		LOGGER.warn("|All following logging will be in this format only.|");
		LOGGER.warn("|                                                  |");
		LOGGER.warn("+==================================================+");
	}

}
