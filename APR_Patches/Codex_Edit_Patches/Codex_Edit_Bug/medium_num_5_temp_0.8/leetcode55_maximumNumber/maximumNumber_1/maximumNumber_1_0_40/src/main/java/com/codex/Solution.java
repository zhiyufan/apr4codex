package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change, StringBuilder num_build, StringBuilder change_build) {
        
        int[] count_num = new int[10];
        int[] count_change = new int[10];
        for (int i = 0; i < num.length(); i++) {
            count_num[num.charAt(i) - '0']++;
        }
        for (int i = 0; i < change.length; i++) {
            count_change[change[i]]++;
        }
        for (int i = 9; i >= 0; i--) {
            while (count_change[i] > 0 && count_num[i] > 0) {
                num_build.append(i);
                count_num[i]--;
                count_change[i]--;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = count_num[i]; j > 0; j--) {
                change_build.append(i);
            }
        }
        return num_build.length() > 0 ? num_build.toString() : change_build.toString();
    }

    
}