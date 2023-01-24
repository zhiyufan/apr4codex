package com.codex;

import java.util.*;

public class Solution {
//      主要利用二分法进行处理
//      限定的K和最小的路径值应该是一个线性的关系
//      所以我们把K取值区间为[1, n]，而最小的路径值就是[max(A), sum(A)]
//      利用二分法得到New_mid， 进行比较，如果New_mid / mid > K，则降低mid
//      如果New_mid / mid < K， 则增加mid
//      不存在等于的情况， 所以不需要考虑



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

    
}