package com.project.misc;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String args[]) {
		String primeNum = "";
		int index1 = 0;
		int index2 = 0;
		int count = 0;
		
		

		for(long i = 1001; i < 2090021; i++) {
			if(isPrime(i)) {
				primeNum = String.valueOf(i);
				for(int c = (int)'0'; c <= (int)'4'; c++) {
					count = 0;
					primeNum = String.valueOf(i);
					if((index1 = primeNum.indexOf((char)c)) != -1) {
						if((index2 = primeNum.indexOf((char)c, index1)) != -1) {
							for(int j = 0; j <=9; j++) {
								if(isPrime(Long.parseLong(primeNum.replace("" + (char)c, "" + j)))) {
									count++;
								}
							}
							
							if(count >= 8) {
								System.out.println(primeNum + " " + count);
							}
							
						}
					}
				}
				
			}
		}
	}
	
	
	public static boolean isPrime(long number) {
		if(number < 2 ) {
			return false;
		}
		boolean isPrime = true;
	  	
	  	for(int i = 2; i <= Math.sqrt(number); i++) {
	  		if(number % i == 0) {
	  			isPrime = false;
	  			break;
	  		}
	  	}
	  	
	  	return isPrime;
	}
	
	
	public static ArrayList<Integer> findAllPrimeFactors(int number) {
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		
		int temp = number;
		int i = 2;
		
		while(number != 1) {
			while(number % i != 0) {
				i++;				
			}
			
			primeFactors.add(i);
			number = number/i;
		}
		
		return primeFactors;
	}
	
}
