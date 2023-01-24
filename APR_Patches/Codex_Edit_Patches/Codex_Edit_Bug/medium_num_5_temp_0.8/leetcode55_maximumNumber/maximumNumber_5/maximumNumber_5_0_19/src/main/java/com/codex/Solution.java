package com.codex;

import java.util.*;

public class Solution {
public static String maximumNumber(String num, int[] change) {


        StringBuilder res = new StringBuilder(num);
        int[] cnt = new int[10];

        for (int i = 0; i < res.length(); i++) {
            cnt[res.charAt(i) - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            if (cnt[i] > 0) {
                cnt[i]--;
                StringBuilder temp = new StringBuilder();
                for (int j = 9; j >= 0; j--) {
                    while (cnt[j] > 0) {
                        temp.append(j);
                        cnt[j]--;
                    }
                }

                cnt[i]++;
                StringBuilder temp1 = temp.append(i);
                if (temp1.length() > res.length()) {
                    res = temp1;
                } else if (temp1.length() == res.length()) {
                    res = res.compareTo(temp1.toString()) < 0 ? res : temp;
                }

            }
        }

        return res.toString();
    }

    
}