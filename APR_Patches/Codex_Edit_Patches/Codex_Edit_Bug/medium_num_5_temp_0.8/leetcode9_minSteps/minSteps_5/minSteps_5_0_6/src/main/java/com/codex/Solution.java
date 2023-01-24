package com.codex;

import java.util.*;

public class Solution {
  public static int minSteps(String s, String t) {
        
        int step = 0, count = 0;
        for (int i = 0; i < s.length() && count < t.length(); i++) {
            if (s.charAt(i) != t.charAt(count)) {
                step++;
            } else {
                count++;
            }
        }
        return step;
    }
}