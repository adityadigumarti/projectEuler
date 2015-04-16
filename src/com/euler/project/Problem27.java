package com.euler.project;

import java.util.HashMap;
import java.util.HashSet;

import com.project.misc.PrimeNumbers;


public class Problem27 {
	
	public static HashMap<Long, Boolean> primeNumbers = new HashMap<Long, Boolean>();
	
	public static void main(String args[]) {
		
		int a = 1;
		int b = 1;

		int max = 0;
		int maxA = 0, maxB = 0, max1 = 0, max2 = 0, temp, tempB;
		
		for(a = -999; a < 1000; a++) {
			for(b = -999; b < 1000; b++) {
				temp = findNumOdPrimes(a, b);
				
				if(temp > max) {
					max = temp;
					maxA = a;
					maxB = b;
				}
				
			}
		}
		
		
		System.out.println(String.format("Max = %10d A = %3d B = %3d", max, maxA, maxB));
	}

	private static int findNumOdPrimes(int a, int b) {
		System.out.println(String.format("A = %d B = %d", a, b));
		
		int n = 0;
		long number = 0;
		int count = -1;
		
		do {
			number = (long)(n * n) + (long)(a * n) + (long)b;
			count++;
			n++;
		}while(isPrime(number));
		
		return count;
	}

	private static boolean isPrime(long number) {
		if(primeNumbers.get(number) != null) {
			primeNumbers.get(number);
		}
		
		boolean isPrime = PrimeNumbers.isPrime(number);
		primeNumbers.put(number, isPrime);
		
		return isPrime;
	}
	

}
