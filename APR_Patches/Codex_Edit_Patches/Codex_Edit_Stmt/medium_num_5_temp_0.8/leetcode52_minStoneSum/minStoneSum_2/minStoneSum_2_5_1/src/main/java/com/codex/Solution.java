package com.codex;

import java.util.*;

public class Solution {
public static int minStoneSum(int[] piles, int k) {
        int left = piles[0];
        int right = 0;   //left = 1, right = max(pile)
        for (int pile : piles) {
            right += pile;    //calculate the sum
            left = Math.max(left, pile);  //left = max(pile)
        }       //sum = sum, left = max(pile), right = sum
        while (left < right) {   //find the max(pile) where the sum is not greater than k
            int mid = left + (right - left) / 2; 
            int count = 0;   //count the number of the piles that their value is greater than mid
            for (int pile : piles) {
                if (pile > mid) {
                    count += (pile - 1) / mid + 1;
                }
            }
            if (count <= k) { //if count <= k, means the sum <= k, so try to decrease the largest pile
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    
}