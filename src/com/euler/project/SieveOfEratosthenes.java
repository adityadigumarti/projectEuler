package com.euler.project;

import java.util.ArrayList;
import java.util.Date;

public class SieveOfEratosthenes {
	
	private static long limit = 1000000l;
	
	public static void main(String args[]) {
		long initTime = new Date().getTime();
		
		ArrayList<Long> allPrimes = findAllPrimes(limit);
		
		System.out.println((new Date().getTime() - initTime));
		System.out.println(allPrimes.size());
		
//		allPrimes = findAllPrimesSlow(limit);
//		
//		System.out.println((new Date().getTime() - initTime));
//		System.out.println(allPrimes);
		
	}

	private static ArrayList<Long> findAllPrimes(long limit) {
		ArrayList<Long> numbers = new ArrayList<Long>();
		
		for(long i = 2; i < limit; i++) 
			numbers.add(i);
			for(int i = 0; i <= Math.sqrt(limit);i++)
				for(int j = i + 1; j < numbers.size(); j++) {
					if(numbers.get(j) % numbers.get(i) == 0) {
						numbers.remove(j);
					}
				}
	  
		
		return numbers;
	}
	
	
	private static ArrayList<Long> findAllPrimesSlow(long limit) {
		ArrayList<Long> numbers = new ArrayList<Long>();
		
		for(long i = 2; i < limit; i++) { 
			if(isPrime(i)) {
				numbers.add(i);
			}
		}
		
		
		return numbers;
	}
	
	
	public static boolean isPrime(long number) {
	  	boolean isPrime = true;
	  	
	  	for(int i = 2; i <= Math.sqrt(number); i++) {
	  		if(number % i == 0) {
	  			isPrime = false;
	  			break;
	  		}
	  	}
	  	
	  	return isPrime;
	}
	

}
