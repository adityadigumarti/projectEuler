package com.euler.project;

import java.math.BigDecimal;

public class Problem48 {

	public static void main(String args[]) {
		 BigDecimal sum = new BigDecimal("0");
		 BigDecimal value = new BigDecimal("0");
		 
		 BigDecimal n = null;
		
		
		for(int i = 1; i <= 1000; i++) {
			n = new BigDecimal(String.valueOf(i));
			
			n = n.pow(i);
			
			sum = sum.add(n);
		}
		
		System.out.println("sum = " + sum);
	}
	
	
}
