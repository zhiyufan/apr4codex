package com.codex;

import java.util.*;

public class Solution {
    public static int minMoves(int target, int maxDoubles) {
        

        int moves = 0;
        while (target > 0) {
            moves++;
            if (target % 2 == 0 && maxDoubles > 0) {
                maxDoubles--;
                target /= 2;
            } else {
                target--;
            }
        }

    public static boolean neverDecreasing(int n) {
        if (n < 10) {
            return true;
        }
        if (n % 10 < (n / 10) % 10) {
            return false;
        }
        return neverDecreasing(n / 10);
    }


    public static int countOnes(int n) {
        int cnt = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                cnt++;
                n--;
            } else {
                n /= 2;
            }
        }
        return cnt;
    }

        return moves;
    }

    
}