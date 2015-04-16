package com.euler.project;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Problem50 {
	
	public static void main(String args[]) {
		BigDecimal maxSum = new BigDecimal(0);
		BigDecimal initPrime = null;
		BigDecimal finalPrime = null;
		int numOfTerms = 0;
		int maxNumOfTerms = 0;
		
		ArrayList<BigDecimal> numbers = findAllPrimes(1000000);
		
		System.out.println(numbers);
		BigDecimal sum =  new BigDecimal(0);
		
		for(int i = 0; i < numbers.size() - 1; i++) {
			sum = BigDecimal.ZERO;
			numOfTerms = 0;
			for(int j = i; j < numbers.size(); j++) {
				numOfTerms++;
				sum = sum.add(numbers.get(j));
				//System.out.println("sum " + sum + " numTerms " + (j - i));
				if(numbers.indexOf(sum) >= 0 && numOfTerms > maxNumOfTerms) {
					maxSum = sum;
					maxNumOfTerms = numOfTerms;
					System.out.println("maxSum " + maxSum);
					System.out.println("InitNumber " + numbers.get(i));
					System.out.println("FinalNumber " + numbers.get(j));
					System.out.println("Number Of Terms " + numOfTerms);
				}
			}
		}
		
		
		
		System.out.println(maxSum);
		
	}
	
	
	private static ArrayList<Integer> getNumbers(int number) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <=  number; i++) {
			list.add(i);
		}
		
		return list;
	}


	private static ArrayList<BigDecimal> findAllPrimes(long limit) {
		ArrayList<BigDecimal> numbers = new ArrayList<BigDecimal>();
		
		for(long i = 2; i < limit; i++) 
			numbers.add(new BigDecimal(i));
			for(int i = 0; i <= Math.sqrt(limit);i++)
				for(int j = i + 1; j < numbers.size(); j++) {
					if(numbers.get(j).intValue() % numbers.get(i).intValue() == 0) {
						numbers.remove(j);
					}
				}
	  
		
		return numbers;
	}

}
