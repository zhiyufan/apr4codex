package com.codex;

import java.util.*;

public class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int left = 0;
        int right = height.length - 1;
 
        int maxleft = 0, maxright = 0;
 
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxleft) {
                    maxleft = height[left];
                } else {
                    sum += maxleft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxright) {
                    maxright = height[right];
                } else {
                    sum += maxright - height[right];
                }
                right--;
            }
        } 
        return sum;
    }
}