package com.euler.project;

import java.util.ArrayList;

import com.project.misc.PrimeNumbers;

public class Problem37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int count = 0;
		long i = 2;
		long sum = 0;
		ArrayList<String> primeNumbers = new ArrayList<String>();
		
		while(count != 11) {
			if(PrimeNumbers.isPrime(i)) {
				primeNumbers.add(String.valueOf(i));
				
				if(i > 10) {
					if(primeNumbers.containsAll(findAllTruncations(i))) {
						count++;
						sum += i;
						System.out.println(i);
					}
				}
				
			}
			i++;
		}
		
		System.out.println(sum);
		
	}
	
	
	public static ArrayList<String> findAllTruncations(long number) {
		ArrayList<String> truncations = new ArrayList<String>();
		
		String num = String.valueOf(number);
		truncations.add(num);
		
		for(int i = 1; i < num.length(); i++) {
			truncations.add(num.substring(0, num.length() - i));
			truncations.add(num.substring(i, num.length()));
		}
		
		
		
		return truncations;
		
	}

}
