package com.codex;

import java.util.*;

public class Solution {
public static int countPalindromicSubsequence(String s) {
        int len = s.length();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            int left = i - 1, right = i + 1;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
        
            left = i;
            right = i + 1;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i - 1;
            right = i;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i - 1;
            right = i + 1;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }

            left = i - 1;
            right = i;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i;
            right = i;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i - 1;
            right = i + 1;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i - 1;
            right = i;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i;
            right = i;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i - 1;
            right = i + 1;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i - 1;
            right = i;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i;
            right = i;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i - 1;
            right = i + 1;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i - 1;
            right = i;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
            }
            left = i;
            right = i;
            while (left >= 0 && right < len) {
                if (s.charAt(left) == s.charAt(right)) {
                    set.add(s.substring(left, right + 1));
                } else
                    break;
                left--;
                right++;
                }
            }
        }
        return set.size();
    }
}