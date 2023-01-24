package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

export class MaxSum2 {
    static int maxSumTwoNoOverlap(int[] A, int L, int M) {
        int max = 0;
        int[] left = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            left[i] = i == 0 ? A[0] : left[i - 1] + A[i];
        }

        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i]) {
                targetFriend--;
            }
            if (targetFriend < 0) {
                return i;
            }
        }
        return -1;
    }

    
}