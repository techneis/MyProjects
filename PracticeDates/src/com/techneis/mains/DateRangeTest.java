/**
 * 
 */
package com.techneis.mains;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author Neeraj
 *
 */
public class DateRangeTest {

	/**
	 * @param args
	 */
	public static List<Date> getDateRange(Date startDate, Date endDate){
		List<Date> listOfDates= new ArrayList<>();
		Calendar startCalendar= new GregorianCalendar();
		startCalendar.setTime(startDate);

		Calendar endCalendar= new GregorianCalendar();
		endCalendar.setTime(endDate);
		
		
		while(startCalendar.before(endCalendar)){
			Date date= startCalendar.getTime();
			listOfDates.add(date);
			//From start calendar keep adding one to the date section
			startCalendar.add(Calendar.DATE, 1); 
		}
		System.out.println("Date Range: "+listOfDates.size());
		return listOfDates;
	}
	
	public static float calculateAge(){
		Date startDate= new Date(1985, 1, 8);
		Date endDate= new Date(2017, 6, 11);
		
		List<Date> datesList= getDateRange(startDate, endDate);
		
		int size= datesList.size();
		float age=size/365;
		
		System.out.println("The age is : "+ age +" year(s).");
		return age;
	}
	
	public static void main(String[] args) {
		
		System.out.println("<Inside Main> The age is: "+calculateAge() +" year(s).");
	}

}
