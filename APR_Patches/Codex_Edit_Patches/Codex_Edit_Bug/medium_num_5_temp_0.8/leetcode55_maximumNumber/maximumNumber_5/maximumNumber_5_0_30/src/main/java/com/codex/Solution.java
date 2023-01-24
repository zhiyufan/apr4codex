package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Test {
    public static void main(String[] args) {
        String num = "7777";
        int[] change = new int[10];
        Arrays.fill(change, 0);
        

        String res = maximumNumber(num, change);
        System.out.println(res);
    }

    public static String maximumNumber(String num, int[] change) {

        char[] str = num.toCharArray();
        int idx = 0;
        for (int i = 0; i < str.length; i++) {
            idx = str[i] - '0' > str[idx] - '0' ? i : idx;
        }

        for (int i = 0; i < str.length; i++) {
            if (i != idx && str[i] != '9' && change[str[i] - '0'] < 2) {
                str[i] = '9';
                change[str[i] - '0']++;
            }
        }

        if (str[idx] != '9' && change[str[idx] - '0'] < 1) {
            str[idx] = '9';
        }

        return String.valueOf(str);
    }
}
}