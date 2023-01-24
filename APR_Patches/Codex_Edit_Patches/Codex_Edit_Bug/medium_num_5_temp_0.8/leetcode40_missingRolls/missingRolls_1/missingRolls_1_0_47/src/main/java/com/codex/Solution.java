package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
public class file {
    public static int[] missingRolls(int[] rolls, int n) {
    	int mean = rolls.length;
    	int sum = mean * (n + rolls.length);
    	for (int roll : rolls) {
    		sum -= roll;
    	}
    	for (int i = 0; i < n; i++) {
    		if (sum % n == 0) {
    			int avg = sum / n;
    			if (avg > 0 && avg <= 6) {
    				int[] res = new int[n];
    				res[i] = avg;
    				sum -= avg;
    				return res;
    			}
    		}
    	}
    	return new int[0];
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] rolls = {3, 2, 1, 2, 3, 4};
        int mean = 2;
        int[] res = missingRolls(rolls, mean);
        if(res.length == 0) {
            System.out.println("There is no missing rolls");
        } else {
            System.out.println(Arrays.toString(res));
        }
    }
}
}