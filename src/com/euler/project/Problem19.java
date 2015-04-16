package com.euler.project;

import java.util.Calendar;

public class Problem19 {
	
	public static void main(String args[]) {
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.YEAR, 1900);
		calendar.set(Calendar.MONTH, 11);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		
		int numOfSundays = 0;
		
		for(int year = 1901; year < 2001; year++) {
			calendar.set(Calendar.YEAR, year);
			for(int month = 0; month < 12; month++) {
				calendar.set(Calendar.MONTH, month);
				System.out.println(calendar.getTime());
				System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
				
				if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
					numOfSundays++;
				}
				
			}
		}
		
		System.out.println("\n\n Number of Sundays " + numOfSundays);
		
	}

}
