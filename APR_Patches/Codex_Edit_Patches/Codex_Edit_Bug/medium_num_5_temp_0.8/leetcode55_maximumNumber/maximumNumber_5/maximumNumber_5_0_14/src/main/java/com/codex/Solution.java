package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int k) {
        

        StringBuilder res = new StringBuilder();
        int[] cnt = new int[10];

        for (int i = 0; i < num.length(); i++) {
            cnt[num.charAt(i) - '0']++;
        }

        while (k > 0) {
            boolean found = false;
            int i = 9;
            while (i >= 0) {
                if (cnt[i] > 0) {
                    found = true;
                    break;
                }

                cnt[i]++;
                res = temp.append(i).length() > res.length() ? temp.append(i) : res;
            }
        }

        return res.toString();
    }

    
}