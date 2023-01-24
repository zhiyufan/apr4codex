package com.codex;

import java.util.*;

public class Solution {
    static int[] countingSort(int[] arr) {
        int k = 0;
        int[] temp = new int[arr.length];
        int[] count = new int[arr.length];
        for (int i=0; i< arr.length; i++) {
            if (arr[i] > k) {
                k = arr[i];
            }
        }
        int res = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            for (int j = i + 2; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    res++;
                }
            }
        }
        return res;
    }

    
}