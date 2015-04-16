package com.euler.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Problem23 {
	
	public static void main(String args[]) {
		long initTime = new Date().getTime();
		
		List<Integer> abundantNumbers = new ArrayList<Integer>();
		for(int i = 1; i <= 28123; i++ ) {
			if(isAbundantNumber(i)) {
				abundantNumbers.add(i);
			}
		}
		
		Set<Integer> hashSet = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a = 0, b = 0, c = 0;
		
		for(int x = 0; x < abundantNumbers.size(); x++) {
			for(int y = x; y < abundantNumbers.size(); y++) {
				a = abundantNumbers.get(x);
				b = abundantNumbers.get(y);
				c = a + b;
				if(c <= 28123) { 
					hashSet.add(c);
				}
			}
		}
		
		long n = 28123;
		long total = n *(n + 1)/2;
		
		Iterator<Integer> it = hashSet.iterator();
		//long finalSum = 
		while(it.hasNext()) {
			total -= it.next();
		}
		
		System.out.println((new Date().getTime() - initTime));
		System.out.println(total);
		
		
		System.out.println(sumOfProperDivisors(25));
		
	}
	
	
	public static boolean isAbundantNumber(int number) {
		return number < sumOfProperDivisors(number);	
	}
	
	private static int sumOfProperDivisors(int number) {
		int sum = 0;
		for(int i = 1; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				sum += i;
				if(number/i != i && i != 1) {
					sum += number/i;
				}
			}
			
			
		}
		
		return sum;
	}

}
