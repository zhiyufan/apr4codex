package com.codex;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        int n = 10;
        String s = "5 15 2 14 3 5 2 14 15 14 2 1"; // answer is 7
        int[] A = new int[n];
        int[] B = new int[n];
        String[] temp = s.split("\\s+");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(temp[i]);
            B[i] = A[i];
        }
        int i = 0;
        int j = 0;
        int k = 0;
        int res = 0;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (A[i] > A[j]) {
                    int t = A[i];
                    A[i] = A[j];
                    A[j] = t;
                }
            }
            if (A[i] != B[i]) {
                int t = B[i];
                B[i] = B[j - 1];
                B[j - 1] = t;
                res++;
            }
        }
            System.out.print(A[i] + " ");
        }
        return res;
    }
}