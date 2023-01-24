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
                res = temp.append(i).length() > res.length() ? temp.append(i) : res;
            }
        }

        return res.toString();
    public static String maximumNumber(String num, int[] change) {


        StringBuilder res = new StringBuilder(num);
        int[] cnt = new int[10];
        int len = 0;

        for (int i = 0; i < res.length(); i++) {
            cnt[res.charAt(i) - '0']++;
            len++;
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
                int tlen = temp.length();
                if (tlen+1 <= len) {
                    res = temp.append(i).length() > res.length() ? temp.append(i) : res;
                } else {
                    if (temp.append(i).length() > res.length()) {
                        res = new StringBuilder(temp.append(i));
                        len = tlen+1;
                    }
                }
            }
        }

        return res.toString();
    }


    }

    
}