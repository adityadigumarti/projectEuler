package com.euler.project;

import java.math.BigDecimal;

public class Problem20 {
	
	public static void main(String args[]) {
		BigDecimal bigDecimal = new BigDecimal(1);
		
		for(int i = 1; i <= 100; i++) {
			bigDecimal = bigDecimal.multiply(new BigDecimal(i));
		}
		
		String s = bigDecimal.toPlainString();
		
		System.out.println(s);
		
		System.out.println(s.length());
	    long sum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			sum += Integer.valueOf(String.valueOf(s.charAt(i)));
		}
		
		System.out.println(sum);
	}

}
