package com.euler.project;

import java.util.Date;

public class Problem34 {
	
	public static long[] factorialArray = {1l,1l,2l,6l,24l,120l,720l,5040l,40320l,362880l};
	
	public static void main(String args[]) {
		long initTime = new Date().getTime();
		
		for(int i = 0; i <= 9999999; i++) {
			if(factorialSum(i) == i) {
				System.out.println(i);
			}
		}
		
		System.out.println((new Date().getTime() - initTime));
	}
	
	
	public static long factorial(int n) {
		if(n == 1 || n == 0) {
			return 1;
		}else {
			return n * factorial(n - 1);
		}
	}
	
	public static long factorialSum(int num) {
		long sum = 0;
		String numStr = String.valueOf(num);
		int remainder = 0;
		int n = 0;
		int div = 10;
		
		for(int i = 0; i < numStr.length(); i++) {
			sum = sum += factorialArray[num % 10];
			num = num/10;
		}
		
		return sum;
	}
	

}
