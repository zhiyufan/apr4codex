package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        int[] digit_count = new int[10];
        int[] change_count = new int[10];
        StringBuilder number = new StringBuilder();
        StringBuilder changed = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            digit_count[num.charAt(i) - '0']++;
        }
        for (int i = 0; i < change.length; i++) {
            change_count[change[i]]++;
        }
        for (int i = 9; i >= 0; i--) {
            while (change_count[i] > 0 && digit_count[i] > 0) {
                changed.append(i);
                digit_count[i]--;
                change_count[i]--;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = digit_count[i]; j > 0; j--) {
                number.append(i);
            }
        }
        return changed.length() > 0 ? changed.toString() : number.toString();
    }

    
}