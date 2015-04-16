package com.euler.project;

import com.project.misc.PrimeNumbers;

public class Problem46 {
	
	private static boolean[] primeNumbers = new boolean[9000000];
	
	public static void main(String args[]) {
		primeNumbers[2] = true;
		primeNumbers[3] = true;
		primeNumbers[5] = true;
		primeNumbers[7] = true;
		
		for(long i = 9; i < 9000000; i = i + 2) {
			if(!PrimeNumbers.isPrime(i)) {
				if(!isSumOfPrimeAndSquare(i)) {
					System.out.println(i);
					break;
				}
			}else {
				primeNumbers[(int)i] = true;
			}
		}
		
	}

	private static boolean isSumOfPrimeAndSquare(long num) {
		boolean isSumOfPrimeAndSquare = false;
		int index = 0;
		for(int i = 1; i < Math.sqrt(num); i++) {
			index = (int)num - (2 * i * i);
			if(index > 0 && primeNumbers[index]) {
				System.out.println(num + " - " + (num - (2 * i * i)) +  " + " + (2 * i * i));
				isSumOfPrimeAndSquare = true;
				break;
			}
		}
		
		return isSumOfPrimeAndSquare;
	}

}
