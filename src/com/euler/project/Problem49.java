package com.euler.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import com.project.misc.AllPossiblePermutationStrings;
import com.project.misc.PrimeNumbers;

public class Problem49 {
	
	public static void main(String args[]) {
		HashSet<String> combinations = null;
		TreeSet<Long> allNumbers = null;
		HashMap<Long, String> diffs = null;
		
		TreeSet<Long> primePermutations = null;
		long permutation = 0;
		long diff = 0;
		long prevDiff = 0;
		
		for(long i = 1000; i < 10000; i++) {
			prevDiff = 0;
			diff = 0;
			if(PrimeNumbers.isPrime(i)) {
				combinations = AllPossiblePermutationStrings.findAllCombination(String.valueOf(i));
				allNumbers = convert(combinations, i);
				primePermutations = new TreeSet<Long>();
				
				for(String number : combinations) {
					permutation = Long.valueOf(number);
					if(permutation >= i && PrimeNumbers.isPrime(permutation)) {
						primePermutations.add(permutation);
//						diff = permutation - i;
//						if(prevDiff != 0) {
//							if(prevDiff == diff) {
//								System.out.println(i + ", " + permutation);
//							}else {
//								prevDiff = diff;
//							}
//						}
					}
					
				}
				
				if(primePermutations.size() > 2) {
					diffs = new HashMap<Long, String>();
					Long[] array = getArray(primePermutations);
					
					for(int x = 0; x < array.length; x++) {
						for(int y = x + 1; y < array.length; y++) {
							for(int z = y + 1; z < array.length; z++) {
								if(array[y] - array[x] == array[z] - array[y]) {
									System.out.println(array[x] + ", " + array[y] + ", " + array[z]);
								}
							}
						}
					}
					
				}
				}
			}
		
	}

	private static Long[] getArray(TreeSet<Long> primePermutations) {
		Long[] array = new Long[primePermutations.size()];
		int i = 0;
		for(Long number : primePermutations) {
			array[i++] = number;
		}
		
		return array;
	}

	private static TreeSet<Long> convert(HashSet<String> combinations, long i) {
		TreeSet<Long> set = new TreeSet<Long>();
		long number = 0;
		for(String num : combinations) {
			number = Long.valueOf(num);
			
			
			set.add(number);
			
		}
		
		return set;
	}

}
