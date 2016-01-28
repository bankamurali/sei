package com.sei.dup.util;

import java.util.concurrent.TimeUnit;

public class Util {
	
	 /*
     * Calculate the total time. 
     */
    public static String getTotalTime(long startTime) {
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(totalTime);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(totalTime);
		long milliSecs = TimeUnit.MILLISECONDS.toMillis(totalTime);
		
		if ( minutes > 0 ) {
			seconds = seconds - minutes * 60;
			milliSecs = milliSecs - (minutes * 60000);
		}		
		
		if ( seconds > 0 ) {
			milliSecs = milliSecs - (seconds * 1000);
		}
		
		return String.format("%d min, %d sec, %d ms", minutes, seconds, milliSecs);
	}
}
