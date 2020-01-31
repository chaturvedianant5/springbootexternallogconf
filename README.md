# Spring boot external logging configuration
Demo Spring boot project to read logging configuration from an external log4j.xml file. Here the log4j.xml file is not kept inside the classpath's resources folder.

Hence the log4j.xml can be kept on a fixed path without keeping it inside the war. The application reads the logging config from this file at runtime and re-initializes the config as per specification.

## Configuring the path for log4j.xml
1. Open the class with the main method.
2. Implements the interface ```org.springframework.boot.CommandLineRunner``` in the class.
3. The implementation of this interface runs specific pieces of code when an application is fully started.
4. In the overriden run method in the main class, add the following:
```
Configurator.initialize(null, "/path/to/external/log4j2.xml");
```
**Note:** Here the Configurator is ```org.apache.logging.log4j.core.config.Configurator```

## Deploy the application
1. Build a war of the application and deploy the same to a tomcat.

## Run the application
1. In the resource class a GET REST API has been exposed.
2. Hitting the URL for the tomcat context of the deployed war prints the logs as per the configuration in the log4j.xml.
