package com.euler.project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Problem79 {
	
	//By Hand :)
//	public static void main(String args[]) throws IOException {
//		 BufferedReader input =  new BufferedReader(new FileReader("C:\\keylog.txt"));
//		 
//		 String key = "";
//		 ArrayList<LinkedList<String>> passwordsList = new ArrayList<LinkedList<String>>();
//		 
//		 while((key = input.readLine()) != null) {
//			 if(isValid(key)) {
//				 for(LinkedList<String> password : passwordsList) {
//					 for(int i = 0; i < key.length(); i++) {
//						 
//					 }
//				 }
//			 }
//		 }
//		 
//	}

	private static boolean isValid(String passwd) {
		return passwd.trim().length() == 3;
	}

}
