package com.codex;

import java.util.*;

public class Solution {
    public static String findMaximum(String str) {
        String ans = "";
        int j = 0;
        for (int i = 0; j < str.length() && i < str.length(); i++) {
            ans = ans + str.charAt(i);
            j = j + 2;
        }
        return ans;
    }    
}