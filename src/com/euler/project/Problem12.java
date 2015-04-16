package com.euler.project;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;



public class Problem12 {
	
	public static void main(String args[]) {
		System.out.println(getPrimeFactors(76576500));
	}
	
	
	public static ArrayList<Long> getPrimeFactors(long number) {
		ArrayList<Long> list = new ArrayList<Long>();
		
		if(number == 1) {
		  list.add(1l);
		  return list;
		}
		
		long divisor = 2;
		while(number != 1) {
			while(true) {
				if(number % divisor == 0) {
					number = number/divisor;
					list.add(divisor);
					divisor = 2;
					break;
				}else {
					divisor++;
				}
			}
		}
		
		return list;
	}

}
