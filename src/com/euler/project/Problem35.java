package com.euler.project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import com.project.misc.PrimeNumbers;

public class Problem35 {
	
	private static int limit = 1000000;
	
	public static void main(String args[]) {
		long initTime = new Date().getTime();
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> rotations = null;
		ArrayList<String> cyclicPrimeNumbers = new ArrayList<String>();
		String num = null;
		
		for(long i = 2; i < limit; i++) {
			if(PrimeNumbers.isPrime(i)) {
				num = String.valueOf(i);
				list.add(num);
				rotations = findAllRotations(num);
				
				if(list.containsAll(rotations)) {
					cyclicPrimeNumbers.addAll(rotations);
				}
			}
		}
		
		System.out.println((new Date().getTime() - initTime));
		System.out.println(cyclicPrimeNumbers);
		System.out.println(cyclicPrimeNumbers.size());
		 
	}

	private static ArrayList<String> findAllRotations(String s) {
		int length = s.length();
		ArrayList<String> allRotations = new ArrayList<String>();
		String initString = s;
		String rotatedString = null;
			
		do {
			rotatedString = initString.substring(length - 1, length) + initString.substring(0, length - 1);
			initString = rotatedString;
			allRotations.add(rotatedString);
			
		}while(!rotatedString.equals(s));
		
		
		return allRotations;
	}

	

	
	
	
}
