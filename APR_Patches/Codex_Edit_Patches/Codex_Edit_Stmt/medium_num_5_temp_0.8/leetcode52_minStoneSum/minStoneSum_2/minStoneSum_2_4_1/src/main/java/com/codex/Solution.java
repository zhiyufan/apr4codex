package com.codex;

import java.util.*;

public class Solution {
    public static int minStoneSum(int[] piles, int k) {
        
        int left = 0;
        int right = 0;
        for (int pile : piles) {
            right += pile;
            left = Math.max(left, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int pile : piles) {
                count += (pile - 1) / mid + 1;
            }
            if (count <= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        System.out.println(minStoneSum(piles, 8));

        int[] piles1 = {30,11,23,4,20};
        System.out.println(minStoneSum(piles1, 5));

        int[] piles2 = {30,11,23,4,20};
        System.out.println(minStoneSum(piles2, 6));
    }
}