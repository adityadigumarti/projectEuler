package com.euler.project;

public class Problem4 {
	
	public static boolean isNumberPalindrome(int number) {
		String numStr = String.valueOf(number);
		boolean isPalindrome = true;
		int length = numStr.length();
		
		char[] charArray = numStr.toCharArray();
		
		for(int i = 0; i < length - 1; i++) {
			if(charArray[i] != charArray[length - i -1]) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			if(number % 11 != 0)
				System.out.println(number);
			
		}
		
		return isPalindrome;
	}
	
	
	public static int maxPalindrome() {
		int maxPalindrome = 0;
		for(int i = 999; i >= 100 ; i--) {
			for(int j = 999; j >= 100; j--) {
				if(isNumberPalindrome(i*j)) {
					if((i * j) > maxPalindrome) {
						maxPalindrome = i * j;
					}
				}
			}
		}
		
		return maxPalindrome;
	}
	
	public static void main(String args[]) {
		System.out.println(maxPalindrome());
	}

}
