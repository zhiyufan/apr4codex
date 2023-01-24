package com.codex;

import java.util.*;

public class Solution {
public static int maxScore(String s) {
         int res = Integer.MIN_VALUE;
         int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '1') {
                count++;
            }
        }
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == '0') {
                count++;
            } else {
                count--;
            }
            res = Math.max(res, count);
        }
        return res;
        }
}