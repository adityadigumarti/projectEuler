package com.euler.project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem42 {

	private static ArrayList<Integer> triangleNumbers = createTriangleNumberList(50);
	private static Map<Character, Integer> alphabetToNumber =  createMap();
	private static int max = 0;
	
	public static void main(String args[]) throws IOException {
		BufferedReader fileReader = new BufferedReader(new FileReader("C:\\words.txt"));
		
		String sr = fileReader.readLine();
		StringTokenizer st = new StringTokenizer(sr.substring(1, sr.length() - 1), "\",\"");
		int numValue = 0;
		int numTriangleWords = 0;
		
		while(st.hasMoreElements()) {
			numValue = getNumValue((String)st.nextElement());
			if(triangleNumbers.contains(numValue)) {
				numTriangleWords++;
			}
		}
		
		
		System.out.println(numTriangleWords);
		
	}
	

	private static int getNumValue(String str) {
		int numValue = 0;
		
		for(int i = 0; i < str.length(); i++) {
			numValue += alphabetToNumber.get(str.charAt(i));
		}
		
		return numValue;
	}


	private static Map<Character, Integer> createMap() {
		Map map = new HashMap<Character, Integer>();
		
		for(int i = 65; i <=  90; i++) {
			map.put((char)i, i - 64);
		}
		
		for(int i = 97; i <=  122; i++) {
			map.put((char)i, i - 96);
		}
		
		return map;
	}


	private static ArrayList<Integer> createTriangleNumberList(int limit) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= limit; i++) {
			list.add((i * (i + 1))/2);
		}
			
		return list;
	}
	
	
	
	
	
}
