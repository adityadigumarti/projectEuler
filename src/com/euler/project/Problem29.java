package com.euler.project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem29 {
	
	public static void main(String args[]) {
		int count = 0;
		List<Double> set = new ArrayList<Double>();
		double d = 0;
		for(int i = 2; i <= 100; i++) {
			for(int j = 2; j <= 100; j++) {
				
				d = Math.pow(i, j);
				if(set.contains(d)) {
					count++;
					System.out.println("i =  " + i + " j  = " + j + " val = " + d);
				}
				set.add(Math.pow(i, j));
			}
		}
		
		System.out.println(count);
		System.out.println(set.size());
	}

}
