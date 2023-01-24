package com.codex;

import java.util.*;

public class Solution {

public class Solution {

    public static String maximumNumber(String num, int[] change) {
        
        int[] count_num = new int[10];
        int[] count_change = new int[10];
        StringBuilder number = new StringBuilder(num);
        StringBuilder changed = new StringBuilder();
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
        return changed.length() > 0 ? changed.toString() : number.toString();
    }

}
}