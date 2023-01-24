package com.codex;

import java.util.*;

public class Solution {
    public static int getLargest(int[] arr) {
        int[] nonInc = new int[arr.length];
        int[] nonDec = new int[arr.length];
        nonInc[0] = arr[0];
        nonDec[0] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            nonInc[i] = Math.max(arr[i], nonInc[i - 1]);
        }
            nonDec[i] = Math.max(arr[i], nonDec[i - 1]);
        }
        return nonInc[i] + nonDec[i - 1];
    }

    
}