package com.codex;

import java.util.*;

public class Solution {
package org.redquark.leetcode.challenge;

public class Problem11_MinimumOperations {

    public static int minOperations(String[] logs) {
        int count = 0;
        for (String s : logs) {
            if (s.equals("../")) {
                if (count > 0) {
                    count--;
                }
            }
            if (s.equals("./")) {
                continue;
            }
        }
        return count;
    }

    
}