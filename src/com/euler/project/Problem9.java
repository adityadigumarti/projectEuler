package com.euler.project;

import java.util.Iterator;
import java.util.TreeSet;

public class Problem9 {

	public static void main(String args[]) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		for(int i = 0; i < 501; i++) {
			treeSet.add(i*i);
		}
		
//		Iterator<Integer> i = treeSet.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		Object[] intArray = treeSet.toArray();
		
		for(int j = intArray.length - 1; j >=0; j--) {
			for(int k = j - 1; k >=0; k--) {
				if(treeSet.contains(((Integer)intArray[j] - (Integer)intArray[k]))) {
//					System.out.println(Math.sqrt((Integer)intArray[j] - (Integer)intArray[k]));
//					System.out.println(Math.sqrt((Integer)intArray[j]));
//					System.out.println(Math.sqrt((Integer)intArray[k]));
//					System.out.println();
//					System.out.println();
					if(Math.sqrt((Integer)intArray[j] - (Integer)intArray[k]) + Math.sqrt((Integer)intArray[j]) + Math.sqrt((Integer)intArray[k]) == 1000) {
						System.out.println(Math.sqrt((Integer)intArray[j]));
						System.out.println(Math.sqrt((Integer)intArray[k]));
						
						System.out.println(intArray[j]);
						System.out.println(intArray[k]);
						System.out.println();
						System.out.println();
						
					}
					
				}
			}
		}
		
		
	}
	
}
