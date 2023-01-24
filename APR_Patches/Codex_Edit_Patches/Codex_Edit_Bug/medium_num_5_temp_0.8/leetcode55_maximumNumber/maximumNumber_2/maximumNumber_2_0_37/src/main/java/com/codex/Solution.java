package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        assert change.length == 10;
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            assert digit >= 0 && digit <= 9;
            sb.setCharAt(i, (char)('0' + change[digit]));
        }
        return sb.toString();
    }

    
}