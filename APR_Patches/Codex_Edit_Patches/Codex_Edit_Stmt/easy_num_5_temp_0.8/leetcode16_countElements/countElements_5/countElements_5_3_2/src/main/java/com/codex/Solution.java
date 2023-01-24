package com.codex;

import java.util.*;

public class Solution {
public int countElements(int[] nums) {
        int count = 0;
        int[] arr = new int[1002];
        for(int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != 0 && arr[i + 1] > 0) {
                count += arr[i];
            }
        }
        return count;
    }
}