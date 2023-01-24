package com.codex;

import java.util.*;

public class Solution {
        int n = nums.size();
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int m = left + (right - left + 1) / 2;
            if (nums[m] == target) {
                left = m;
            } else if (nums[m] < target) {
                left = m + 1;
            } else {
                right = m - 1;
            }
        }
}