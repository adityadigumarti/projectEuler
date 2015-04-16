package com.euler.project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class Problem14 {
	
	public static void main(String args[]) throws IOException {
		BufferedReader input =  new BufferedReader(new FileReader("/Users/digumarti/Documents/workspace/ProjectEuler/src/com/euler/project/numbers.txt"));
		BigDecimal bigDecimal = new BigDecimal("0");
		BigDecimal temp = null;
		
		for(int i = 0; i < 100; i++) {
			temp = new BigDecimal(input.readLine());
			System.out.println(temp.toPlainString());
			bigDecimal = bigDecimal.add(temp);
		}
		
		
		 System.out.println(bigDecimal.toPlainString());
		 System.out.println(bigDecimal.toString());
	}

}
