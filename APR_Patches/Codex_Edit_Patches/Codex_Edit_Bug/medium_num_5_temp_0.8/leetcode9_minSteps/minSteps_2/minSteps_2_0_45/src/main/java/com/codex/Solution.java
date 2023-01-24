package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Main {
    /**
     * @param A: An array of non-negative integers.
     * return: The maximum amount of money you can rob tonight
     */

   public static int houseRobber(int[] A) {
         if(A == null || A.length == 0) return 0;
         int[] money = new int[A.length];
         money[0] = A[0];
         money[1] = Math.max(A[0], A[1]);
         for(int i = 2; i < A.length; i++) {
            money[i] = Math.max(money[i - 1], money[i - 2] + A[i]);
         }
         return money[money.length - 1];
   }

    public int backPack(int m, int[] A) {
        if (A == null || A.length == 0 || m == 0) return 0;
        boolean[] dp = new boolean[m + 1];
        dp[0] = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = m; j >= A[i]; j--) {
                dp[j] = dp[j] || dp[j - A[i]];
            }
        }
        for (int i = m; i >= 0; i--) {
            if (dp[i]) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {3, 8, 4};
        System.out.println(houseRobber(A)); //8
    }
}
    
}