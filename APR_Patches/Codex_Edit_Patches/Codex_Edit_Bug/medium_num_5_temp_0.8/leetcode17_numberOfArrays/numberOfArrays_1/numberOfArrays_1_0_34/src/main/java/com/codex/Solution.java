package com.codex;

import java.util.*;

public class Solution {
    public int findEqualOne(int[] numbers) {

        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (numbers[mid] == 1) {
                if (mid - 1 >= 0 && numbers[mid - 1] == 0) return mid;
                else {
                    end = mid - 1;
                }
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    
}