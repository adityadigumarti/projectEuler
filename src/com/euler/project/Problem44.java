package com.euler.project;

import java.util.Date;
import java.util.HashMap;

//46398-3229138407   46613-3259134347 

public class Problem44 {
	
	public static void main(String[] args) {
		long initTime = new Date().getTime();
		HashMap<Long, Long> pandigital = findPandigital(5000l);
		
		
		System.out.println(new Date().getTime() - initTime);
		System.out.println(pandigital.size());
		
		for(long i = 1020; i <= 2000; i++) {
			for(long j = 1; j <= 2000; j++) {
				if(isDiffPandigital(pandigital.get(j), pandigital.get(i + j), pandigital)) {
					System.out.print(j + "-" + pandigital.get(j) +  "   " + (i + j) + "-" + pandigital.get(i + j) + "    ");
					if(isSumPandigital(pandigital.get(i + j), pandigital.get(j), pandigital)) {
						System.out.println("\n Yeahhhhhhhhh " + (i + j) + " " + j + " Diff " + (pandigital.get(i + j) - pandigital.get(j)));
						i = 1000000;
						j = 1000000;
					}
				}
			 }
	   }
		
	
	}
	
	
	private static boolean isDiffPandigital(Long long1, Long long2, HashMap<Long, Long> pandigital) {
		boolean isDiffPandigital = false;
		long num = long1 - long2;
		
		if(pandigital.values().contains(Math.abs(num))) {
			isDiffPandigital = true;
		}
		
		
		return isDiffPandigital;
	}


	private static boolean isSumPandigital(Long long1, Long long2, HashMap<Long, Long> pandigital) {
		boolean isSumPandigital = false;
		long num = long1 + long2;
		
		if(pandigital.values().contains(Math.abs(num))) {
			isSumPandigital = true;
		}
		
		return isSumPandigital;
	}


	private static HashMap<Long, Long> findPandigital(long limit) {
		HashMap<Long, Long> pandigital = new HashMap<Long, Long>();
		long pandigitNum = 0;
		
		for(long i = 1; i <= limit; i++) {
			pandigitNum = (i * (3 * i - 1))/2;
			pandigital.put(i, pandigitNum);
		}
		
		
		return pandigital;
	}

}
