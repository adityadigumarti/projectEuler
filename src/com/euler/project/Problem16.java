package com.euler.project;

import java.math.BigDecimal;

public class Problem16 {
	
	public static void main(String args[]) {
		BigDecimal bigDecimal = new BigDecimal(2);
		bigDecimal = bigDecimal.pow(1000);
		
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
