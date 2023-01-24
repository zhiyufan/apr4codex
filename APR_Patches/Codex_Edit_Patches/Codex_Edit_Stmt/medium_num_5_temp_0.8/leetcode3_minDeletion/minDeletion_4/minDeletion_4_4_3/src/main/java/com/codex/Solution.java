package com.codex;

import java.util.*;

public class Solution {
public int minDeletionSize(String[] A) {
        int n = A.length;
        int m = A[0].length();
        int res = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (A[i].charAt(j) > A[i + 1].charAt(j)) {
                    res++;
                    break;
                }
            }
        }    
        return res;
    }   
}