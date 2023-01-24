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
                if (change[0] > 0) {
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
                            change[1]--;
                            break;
                        }
                    change[0]--;
                } else if (change[1] > 0) {
                    for (int j = 0; j < res.length(); j++) {
                        if (res.charAt(j) < i + '0') {
                            res.setCharAt(j, (char) (i + '0'));
                        cnt[j]--;
                    }
                }
            }
        }

        return res.toString();
    }

    
}