package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
class Dice {
    public static int[] missingRolls(int[] rolls, int mean, int n) { 
	    double total = n*mean;
		double sum=0;
		for(int i=0;i<rolls.length;i++) {
			sum+=rolls[i];
		}
	    double missing = total - sum;
	    if(missing%n==0) {
	        int x = (int)missing/n;
	        if(x>=1 && x<6) {
	            int[] arr = new int[n];
	            Arrays.fill(arr, (int)x);
	            return arr;
	        }
	        return new int[]{};
	    }
	    return new int[]{};
    } 
}

    
}