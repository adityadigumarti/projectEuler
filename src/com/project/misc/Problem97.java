package com.project.misc;

import java.math.BigDecimal;

public class Problem97 {
	
	public static void main(String args[]) {
		long num = 28433;
		
		for(long i = 1; i <= 7830457; i++) {
			num = num * 2;
			
			num = getLast10(num);
		}

		System.out.println(num + 1);
	}

	private static long getLast10(long num) {
		String s = String.valueOf(num);
		
		if(s.length() > 10) {
			s = s.substring(s.length() - 10, s.length());
		}
		
		return Long.parseLong(s);
	}

}
