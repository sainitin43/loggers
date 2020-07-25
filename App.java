package com.epam.loggingDemo;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App {
	private static final Logger LOGGER = LogManager.getLogger(App.class);

	
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			LOGGER.error("enter principal value");
			double x =sc.nextDouble();
			LOGGER.error("enter time period  ");
             double y =sc.nextDouble();
 			LOGGER.error("enter rate value");
			double z =sc.nextDouble();
			Simpleinterest si=new Simpleinterest(x,y,z);
			si.calculateSI();
			Compoundinterest ci=new Compoundinterest(x,y,z);
			ci.CalculateCI();
		}


	}

}
