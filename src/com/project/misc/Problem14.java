package com.project.misc;

public class Problem14 {
	
	public static void main(String args[]) {
		long maxSequenceLength = 0;
        long sequenceLength = 0;
        long number = 0;
		
		for(int i = 999999; i > 13; i--) {
		     sequenceLength = sequenceLength(i);
		     if(sequenceLength > maxSequenceLength) {
		    	 maxSequenceLength = sequenceLength;
		    	 number = i;
		    	 
		    	 System.out.println("maxSequenceLength " + maxSequenceLength);
		    	 System.out.println("number " + number);
		    	 
		     }
		}
		
		
		System.out.println("\n\n\n\nFinal maxSequenceLength " + maxSequenceLength);
   	 	System.out.println("\n\n\n\nFinal number " + number);
	}
	

   public static long sequenceLength(long number) {
	   long sequenceLength = 1;
	   
	   
	   while(number != 1) {
		   if(number % 2 == 0) {
			   number = number/2;
		   }else {
			   number = 3* number + 1;
		   }
		   
		  sequenceLength++;
	   }
	   
	   
	   return sequenceLength;
	   
   }

}