package com.sei.dup.main;

import java.util.Collection;

import com.sei.dup.service.DupService;
import com.sei.dup.service.DupServiceImpl;
import com.sei.dup.util.Util;

public class DeDup {
	
	public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
             20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
             13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};   
	
	/**
	 * Approach 2 better than Approach 1 & 3.  
	 */
	public static void main(String[] args) {
		DeDup deDup = new DeDup();
		DupService service = new DupServiceImpl();
		
    	long start = System.currentTimeMillis();
    	System.out.println( "Approach 1 - Started " );
    	Collection<Integer> dupList = service.removeDupList( deDup.randomIntegers );
    	System.out.println( "Approach 1 : " + deDup.printInt(dupList) );
    	System.out.println( "Approach 1 - Ended at : " + Util.getTotalTime(start));
    	
    	System.out.println( "Approach 2 - Started " );    	
    	Collection<Integer> dupSet = service.removeDupSet( deDup.randomIntegers );
    	System.out.println( "Approach 2 : " + deDup.printInt(dupSet) );
    	System.out.println( "Approach 2 - Ended at : " + Util.getTotalTime(start));	
    	
    	System.out.println( "Approach 3 - Started " );    	
    	int[] intArr = service.removeDup( deDup.randomIntegers );
    	for ( int i = 0; i < intArr.length; i++ ) {
    		System.out.print( intArr[i] + " " );
    	}
    	System.out.println();
    	System.out.println( "Approach 3 - Ended at : " + Util.getTotalTime(start));	
    	
	}
	
    public String printInt(Collection<Integer> dupCol) {
    	StringBuffer sb = new StringBuffer(200);
    	
    	for ( Integer i : dupCol ) {
    		sb.append(i);
    		sb.append(" ");
    	}
    	
    	return sb.toString();
    }
    
}