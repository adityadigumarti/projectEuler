package com.project.misc;

public class Problem3 {
	
	public static long findPrimeFactors(long number) {
		
		long val = number;
		long minFactor = 0; 
		
		
		while(minFactor != number) {
			minFactor = getMinFactor(number);
			number = number/minFactor;
			
			System.out.println(minFactor);
		}
		
		return minFactor;
		
	}

	private static long getMinFactor(long number) {
		long minFactor = number;
		
		for(int i = 2; i < Math.sqrt(number); i++) {
			if(number % i == 0) {
				minFactor = i;
				break;
			}
		}
		
		
		return minFactor;
	}

	
	public static void main(String args[]) {
		System.out.println(findPrimeFactors(600851475143l));
	}
}
