package com.euler.project;

import java.util.HashSet;
import java.util.Set;

public class Problem47 {
	
	public static void main(String args[]) {
		long number = 1;
		long temp = 0;
		Set<Long> primeFactors1 = new HashSet<Long>();
		Set<Long> primeFactors2 = new HashSet<Long>();
		Set<Long> primeFactors3 = new HashSet<Long>();
		Set<Long> primeFactors4 = new HashSet<Long>();
		
		while(true) {
			number++;
			temp = number;
			primeFactors1 = findPrimeFactors(temp);
			if(primeFactors1.size() == 4) {
				temp++;
				primeFactors2 = findPrimeFactors(temp);
			
				if(primeFactors2.size() == 4 && noCommonFactors(primeFactors1, primeFactors2)) {
					temp++;
					primeFactors3 =  findPrimeFactors(temp);
					if(primeFactors3.size() == 4 && noCommonFactors(primeFactors2, primeFactors3)) {
						temp++;
						primeFactors4 =  findPrimeFactors(temp);
						if(primeFactors4.size() == 4 && noCommonFactors(primeFactors3, primeFactors4)){
							System.out.println(number);
							break;
						}
					}
				}	
			}
		}
		
	}
	
	
	private static boolean noCommonFactors(Set<Long> primeFactors1, Set<Long> primeFactors2) {
		boolean noCommonFactors = true;
		for(Long num : primeFactors1) {
			if(primeFactors2.contains(num)) {
				noCommonFactors = false;
				break;
			}
		}
		
		return noCommonFactors;
	}


	public static Set<Long> findPrimeFactors(long number) {
		long factor = 2;
		Set<Long> primefactors = new HashSet<Long>();
		int div = 0;
		long modulo = 0;
		
		
		while(number != 1) {
			 modulo = number % factor;
			 if(modulo == 0) {
				 primefactors.add(factor);
				 number = number/factor;
			 }else {
				 factor++;
			 }
			 
		}
		
		System.out.println(number + "  " + primefactors);
		return primefactors;
	}

}
