package com.codex;

import java.util.*;

public class Solution {
public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int len1 = s1.length();
        int len2 = s2.length();
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int count1 = 0;
        int count2 = 0;
        int i = 0;
        int j = 0;
        while(count1 < n1) {
            if(chars1[i] == chars2[j]) {
                j++;
                if(j == len2) {
                    count2++;
                    j = 0;
                }
            }
            i++;
            if(i == len1) {
                count1++;
                i = 0;
            }
        }
        return count2 / n2;
    }
}