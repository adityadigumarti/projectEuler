package com.euler.project;

import java.util.Date;

public class Problem30 {
	
	public static double[] pow5Array = populateArray();
	
	public static void main(String args[]) {
		long initTime = new Date().getTime();
		
		int sum = 0;
		for(int i = 2; i < 99999999; i++) {
			if(powerSum(i) == i) {
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println((new Date().getTime() - initTime));
		System.out.println(sum);
		
	}

	private static double[] populateArray() {
		double array[] = new double[10];
		for(int i = 0; i < 10; i++) {
			array[i] = Math.pow(i, 5);
		}
		
		return array;
	}
	
	public static long powerSum(int num) {
		long sum = 0;
		String numStr = String.valueOf(num);
		int n = 0;
		
		for(int i = 0; i < numStr.length(); i++) {
			sum = sum += pow5Array[num % 10];
			num = num/10;
		}
		
		return sum;
	}
	
	
	

}
