package com.project.misc;

import java.io.FileWriter;
import java.io.IOException;

public class Problem26 {
	
	public static void main(String args[]) throws IOException {
		FileWriter fw = new FileWriter("C:\\recurring.txt");
		String n = "";
		for(int i = 1; i <= 1000; i++) {
			n = printDecimals(i);
			if(n.trim().length() != 0)
				fw.write(i + "  " + printDecimals(i) + "\n");
		}
		
		fw.close();
			
	}
	
	
	public static String printDecimals(int number) {
		int i = 0;
		int a = 10;
		int b = number;
		
		String s = "";
		
		while(a % b != 0 && i < 1000) {
			s += a/b;
			a = (a % b) * 10;
			i++;
		}
		
		s += a/b;
		s = "0." + s;
		
		if(i < 100) {
			s = "";
		}
		
		return s;
	}

}
