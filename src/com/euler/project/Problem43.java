package com.euler.project;

import java.util.ArrayList;
import java.util.HashSet;

import com.project.misc.AllPossiblePermutationStrings;

public class Problem43 {

	public static void main(String args[]) {
		long sum = 0;
		HashSet<String> numbers = null;
		String s1 = "";
		String s2 = "";
		
		for(int i = 0; i <= 9; i++) {
			s1 = "";
			s2 = "";
			for(int j = 0; j <= 9; j++) {
				if(i == j) {
					s1 = "" + i;
				}else {
					s2 += j;
				}
			}
			
			numbers = AllPossiblePermutationStrings.findAllCombination(s2);
			for(String number : numbers) {
				if(isNumberDivisible(s1 + number)) {
					System.out.println(s1 + number);
					sum += Long.parseLong(s1 + number);
				}
			}
		}
		
		System.out.println(sum);
	}

	private static boolean isNumberDivisible(String number) {
		String subString = "";
		boolean isNumberDivisible = false;
		
		if(Long.parseLong(number.substring(1, 4)) % 2 == 0) {
			if(Long.parseLong(number.substring(2, 5)) % 3 == 0) {
				if(Long.parseLong(number.substring(3, 6)) % 5 == 0) {
					if(Long.parseLong(number.substring(4, 7)) % 7 == 0) {
						if(Long.parseLong(number.substring(5, 8)) % 11 == 0) {
							if(Long.parseLong(number.substring(6, 9)) % 13 == 0) {
								if(Long.parseLong(number.substring(7, 10)) % 17 == 0) {
									isNumberDivisible = true;
								}
							}
						}
					}
				}
			}
		}
		
		return isNumberDivisible;
		
	}
	
}
