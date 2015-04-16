package com.euler.project;

import java.math.BigDecimal;
import java.util.HashMap;

public class Problem53 {
	
	public static HashMap<Integer, BigDecimal> factorial = new HashMap<Integer, BigDecimal>();
	
	public static void main(String args[]) throws Exception {
		populateFactorial();
		long count = 0;
		
		BigDecimal million = new BigDecimal(1000000);
		
		for(int n = 1; n <= 100; n++) {
			for(int r = 1; r <= n; r++) {
				try {
					if(nCr(n, r).compareTo(million) == 1) {
						count++;
					}
				}catch(Exception e) {
					System.out.println(n + " " + r);
					throw e;
				}
			}
		}
		
		System.out.println(count);
	}

	private static BigDecimal nCr(int n, int r) {
		BigDecimal nr = factorial.get(n - r);
		BigDecimal r1 = factorial.get(r);
		
		if(factorial.get(n) == null) {
			System.out.println(n);
		}
		
		return factorial.get(n).divide(nr.multiply(r1));
	}

	private static HashMap<Integer, BigDecimal> populateFactorial() {
		for(int i = 0; i <= 100; i++) {
			factorial.put(i, factorial(i));
		}
		
		return factorial;
	}
	
	public static BigDecimal factorial(int n) {
		if(factorial.get(n) != null) {
			return factorial.get(n);
		}
		
		if(n == 0 || n == 1) {
			return new BigDecimal(1);
		}
		
		BigDecimal bd = new BigDecimal(n);
		
		return bd.multiply(factorial(n - 1));
	}

}
