package com.euler.project;

public class Problem17 {
	
	public static String[] NUMBERS= {"", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"};
	public static String[] NUMBERS_TENS= {"TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};
	
	
	
	public static void main(String args[]) {
		long length = 0;
		String hundreds = "";
		
		for(int k = 0; k < 10; k++) {
			if(k != 0) {
				hundreds = NUMBERS[k] + "HUNDRED" + "AND";
			}
			for(int i = 0; i < NUMBERS.length ; i++) {
				length += hundreds.length() + NUMBERS[i].length();	
				System.out.println(hundreds + NUMBERS[i]);
			}
			
			for(int i = 0; i < NUMBERS_TENS.length; i++) {
				for(int j = 0; j < 10; j++) {
					length += hundreds.length() + NUMBERS_TENS[i].length() + NUMBERS[j].length();
					System.out.println(hundreds + NUMBERS_TENS[i] + NUMBERS[j]);
				}
			}
		}
		
		length += "ONETHOUSAND".length();
		System.out.println("ONETHOUSAND");
		
		System.out.println(length);
	}
	
	

}
