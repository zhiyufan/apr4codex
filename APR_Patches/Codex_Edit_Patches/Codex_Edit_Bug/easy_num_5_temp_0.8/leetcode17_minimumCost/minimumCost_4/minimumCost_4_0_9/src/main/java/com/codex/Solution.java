package com.codex;

import java.util.*;

public class Solution {
public int[] mergeSortedArray(int[] A, int[] B) {
        int[] res = new int[A.length + B.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < A.length && j < B.length) {
            res[index++] = A[i] < B[j] ? A[i++] : B[j++];
        }
        while (i < A.length) {
            res[index++] = A[i++];
        }
        while (j < B.length) {
            res[index++] = B[j++];
        }
        return res;
    }        
}