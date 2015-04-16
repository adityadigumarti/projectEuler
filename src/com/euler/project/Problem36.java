package com.euler.project;

import java.util.Date;

public class Problem36 {

	private static long limit = 1000000l;
	
	public static void main(String[] args) {
		long initTime = new Date().getTime();
		
		int count = 0;
		long sum = 0;
		for(int i = 0; i < 1000000; i++) {
			if(isPalindrome(String.valueOf(i))) {
				if(isPalindrome(Integer.toBinaryString(i))) {
					count++;
					sum += i;
					//System.out.println(i + "   " + Integer.toBinaryString(i));
				}
			}
		}
		
		System.out.println((new Date().getTime() - initTime));
		System.out.println(sum);
	}

	private static boolean isPalindrome(String str) {
		boolean isPalindrome = false;
		for(int i = 0; i <= str.length()/2; i++) {
			if(str.charAt(i) == str.charAt(str.length() - 1 - i)) {
				isPalindrome = true;
				continue;
			}else {
				isPalindrome = false;
				i = str.length() + 6;
			}
		}
		
		return isPalindrome;
	}
	
	
}
