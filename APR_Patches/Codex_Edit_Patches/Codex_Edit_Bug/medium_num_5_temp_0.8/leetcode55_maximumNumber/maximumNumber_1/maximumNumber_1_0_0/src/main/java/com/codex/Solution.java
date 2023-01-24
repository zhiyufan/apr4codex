package com.codex;

import java.util.*;

public class Solution {
    
    public static void main(String[] args) {

        System.out.println(maximumNumber("123456789", new int[] { 7, 2, 3, 0, 8, 1, 4, 5, 9, 6 }));
    }

    public static String maximumNumber(String num, int[] change) {

        
        if (num.length() == 1) {
            return num;
        }

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
        return changed.length() > 0 ? changed.toString() : number.reverse().toString();
    }

    
}