package com.euler.project;

public class Problem21 {
	
	public static void main(String args[]) {
	   long[] sumOfFactors = new long[30000];
	   for(int i = 0; i < sumOfFactors.length; i++) {
		   sumOfFactors[i] = 0l;
	   }
	   
	   long sum = 0;
	   
	   for(int i = 1; i < 10000; i++) {
		   if(sumOfFactors[i] == 0) {
			   sumOfFactors[i] = findSumOfFactors(i);
		   }
		   
		   if(sumOfFactors[(int)sumOfFactors[i]] == 0) {
			   sumOfFactors[(int)sumOfFactors[i]] = findSumOfFactors(sumOfFactors[i]);
		   }
		   
		   
		   
		   if(i == sumOfFactors[(int)sumOfFactors[i]]) {
			   System.out.println("i = " + i);
			   System.out.println("Sum of factors of i " + sumOfFactors[i]);
			   System.out.println("Sum of Factors of " + sumOfFactors[i] + "  is  " + sumOfFactors[(int)sumOfFactors[i]] + "\n\n");
			   sum = sum + i;
		   }
	   }
	   System.out.println("Sum = " + sum);
	}
	
	
	public static long findSumOfFactors(long n) {
		int sum = 1;
		
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				sum = sum + i;
			}
		}
		
		return sum;
	}

}
