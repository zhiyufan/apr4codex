package com.codex;

import java.util.*;

public class Solution {
public class MinimumSwapsToMakeSequencesIncreasing{
	public static int minSwap(int[] A, int[] B) {
        // swap[i]: min swap to make A[0..i] and B[0..i] increasing
        // noswap[i]: min swap to make A[0..i] and B[0..i] increasing
        // and A[i] <= B[i]
        int n = A.length;
        // swap[0] = 1, swap to make A[0] and B[0] increasing
        // noswap[0] = 0, no swap needed to make A[0] and B[0] increasing
        int swap[] = new int[n];
        Arrays.fill(swap, Integer.MAX_VALUE);
        int noswap[] = new int[n];
        Arrays.fill(noswap, Integer.MAX_VALUE);
        swap[0] = 1;
        noswap[0] = 0;
        for(int i = 1; i < n; ++i) {
            if (A[i] > A[i-1] && B[i] > B[i-1]) {                
                if (A[i] > B[i-1] && B[i] > A[i-1]) {
                    // A[i] > B[i-1] && B[i] > A[i-1]: no swap
                    noswap[i] = Math.min(noswap[i], noswap[i-1]);
                    swap[i] = Math.min(swap[i], swap[i-1] + 1);
                } else {
                    // A[i-1] < B[i] && B[i-1] < A[i]
                    // only swap can make A[i-1] and B[i-1] increasing
                    noswap[i] = Math.min(noswap[i], swap[i-1]);
                    swap[i] = Math.min(swap[i], noswap[i-1] + 1);
                }
            }
            
            if (B[i] > A[i-1] && A[i] > B[i-1]) {
                if (B[i] > A[i-1] && A[i] > B[i-1]) {
                    // B[i] > A[i-1] && A[i] > B[i-1]: no swap
                    noswap[i] = Math.min(noswap[i], noswap[i-1]);
                    swap[i] = Math.min(swap[i], swap[i-1] + 1);
                } else {
                    // B[i-1] < A[i] && A[i-1] < B[i]
                    // only swap can make B[i-1] and A[i-1] increasing
                    noswap[i] = Math.min(noswap[i], swap[i-1]);
                    swap[i] = Math.min(swap[i], noswap[i-1] + 1);
                }
            }
        }
        return Math.min(noswap[n-1], swap[n-1]);
    }    
}
    
}