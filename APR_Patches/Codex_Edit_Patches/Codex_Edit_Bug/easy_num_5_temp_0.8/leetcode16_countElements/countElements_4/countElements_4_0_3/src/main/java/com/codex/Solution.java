package com.codex;

import java.util.*;

public class Solution {
public int countElements(int[] arr) {
    int n = arr.length;
    int count = 0;

    // 2 loops to check each element
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (arr[i] == arr[j] + 1)
                count++;
        }
        return count;
    }

    
}