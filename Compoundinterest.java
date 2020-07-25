package com.epam.loggingDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Compoundinterest {
	private static final Logger LOGGER = LogManager.getLogger(Compoundinterest.class);

	double aount;
	double prncipal_ci;
	double rat_ci;
	double time_ci;
	Compoundinterest(double x,double y,double z)
	{
		prncipal_ci=x;
		rat_ci=y;
		time_ci=z;
	}
void CalculateCI()
{
	aount=principal_ci * Math.pow(1 + rate_ci/100, time_ci);
	LOGGER.error("The compound interest for a year is : " +aount);
}
}