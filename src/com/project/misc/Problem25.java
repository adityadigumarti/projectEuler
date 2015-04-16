package com.project.misc;

import java.math.BigDecimal;

public class Problem25 {
	
	public static void main(String args[]) {
		BigDecimal n1 = new BigDecimal("1");
		BigDecimal n2 = new BigDecimal("1");
		BigDecimal n3 = new BigDecimal("0");
		
		String s = null;
		
		int i = 3;
		
		while(true) {
			n3 = n1.add(n2);
			
			s = n3.toString();
			
			System.out.println(s);
			
			if(s.length() == 1000) {
				System.out.println(i);
				
				break;
			}
			
			
			n1 = n2;
			n2 = n3;
			i++;
			
			
		}
	}
	
	
	

}
