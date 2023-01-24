package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
class Solution {

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        if (!hasAllChars(s, t)) {
            return "";
        }

        int[] uniqueChars = new int[256];
        Arrays.fill(uniqueChars, -1);
        int[] windowChars = new int[256];
        Arrays.fill(windowChars, 0);

        for (int i = 0; i < t.length(); i++) {
            windowChars[t.charAt(i)]++;
        }

        int start = 0;
        int left = 0;
        int right = 0;
        int minimumLength = Integer.MAX_VALUE;
        int uniqueCount = t.length();

        while (left < s.length()) {
            if (windowChars[s.charAt(left)] < 0) {
                left++;
                continue;
            }
            if (windowChars[s.charAt(left)] > 0) {
                uniqueChars[s.charAt(left)] = left;
            }
            windowChars[s.charAt(left)]--;
            if (windowChars[s.charAt(left)] == 0) {
                uniqueCount--;
            }
            if (uniqueCount == 0) {
                while (right < left && isNotPresentInTarget(s.charAt(right), windowChars)) {
                    right++;
                }
                if (uniqueChars[s.charAt(right)] != -1) {
                    if (minimumLength > (left - right + 1)) {
                        minimumLength = left - right + 1;
                        start = right;
                    }
                }
                uniqueChars[s.charAt(right)] = -1;
                windowChars[s.charAt(right)]++;
                uniqueCount++;
                right++;
            }
            left++;
        }
        
        if (minimumLength == Integer.MAX_VALUE) {
          return "";
        }
        return s.substring(start, start + minimumLength);
    }


    private static boolean hasAllChars(String s, String t) {
        int[] chars = new int[256];
        Arrays.fill(chars, 0);
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            if (chars[t.charAt(i)] == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNotPresentInTarget(char c, int[] target) {
        return target[c] == 0;
    }

    public static void main(String[] args) {
        String s = "this is a test string";
        String t = "tist";
        System.out.println(minWindow(s, t));
    }
}
}