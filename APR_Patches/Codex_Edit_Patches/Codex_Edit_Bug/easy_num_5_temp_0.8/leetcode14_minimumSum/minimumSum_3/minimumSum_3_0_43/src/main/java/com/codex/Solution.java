package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(minimumSum(234));
    }

    public static int minimumSum(int N) {
        
        int minSum = Integer.MAX_VALUE;
        String NStr = String.valueOf(N);
        for (int i = 1; i < NStr.length(); i++) {
            int N1 = Integer.valueOf(NStr.substring(0, i));
            int N2 = Integer.valueOf(NStr.substring(i, NStr.length()));
            minSum = Math.min(minSum, N1 + N2);
        }
        return minSum;
    }

    
}