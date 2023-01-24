package com.codex;

import java.util.*;

public class Solution {
    public static void sortColors(int[] A) {
        int red = 0;
        int blue = A.length-1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                A[i] = A[red];
                A[red] = 0;
                red++;
            } else if (A[i] == 2) {
                A[i] = A[blue];
                A[blue] = 2;
                blue--;
                i--;
            }
        }
    }

    
}