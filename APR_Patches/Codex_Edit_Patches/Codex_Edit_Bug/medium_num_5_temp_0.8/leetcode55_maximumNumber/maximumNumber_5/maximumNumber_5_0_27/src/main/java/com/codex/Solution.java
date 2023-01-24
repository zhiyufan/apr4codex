package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        

        StringBuilder res = new StringBuilder(num);
        int[] cnt = new int[10];

        for (int i = 0; i < res.length(); i++) {
            cnt[res.charAt(i) - '0']++;
        }

        for (int i = 0; i < change.length; i++) {
            if (cnt[change[i]] > 0) {
                cnt[i]--;
                StringBuilder temp = new StringBuilder().append(change[i]);
                for (int j = 9; j >= 0; j--) {
                    while (cnt[j] > 0) {
                        temp.append(j);
                        cnt[j]--;
                    }
                }
                cnt[change[i]]++;
                res = temp.length() > res.length() ? temp : res;
            }
        }

        return res.toString();
    }

    
}