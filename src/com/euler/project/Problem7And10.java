package com.euler.project;

public class Problem7And10 {
	
	
	public static long findPrime(int primeNumberIndex) {
		int i = 0;
		long number = 1;
		
		while(i < primeNumberIndex) {
			number++;
			if(isPrime(number)) {
				System.out.println(number);
				i++;
			}
		}
		
		return number;
		
	}
	
	public static long sumOfPrime(int limit) {
		long sum = 0;
		for(int i = 2; i <= limit; i++) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static boolean isPrime(long number) {
		boolean isPrime = true;
		
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
	
	public static void main(String args[]) {
		System.out.println(sumOfPrime(2000000));
	}

}
