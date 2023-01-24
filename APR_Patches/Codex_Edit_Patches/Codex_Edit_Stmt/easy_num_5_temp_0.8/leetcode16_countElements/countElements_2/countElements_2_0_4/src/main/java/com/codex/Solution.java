package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[i - 1]) {
                count++;
                if(i - 2 < 0 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return count <= 1;
    }
}

/*public static int countElements(int[] nums) {
        
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i] + 1)) {
                count += 1;
            }
        }
        return count;
    }

public class Solution {
    public String getSmallestString(int n, int k) {
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 'a';
        }
        k -= n;
        for (int i = n - 1; i >= 0; i--) {
            int res = Math.min(k, 25);
            k -= res;
            arr[i] = (char)(arr[i] + res);
        }
        return new String(arr);
    }
} 

public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        if(n <= 1) {
            return n;
        }
        int[] lengths = new int[n];
        int[] counts = new int[n];
        Arrays.fill(counts, 1);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    if(lengths[j] >= lengths[i]) {
                        lengths[i] = lengths[j] + 1;
                        counts[i] = counts[j];
                    } else if(lengths[j] + 1 == lengths[i]) {
                        counts[i] = counts[i] + counts[j];
                    }
                }
            }
        }
        int longLen = 0, count = 0;
        for(int len : lengths) {
            longLen = Math.max(longLen, len);
        }
        for(int i = 0; i < n; i++) {
            if(lengths[i] == longLen) {
                count += counts[i];
            }
        }
        return count;
    }

*/
    
}