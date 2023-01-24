package com.codex;

import java.util.*;

public class Solution {
package practice.problem;

import java.util.*;

// 942. DI String Match
public class DIStringMatch {
    public int[] diStringMatch(String S) {
        int[] arr = new int[S.length() + 1];
        int len = S.length();
        int low = 0, high = len;
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == 'I')
                arr[i] = low++;
            else
                arr[i] = high--;
        }
        arr[len] = low;
        return arr;
    }

    public int[] diStringMatchTwo(String S) {
        int n = S.length(), left = 0, right = n;
        int[] res = new int[n + 1];
        for (int i = 0; i < n; ++i)
            res[i] = S.charAt(i) == 'I' ? left++ : right--;
        res[n] = left;
        return res;
    }

    public int[] diStringMatchThree(String S) {
        int len = S.length() + 1;
        int[] res = new int[len];
        int low = 0, high = len - 1;
        for (int i = 0; i < len - 1; i++) {
            if (S.charAt(i) == 'I')
                res[i] = low++;
            else
                res[i] = high--;
        }
        res[len - 1] = high;
        return res;
    }

    public int[] diStringMatchFour(String S) {
        int len = S.length();
        int[] res = new int[len + 1];
        int start = 0, end = len;
        for (int i = 0; i < len; i++) {
            res[i] = S.charAt(i) == 'I' ? start++ : end--;
        }
        res[len] = start;
        return res;
    }
}


    public static int numOfPairs(String[] nums, String target) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) count++;
            }
        }
        return count;
    }

    
}