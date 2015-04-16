package com.euler.project;

import java.util.ArrayList;
import java.util.List;

public class Problem26 {
	public static void main(String[] args){
		//If the reminder is same...then it will become recurring..find the digit where reminder is the same... 
		
		
		int max = 0;
		int dMax = 0;
		for(int d = 17; d < 18; d++){
			int r=10;					
			List<Integer> rmndrs = new ArrayList<Integer>();		
			int c = 0;
			while(!rmndrs.contains(r)){
				System.out.println(rmndrs);
				System.out.println(r);
				rmndrs.add(r);
				System.out.println(r%d);
				r = 10 * (r%d);
				System.out.println(r);
				c++;
				System.out.println(c);
			}						
			
			
			int cycleLength = c - rmndrs.lastIndexOf(r);			
			if(cycleLength > max){
				max = cycleLength;
				dMax = d;
			}
		}
		System.out.println(dMax);		
	}
}
