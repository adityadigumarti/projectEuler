package com.euler.project;

import java.util.ArrayList;
import java.util.List;

public class Problem39 {
	
	public static List<Long> list = new ArrayList<Long>(); 
	
	public static void main(String[] args) {
		populateList();
		int max = 0;
		ArrayList<String> list = new ArrayList<String>();
		
		for(long i = 999; i > 10; i--) {
			list = findPairs(i);
			
			if(list.size() > max) {
				max = list.size();
				System.out.println(list);
				System.out.println("Perimeter = " + i + " With " + max + " pairs");
			}
		}
	}
	
	public static void populateList() {
		for(Long i = 1l; i < 1000l; i++) {
			list.add(i*i);
		}
	}
	
	public static ArrayList<String> findPairs(long number) {
		ArrayList<String> pairs = new ArrayList<String>();
		
		long thirdNumber = 0;
		for(int i = 0; i < list.size(); i++) {
			for(int j = i ; j < list.size() && ((long)Math.sqrt(list.get(i)) + (long)Math.sqrt(list.get(j)) < number); j++) {
				thirdNumber = number - ((long)Math.sqrt(list.get(i)) + (long)Math.sqrt(list.get(j)));
				
				if(thirdNumber > 0 && thirdNumber * thirdNumber == list.get(i) + list.get(j)) {
					pairs.add(String.format("{ %4d, %4d, %4d }", (long)Math.sqrt(list.get(i)), (long)Math.sqrt(list.get(j)), thirdNumber));
				}
			}
		}
		
		return pairs;
	}

}
