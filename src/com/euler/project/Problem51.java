package com.euler.project;

import java.util.HashSet;
import java.util.Set;

import com.project.misc.PrimeNumbers;

public class Problem51 {
	
	public static void main(String args[]) {
		long number = 100000;
		int commonNumber = 0;
		int count = 0;
		
		for(long init = number; number < 9999999; number++) {
			if(PrimeNumbers.isPrime(number)) {
				for(int i = 0; i <=9; i++) {
					commonNumber = findCommonNumber(number);
					if(PrimeNumbers.isPrime(replaceCommonNumber(number, i))) {
						
					}
				}
			}
		}
		
	}

	private static long replaceCommonNumber(long number, int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int findCommonNumber(long number) {
		Set<String> set = new HashSet<String>();
		
		
		return 0;
	}

}
