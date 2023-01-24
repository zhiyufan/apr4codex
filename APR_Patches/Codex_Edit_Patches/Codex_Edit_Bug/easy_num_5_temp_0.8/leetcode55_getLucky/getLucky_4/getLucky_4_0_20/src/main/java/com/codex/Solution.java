package com.codex;

import java.util.*;

public class Solution {
public static int getLucky(String s, int k) {
        

    int ans = 0;
    for (int i = 0; i < s.length(); i++) {
        ans += (s.charAt(i) - 'a' + 1);
    }
    while (k > 0) {
        if(ans > 9) {
            int temp = 0;
            while (ans > 9) {
                temp += ans % 10;
                ans /= 10;
            }
    return ans;
}
            ans = temp;
        }
        k--;
    }
}