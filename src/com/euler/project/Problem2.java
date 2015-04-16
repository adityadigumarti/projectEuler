package com.euler.project;

public class Problem2 {

	public static void main(String args[]) {
		int i1 = 0;
		int i2 = 1;
		int i3 = 0;
		
		int sum = 0;
		
		while(i3 < 4000000) {
			i3 = i1 + i2;
			
			if(i3 % 2 == 0 && i3 < 4000000) {
				//System.out.println(i3);
		    	sum += i3;
		    }
		    
		    i1 = i2;
		    i2 = i3;
		}
		
		System.out.println(sum);
	}
	
	
}
