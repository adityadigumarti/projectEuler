package com.euler.project;

public class Problem45 {
	
	
	
	public static void main(String args[]) {
		long a = 287, b = 166, c = 0; 						
		 
		for(;!(b*(3*b-1)/2 == c*(2*c-1));)
		{
		
			while (b*(3*b-1)/2 < c*(2*c-1)) b++;
			while (c*(2*c-1) < b*(3*b-1)/2) c++;
		}
		 
		System.out.println(a + " " + b + " " +c);
		
		System.out.println(a*(a+1)/2 + " " + b*(3*b-1)/2 + " " +c*(2*c-1));
		
	}

}
