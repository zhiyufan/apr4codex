package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Geeks {
    int getMaxMonsters(int n, int hit, int t, int h[]) {
        int upper = n;
        int lower = 0;
        int max = 0;

        while (lower != upper) {
            int mid = (lower + upper) / 2;
            int time = t;
            boolean isConsumed = true;
            int num = 0;
            for (int i = 0; i < n; i++) {
                int deltaH = h[i] - (num++ * hit);
                if (deltaH > 0) {
                    int hitCount = deltaH / hit;
                    if (deltaH % hit != 0) {
                        hitCount++;
                    }
                    if (time - hitCount < 0) {
                        isConsumed = false;
                        break;
                    } else {
                        time = time - hitCount;
                    }
                }
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }

    
}