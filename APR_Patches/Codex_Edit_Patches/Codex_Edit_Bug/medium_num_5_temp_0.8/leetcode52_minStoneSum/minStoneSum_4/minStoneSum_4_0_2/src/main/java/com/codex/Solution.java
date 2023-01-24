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


        public String reverseOnlyLetters(String S) {
        char[] str = S.toCharArray();
        int left = 0, right = S.length()-1;
        while (left < right) {
            while (left < right && !Character.isLetter(str[left])) left++;
            while (left < right && !Character.isLetter(str[right])) right--;
            if (left < right) {
                char temp = str[left];
                str[left++] = str[right];
                str[right--] = temp;
            }
        }
        return String.valueOf(str);
    }
    }

    
}