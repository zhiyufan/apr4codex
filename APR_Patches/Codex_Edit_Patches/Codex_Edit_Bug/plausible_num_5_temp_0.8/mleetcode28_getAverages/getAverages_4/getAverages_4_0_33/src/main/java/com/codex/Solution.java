package com.codex;

import java.util.*;

public class Solution {
    public static boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        int left = 1;
        int right = num / 2;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (num / mid < mid) {
                right = mid - 1;
            } else if (num / mid > mid) {
                left = mid + 1;
            } else {
                return num % mid == 0;
            }
        }
        return false;
    }
}