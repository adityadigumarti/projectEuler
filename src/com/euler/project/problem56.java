package com.euler.project;

import java.math.BigDecimal;

public class problem56 {
	
	public static void main(String args[]) {
		BigDecimal num = null;
		long sum = 0;
		long max = 0;
		int maxNum = 0, maxPow = 0;
		
		for(int i = 1; i <= 99; i++) {
			for(int j = 1; j <= 99; j++) {
				num = new BigDecimal(i);
				sum = sumOfDigits(num.pow(j));
				
				if(sum > max) {
					max = sum;
					maxNum = i;
					maxPow = j;
				}
			}
		}
		
		System.out.println("Max " + max + " maxNum " + maxNum + " Power " + maxPow);
	}

	private static long sumOfDigits(BigDecimal pow) {
		String s = pow.toPlainString();
		long sum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			sum += Long.parseLong(s.substring(i, i + 1));
		}
		
		return sum;
	}

}
