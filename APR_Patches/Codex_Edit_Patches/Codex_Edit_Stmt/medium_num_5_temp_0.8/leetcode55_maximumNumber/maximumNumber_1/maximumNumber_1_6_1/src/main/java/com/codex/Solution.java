package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
        
        int[] count_num = new int[10];
        int[] count_change = new int[10];
        StringBuilder number = new StringBuilder();
        StringBuilder changed = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            count_num[num.charAt(i) - '0']++;
        }
        for (int i = 0; i < change.length; i++) {
            count_change[change[i]]++;
        }
        for (int i = 9; i >= 0; i--) {
            while (count_change[i] > 0 && count_num[i] > 0) {
                changed.append(i);
                count_num[i]--;
                count_change[i]--;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = count_num[i]; j > 0; j--) {
                number.append(i);
            }
        }
        return changed.length() > 0 ? changed.toString() : number.toString();
    }

    public static String maximumNumber2(String num, int[] change) {
        int[] count_num = new int[10];
        int[] count_change = new int[10];
        StringBuilder temp_num = new StringBuilder();
        StringBuilder temp_change = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            count_num[num.charAt(i) - '0']++;
        }
        for (int i = 0; i < change.length; i++) {
            count_change[change[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            while (count_change[i] > 0 && count_num[i] > 0) {
                count_change[i]--;
                count_num[i]--;
                temp_change.append(i);
            }
            while (count_num[i] > 0) {
                count_num[i]--;
                temp_num.append(i);
            }
        }
        for (int i = temp_num.length() - 1; i >= 0; i--) {
            result.append(temp_num.charAt(i));
        }
        for (int i = 0; i < temp_change.length(); i++) {
            result.append(temp_change.charAt(i));
        }
        return result.toString();
    }
    
    
}