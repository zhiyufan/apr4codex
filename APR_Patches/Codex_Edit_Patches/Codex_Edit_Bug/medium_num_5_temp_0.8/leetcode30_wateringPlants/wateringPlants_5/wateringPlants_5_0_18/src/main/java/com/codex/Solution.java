package com.codex;

import java.util.*;

public class Solution {
        int left = 0;
        int right = plants.length - 1;
        int ans = 0;
        while (left < right) {
            if (plants[right] == 0) {
                continue;
            }
            ans++;
            int leftCurrCapacity = capacity;
            int rightCurrCapacity = capacity;
            while (plants[left] > 0 && leftCurrCapacity >= plants[left]) {
                leftCurrCapacity -= plants[left];
                plants[left] = 0;
                if (left < right) {
                    left++;
                }
            }
            while (plants[right] > 0 && rightCurrCapacity >= plants[right]) {
                rightCurrCapacity -= plants[right];
                plants[right] = 0;
                if (left < right) {
                    right--;
                }
            }
        }
        return ans;
}