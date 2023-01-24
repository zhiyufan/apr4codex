package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;

public class Solution {

    public static int countWaysToScore(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] += dp[i - 3];
        }
        for (int n : nums2) {
            set2.add(n);
        }
        for (int n : nums1) {
            if (!set2.contains(n)) {
                set2.add(n);
            } else {
                set2.remove(n);
            }
        }
        for (int n : nums2) {
            if (!set1.contains(n)) {
                set1.add(n);
            } else {
                set1.remove(n);
            }
        }
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));
        return ans;
    }

    
}