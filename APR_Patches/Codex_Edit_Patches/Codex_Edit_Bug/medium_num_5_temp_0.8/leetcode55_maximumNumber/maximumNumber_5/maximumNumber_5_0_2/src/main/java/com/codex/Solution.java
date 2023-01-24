package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        

        StringBuilder res = new StringBuilder(num);
        int[] cnt = new int[10];

        for (int i = 0; i < res.length(); i++) {
            cnt[res.charAt(i) - '0']++;
        }

        for (int i = 9; i >= 0; i--) {
            if (cnt[i] > 0) {
                while (change[i] > 0) {
                    cnt[i]--;
                    change[i]--;
                }

                for (int j = i - 1; j >= 0; j--) {
                    cnt[j] += change[j];
                    change[j] = 0;
                }

                StringBuilder temp = new StringBuilder();
                for (int j = 9; j >= 0; j--)
                    for (int k = 0; k < cnt[j]; k++)
                        temp.append(j);

                res = res.length() > temp.length() ? res : temp;
            }
        }

        return res.toString();
    }

    
}