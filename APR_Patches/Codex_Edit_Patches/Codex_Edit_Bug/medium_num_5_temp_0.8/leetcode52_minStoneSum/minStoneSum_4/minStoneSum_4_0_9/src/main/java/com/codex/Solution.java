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

    public static int getSum(String path, int N) {
        //Base Case
        int M = path.length();
        if (M < N) return 0;
        if (M == N) {
            return Integer.parseInt(path);
        }

        int sum = 0;
        for (int i = 0; i < path.length() - N + 1; i++) {
            String number = path.substring(i, i + N);
            sum += Integer.parseInt(number);
        }
        sum += getSum(path.substring(1), N);
        return sum;
    }
}