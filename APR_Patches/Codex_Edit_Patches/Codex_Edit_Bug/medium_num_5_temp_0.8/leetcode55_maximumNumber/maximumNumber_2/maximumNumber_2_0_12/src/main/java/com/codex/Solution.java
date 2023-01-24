package com.codex;

import java.util.*;

public class Solution {

public static String maximumNumber(String num, int[] change) {
        
    if(change == null || num == null || change.length < 10) {
        return num;
    }
    StringBuilder res = new StringBuilder();
    int n = num.length();
    for(int i = n - 1; i >= 0; i--) {
        int digit = num.charAt(i) - '0';
        for(int j = 9; j > digit; j--) {
            if(change[j] > 0) {
                change[j]--;
                res.append(j);
                for(int k = 0; k < digit; k++) {
                    res.append(change[k]);
                    change[k] = 0;
                }
                for(int k = 9; k >= 0; k--) {
                    while(change[k]-- > 0) {
                        res.append(k);
                    }
                }
                return res.reverse().toString();
            }
        }
    }

    res.append(digit);
    change[digit]--;
}
for(int k = 9; k >= 0; k--) {
    while(change[k]-- > 0) {
        res.append(k);
    }
}
return res.reverse().toString();
}
}