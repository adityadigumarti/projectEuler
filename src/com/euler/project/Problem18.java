package com.euler.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem18 {

	public static void main(String args[]) throws IOException {
		int[][] numbers = loadNumbers();
		
		long sum = 0;
		
		sum = findMaxRecursive(0, 0, 14, 14, numbers);
		
		System.out.println(sum);
		
	}
	
	private static long findMaxRecursive(int x1, int y1, int x2, int y2, int[][] numbers) {
		long max = 0;
		if(x1 == x2 && y1 == y2) {
			return numbers[x1][y1];
		}
		
		max = max(findMaxRecursive(x1 + 1, y1, x2, y2 -1, numbers), findMaxRecursive(x1 + 1, y1 + 1, x2, y2, numbers));
		
		System.out.println(max);
		
		return max + numbers[x1][y1];
	}

	private static long max(long n1, long n2) {
		long max = n1;
		if(n1 < n2)  {
			max = n2;
		}
		
		return max;
	}

	private static int[][] loadNumbers() throws IOException {
		int numbers[][] = new int[15][];
		BufferedReader input =  new BufferedReader(new FileReader("/Users/digumarti/Documents/workspace/ProjectEuler/src/com/euler/project/NumbersTriangle.txt"));
		StringTokenizer st = null;
		
		for(int i = 0; i < 15; i++) {
			st = new StringTokenizer(input.readLine());
			numbers[i] = new int[i + 1];
			
			int j = 0;
			while(st.hasMoreElements()) {
				numbers[i][j] = Integer.parseInt(st.nextToken());
				//System.out.println("numbers[" + i + "][" + j + "] = " + numbers[i][j]);
				j++;
			}
		}
		
		
		return numbers;
	}
	
	
	
	
//   private static int findMaxRecursive(int i, int j, int[][] numbers) {
//	   if(i == 0) {
//		   return numbers[i][j];
//	   }
//	   
//	   return numbers[i][j] * findMaxRecursive(i -1, findMax(i, j, numbers), numbers);
//   }
//	
//	
//	private static int findMax(int i, int j, int[][] numbers) {
//		System.out.println("i = " + i + "j = " + j);
//		
//		if(j == 0) {
//			System.out.println(j);
//			return j;
//		}
//		
//		if(j == numbers[i - 1].length) {
//			System.out.println(i - 1);
//			return i - 1;
//		}
//		
//		if(numbers[i - 1][j-1] > numbers[i - 1][j]) {
//			System.out.println(j - 1);
//			return j - 1;
//			
//		}else {
//			System.out.println(j);
//			return j;
//		}
//		
//		
//	}
//

	
	
}
