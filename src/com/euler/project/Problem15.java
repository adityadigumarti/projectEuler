package com.euler.project;

import java.math.BigDecimal;

public class Problem15 {
	
	public static void main(String args[]) {
		BigDecimal prod = BigDecimal.ONE;
		for(long i = 21; i <= 40; i++) {
			prod = prod.multiply(new BigDecimal(i));
		}
		
		
		
		BigDecimal div = BigDecimal.ONE;
		for(long i = 1; i <= 20; i++) {
			div = div.multiply(new BigDecimal(i));
		}
		
		System.out.println(prod);
		System.out.println(div);
		
		System.out.println(prod.divide(div, BigDecimal.ROUND_FLOOR));
	}

}
