package com.howtodoinjava.logging.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

  private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(Application.class, args);

    LOGGER.info("Info level log message");
    LOGGER.debug("Debug level log message");
    LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
  }
}
