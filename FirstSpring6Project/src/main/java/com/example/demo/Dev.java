package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



@Component
public class Dev {
	
	@Autowired
	@Qualifier("laptop")
	private Computer com;
	
	private static final Logger logger = LoggerFactory.getLogger(Dev.class);

	public void build() {
		com.compile();
		logger.info("builded awesome project");
	}
}
