package com.sei.dup.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DupServiceImpl implements DupService {
    
    /*
     * Approach 1 : Remove duplicate integers from array.
     * 
     * Using ArrayList  : check if elements already exist don't add to list.
     * 
     * Negative : Performance issue, because contains scan's complete array list
     */
	@Override
    public Collection<Integer> removeDupList(int[] randomInteger) {
    	List<Integer> intList = new ArrayList<>();
    	
    	for ( int i = 0 ; i < randomInteger.length; i++ ) {
    		if ( !intList.contains( randomInteger[i] ) ) {
    			intList.add( randomInteger[i] );
    		}
    	}
    	
    	return intList;
    }
    
	/*
     * Approach 2 : Remove duplicate integers from array.
     * 
     * Use LinkedHashSet to eliminate duplicates and maintain order.
     * 
     * Better than approach 1, Set interface provided by Java to eliminate duplicates
     */
	@Override
    public Collection<Integer> removeDupSet(int[] randomInteger) {
    	Set<Integer> intSet = new LinkedHashSet<>();
    	
    	for ( int i = 0 ; i < randomInteger.length; i++ ) {
    		intSet.add( randomInteger[i] );	
    	}
    	
    	return intSet;
    }

	/*
     * Approach 3 : Remove duplicate integers from array.
     * 
     * -Ve : Looses the order but eliminates duplicates. 
     */
	@Override
    public int[] removeDup(int[] randomInteger) {    	
    	int len = randomInteger.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (randomInteger[i] == randomInteger[j]) {
                    randomInteger[j] = randomInteger[len-1];
                    len--;
                    j--;
                }
            }
        }

        int[] newArr = new int[len];
        System.arraycopy(randomInteger, 0, newArr, 0, len);
        return newArr;
	}
}