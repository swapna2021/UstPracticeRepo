package com.ust.OverloadingDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoLogClass {
	
	private static Logger logger=LoggerFactory.getLogger(DemoLogClass.class);
	public static void main(String[] args) {
		 logger.info("info level");
		 logger.debug("debug level");
		 logger.warn("warning level");
		 logger.error("error level");
	}

}
