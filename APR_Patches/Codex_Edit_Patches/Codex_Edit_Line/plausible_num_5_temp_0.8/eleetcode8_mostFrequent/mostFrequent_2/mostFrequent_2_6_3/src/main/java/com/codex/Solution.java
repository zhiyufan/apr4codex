package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public static int mostFrequent(int[] nums, int key) {
        int max = 0;
        int res = 0;
        int[] arr = new int[101];
        for (int i = 0; i < nums.length; i++) arr[nums[i]]++;
        for (int i = 0; i < nums.length; i++) {
            if (arr[nums[i]] > max && nums[i] != key) {
                max = arr[nums[i]];
                res = nums[i];
            }    
    }

}
}