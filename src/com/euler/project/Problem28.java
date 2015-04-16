package com.euler.project;

public class Problem28 {

	private static long n = 1001;
	
	public static void main(String args[]) {
		int sum = 1;
		int square = 0;
		int temp = 0;
		
		for(int i = 3; i <= n; i += 2) {
			square = i*i;
			sum += square;
			
			for(int k = 0; k < 3; k++) {
				temp = square - (i - 1);
				System.out.println(temp);
				sum += temp;
				square = temp;
			}	
			
			
		}
		
		System.out.println(sum);
	}
	
	
}
