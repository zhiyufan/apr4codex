package com.codex;

import java.util.*;

public class Solution {
    public static int CountFrogs(int X, int[] A) {

        int[] leaves = new int[X + 1];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            leaves[A[i]] += 1;
            while (leaves[count + 1] > 0) {
                count++;
            }
            if (count == X) {
                return i;
            }
        }
        return -1;
    }

    
}