package com.codex;

import java.util.*;

public class Solution {
    public static int[] missingRolls(int[] rolls, int mean, int n) {        
		
		int[] res = new int[n];	
		int[] count = new int[6];
		
		int sum = 0;
		for (int roll : rolls) {
			count[roll-1]++;
			sum += roll;
        }
		
		int meanSum = (sum+(n*mean))/(n+rolls.length);
		int overflows = meanSum - mean;
		for(int i=0;i<overflows;i++) {
			boolean found = false;
			for(int x=count.length-1;x>=0;x--) {
				if(count[x]>0) {
					found = true;
					count[x]--;
					break;
				}
			}
			if(!found) return new int[0];
		}
		int underflows = mean - meanSum;
		for(int i=0;i<underflows;i++) {
			boolean found = false;
			for(int x=0;x<count.length;x++) {
				if(count[x]>0) {
					found = true;
					count[x]--;
					break;
				}
			}
			if(!found) return new int[0];
		}
		for(int i=0;i<n;i++) {
			boolean found = false;
			for(int x=0;x<count.length;x++) {
				if(count[x]>0) {
					found = true;
					count[x]--;
					res[i] = x+1;
					break;
				}
			}
			if(!found) return new int[0];
		}
		return res;
	}
}