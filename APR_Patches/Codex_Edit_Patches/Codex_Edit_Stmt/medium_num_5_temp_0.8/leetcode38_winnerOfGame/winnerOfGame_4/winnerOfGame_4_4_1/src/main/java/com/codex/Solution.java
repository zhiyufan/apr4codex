package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        if (colors.length() == 0) {
            return false;
        } else if (colors.length() == 1) {
            return true;
        } else if (colors.charAt(0) == 'B' || colors.charAt(colors.length() - 1) == 'B') {
            return false;
        } else {
            return isWinningPossibility(colors);
        }
    }

    private static boolean isWinningPossibility(String colors) {
        if (colors.length() == 0) {
            return false;
        } else if (colors.length() == 1) {
            return true;
        } else if (colors.charAt(0) == 'B' || colors.charAt(colors.length() - 1) == 'B') {
            return false;
        }

        StringBuilder sb = new StringBuilder(colors);
        int index = 0;
        while (index + 2 < sb.length()) {
            char start = sb.charAt(index);
            char mid = sb.charAt(index + 1);
            char end = sb.charAt(index + 2);
            if (start == mid && mid == end) {
                sb.deleteCharAt(index + 1);
                index = index + 1;
            } else {
                index++;
            }
        }
    
    /**
	 * 
	 * @param s
	 * @return
	 */
	public static int longestPalindrome(String s) {
		int maxLen = 0;
		int start = 0;
		int end = 0;
		for (int i = 1; i < s.length(); i++) {
			int left = i - 1;
			int right = i + 1;
			while (left >= 0 && right < s.length()) {
				if (s.charAt(left) != s.charAt(right)) {
					break;
				}
				if (right - left + 1 > maxLen) {
					maxLen = right - left + 1;
					start = left;
					end = right;
				}
				left--;
				right++;
			}
		}
		for (int i = 1; i < s.length(); i++) {
			int left = i - 1;
			int right = i;
			while (left >= 0 && right < s.length()) {
				if (s.charAt(left) != s.charAt(right)) {
					break;
				}
				if (right - left + 1 > maxLen) {
					maxLen = right - left + 1;
					start = left;
					end = right;
				}
				left--;
				right++;
			}
		}
		return maxLen;
	}
        return isWinningPossibility(sb.toString());
    }
}