package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int fac = 1;
        for (int i = 1; i <= n; i++) fac *= i;
        //k--;
        for (int i = 1; i <= n; i++) {
            fac /= (n - i + 1);
            int index = k / fac;
            k %= fac;
            for (int j = 0; j < n - i; j++) {
                if (j == index) {
                    sb.append(list.get(j));
                } else {
                    sb.append(list.get(j + 1));
                }
            }
        }
        return dp[n - 1];
    }

    
}