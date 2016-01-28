package com.sei.dup.service;

import java.util.Collection;

/*
 * Service provide 3 approaches to eliminate duplicate for integer array 
 */
public interface DupService {
	
	/**
	 * Eliminate duplicate integers using LinkedHashSet
	 * 
	 * @param randomInteger 	int array
	 * @return					collection of LinkedHashSet. 
	 */
	public Collection<Integer> removeDupSet(int[] randomInteger);
	
	/**
	 * Eliminate duplicate integers using ArrayList 
	 * 
	 * @param randomInteger 	int array
	 * @return					collection of LinkedHashSet.
	 */
	public Collection<Integer> removeDupList(int[] randomInteger);

	/**
	 * Eliminate duplicate integers using ArrayList
	 * 
	 * @param randomInteger 	int array
	 * @return					collection of LinkedHashSet.
	 */
	public int[] removeDup(int[] randomInteger);
	
}
