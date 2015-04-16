package com.project.misc;

import java.math.BigDecimal;
import java.util.Date;

public class Problem104 {
	
	public static void main(String args[]) {
		Date date = new Date();
		long initTime = date.getTime();
		
		BigDecimal n1 = new BigDecimal("1");
		BigDecimal n2 = new BigDecimal("1");
		BigDecimal n3 = new BigDecimal("0");
		
		String s = null;
		
		long i = 3;
		int k = 0;
		
		while(true) {
			n3 = n1.add(n2);
			
			s = n3.toString();
			k++;
			
			if(k > 10000) {
				System.out.println(i);
				k = 0;
				System.gc();
			}
			
			if(isDoublePandigital(s)) {
				System.out.println("\n\n\n Answer ");
				System.out.println(i);
				System.out.println(s);
				
				System.out.println("\n\n\n Time Taken - "  + (new Date().getTime() - initTime));
				
				break;
			}
			
			
			n1 = n2;
			n2 = n3;
			i = i + 1l;
			n3 = null;
			
			
		}	
	}
	
	
	public static boolean isDoublePandigital(String s) {
		return isStartPandigital(s) && isEndPandigital(s);
		
	}
	static boolean isStartPandigital(String s) {
		if(s.length() < 10) {
			return false;
		}
		
		boolean isStartPandigital = true;
		String first9 = s.substring(0, 9);
		int char0 = (int)'0';
		
		for(int i = 1; i < 10; i++) {
			if(first9.indexOf((char) (char0 + i)) == -1) {
				isStartPandigital = false;
				break;
			}
		}
		
		return isStartPandigital;
	}
	
	
	public static boolean isEndPandigital(String s) {
		if(s.length() < 10) {
			return false;
		}
		
		
		boolean isEndPandigital = true;
		String first9 = s.substring(s.length() - 9, s.length());
		int char0 = (int)'0';
		
		for(int i = 1; i < 10; i++) {
			if(first9.indexOf((char) (char0 + i)) == -1) {
				isEndPandigital = false;
				break;
			}
		}
		
		return isEndPandigital;
	}

}
