package com.euler.project;

import java.math.BigDecimal;

public class Problem55 {
	
	public static boolean[] isLychrel = new boolean[10001];
	public static final int DEPTH = 50;
	
	public static BigDecimal reverseNumber(BigDecimal num) {
		StringBuffer sb = new StringBuffer(num.toString());
		
		return new BigDecimal(sb.reverse().toString());
	}
	
	
	public static void main(String args[]) {
		int count = 0;
		for(int i = 0; i < 10000; i++) {
			if(!isLychrel(new BigDecimal(i), 0)) {
				System.out.println(i);
				count++;
			}
		}
		
		
		System.out.println(count);
	}


	private static boolean isLychrel(BigDecimal i, int count) {
		boolean isLychrel = false;
		
		if(count > DEPTH) {
			return false;
		}
		
		BigDecimal reverse = reverseNumber(i);
		BigDecimal number = reverse.add(i);
		
		if(isPalindrome(number)) {
			isLychrel = true;
		}else {
			isLychrel = isLychrel(number, ++count);
		}
		
		return isLychrel;
	}


	private static boolean isPalindrome(BigDecimal n) {
		String number = n.toString();
		boolean isPalindrome = true;
		
		for(int i = 0; i < number.length()/2; i++) {
			if(number.charAt(i) != number.charAt(number.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
		
	}

}
