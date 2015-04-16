package com.project.misc;

import java.util.ArrayList;
import java.util.Iterator;

public class Problem24 {

	
	private static int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
	
	public static void main(String args[]) {
       
		System.out.println(findLexographicPermutations("0123456789", 999999));
		
	}
	
	public static String findLexographicPermutations(String s , int n) {
		if(n == 0) {
			return s;
		}
		
		
		int remainder = n%factorials[s.length() - 1];
		int div = n/factorials[s.length() - 1];
		
		String subStr = findSubString(s, div);
		
		return String.valueOf(s.charAt(div)) + findLexographicPermutations(subStr, remainder);
		
	}
	
	public static int findFactorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		int n1 = findFactorial(n - 1);
		
		System.out.println("Factorial " + (n - 1) + "is " + n1);
		
		return n * n1;
	}
	
	
	public static void findPermutations(String s, ArrayList<String> newList) {
		String subStr = "";
		ArrayList<String> list = null;
		
		if(s.length() == 1) {
			newList.add(s);
			return;
		}
		
		Iterator<String> iterator = null;
		String firstStr = "";
		String temp = "";
		
		for(int i = 0; i < s.length(); i++) {
			
			list = new ArrayList<String>();
			subStr = findSubString(s, i);
			
			findPermutations(subStr, list);
			firstStr = String.valueOf(s.charAt(i));
			
			
			iterator = list.iterator();
			while(iterator.hasNext()) {
				temp = firstStr + iterator.next();
				newList.add(temp);
			}
			
			
		}
		
	}
	
	
	public static String findSubString(String s, int pos) {
		String subStr = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(i != pos) {
				subStr += String.valueOf(s.charAt(i));
			}
		}
		
		return subStr;
		
	}
	
}
