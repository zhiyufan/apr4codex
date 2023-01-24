package com.codex;

import java.util.*;

public class Solution {
public static long maximumSubsequenceCount(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();
        long cnt = 0, res = 0;

        for (int i = 0; i < n - m + 1; i++) {
            if (text.charAt(i) == pattern.charAt(0)) cnt++;
            else if (text.charAt(i) == pattern.charAt(1)) cnt--;
            res += cnt; // count every possible valid subsequence, without duplicates and inversion
        } return res;
}
}