package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < security.length; i++) {
            min = Math.min(security[i], min);
            if (security[i] != min && i > time - 1) {
                boolean flag = true;
                for (int j = i - time; j < i; j++) {
                    if (security[j] < security[i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    System.out.print(i + " ");
            }
        }
        for (int i = security.length - 1; i >= 0; i--) {
            max = Math.max(security[i], max);
            if (security[i] != max && i < security.length - time) {
                boolean flag = true;
                for (int j = i + 1; j < i + time + 1; j++) {
                    if (security[j] > security[i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    System.out.print(i + " ");
            }
        }
        return res;
    }

    
}