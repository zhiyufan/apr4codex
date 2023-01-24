package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {

        char[] num_array = num.toCharArray();
        int[] count = new int[10];
        for (int i = 0; i < num_array.length; i++) {
            count[num_array[i] - '0']++;
        }
        
        for (int i = 0; i < change.length; i++) {
            count[change[i]]--;
        }
        int idx = 0;
        while (idx < num_array.length && num_array[idx] == '0') {
            idx++;
        }
        if (idx == num_array.length) {
            return "";
        }
        
        StringBuilder number = new StringBuilder();
        int index = 0;
        while (index < num_array.length && num_array[index] <= num_array[idx]) {
            if (num_array[index] == num_array[idx] && count[num_array[index] - '0'] > 0) {
                count[num_array[index] - '0']--;
                index++;
            } else {
                number.append(num_array[index]);
                idx = index + 1;
                index++;
            }
        }
        while (index < num_array.length) {
            number.append(num_array[index]);
            index++;
        }
        
        for (int i = 0; i < 10; i++) {            
            while (count[i] > 0) {
                number.append(i);
                count[i]--;
            }
        }
        return number.toString();
    }

    
}