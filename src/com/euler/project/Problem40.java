package com.euler.project;

public class Problem40 {
	
	public static void main(String args[]) {
		long irrationalNumber = 0;
		int i = 1;
		int length = 0;
		int index = 1;
		int num = 0;
		
		while(irrationalNumber <= 1000000) {
			//System.out.println("I = " + i);
			irrationalNumber += String.valueOf(i).length();
			if(irrationalNumber >= index) {
				System.out.println(i);
				System.out.println(irrationalNumber);
				
				num++;
				index = (int) Math.pow(10, num);				
			}	
			
			i++;
		}
		
		System.out.println(irrationalNumber);
		
	}

}
