package com.codex;

import java.util.*;

public class Solution {
 public static int minStoneSum(int[] piles, int k) {
        
        int left = 0, right = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > right) right = piles[i];
            left += piles[i];
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canGet(piles, k, mid)) right = mid;
            else left = mid + 1;
        }
        return right;
    }

    private static boolean canGet(int[] piles, int k, int mid) {
        int count = 0;
        for (int i = 0; i < piles.length; i++) {
            count += piles[i] / mid;
        }
        return count >= k;
    }

public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] res = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            res[i] = new StringBuilder();
        }
        int i = 0, len = s.length();
        while (i < len) {
            for (int j = 0; j < numRows && i < len; j++) {
                res[j].append(s.charAt(i++));
            }
            for (int j = numRows - 2; j >= 1 && i < len; j--) {
                res[j].append(s.charAt(i++));
            }
        }
        StringBuilder ret = new StringBuilder();
        for (StringBuilder stringBuilder : res) {
            ret.append(stringBuilder);
        }
        return ret.toString();
    }

}