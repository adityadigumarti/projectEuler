package com.project.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AllPossiblePermutationStrings {
	
	public static HashSet<String> findAllCombination(String s) {
		HashSet<String> combinations = new HashSet<String>();
		
		if(s.length() == 1) {
			combinations.add(s);
		}else {
			StringBuffer sb = new StringBuffer(s);
			String init = null;
			String last = null;
			
			for(int i = 0; i < s.length(); i++) {
				init = sb.substring(i, i + 1);
				last = sb.substring(0, i) + sb.substring(i + 1, s.length());
				
				combinations.addAll(concatenate(findAllCombination(last), init));
				
				
			}
		}		
		
		return combinations;
		
	}

	private static HashSet<String> concatenate(HashSet<String> findAllCombination, String init) {
		HashSet<String> cancatenated = new HashSet<String>();
		
		Iterator<String> i = findAllCombination.iterator();
		while(i.hasNext()) {
			cancatenated.add(init + i.next());
		}
		
		return cancatenated;
	}

	public static void main(String args[]) {
		System.out.println(findAllCombination("9999"));
	}
	
}
