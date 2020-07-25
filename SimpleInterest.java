package com.epam.loggingDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Simpleinterest {
	private static final Logger LOGGER = LogManager.getLogger(Simpleinterest.class);
 double principal_si,time_si,rate_si;
 double result;
 Simpleinterest(double x,double y,double z)
 {
	 principal_si=x;
	 time_si=y;
	 rate_si=z;
 }
void calculateSI()
{
	result=(principal_si*time_si*rate_si)/100;
	LOGGER.error("The Simple interest for a year is : " +result);
}
}