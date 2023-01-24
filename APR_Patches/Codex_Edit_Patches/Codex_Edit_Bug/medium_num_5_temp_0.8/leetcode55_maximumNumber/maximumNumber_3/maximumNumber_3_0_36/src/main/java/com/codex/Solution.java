package com.codex;

import java.util.*;

public class Solution {
public static String maximumNumber(String num, int[] change) {
    
    int[] count = new int[10];
    for(int i = 0; i < num.length(); i++) {
        count[Integer.parseInt(String.valueOf(num.charAt(i)))]++;
    }

    int[] ans = new int[10];
    for(int i = 9; i >= 0; i--) {
        while(count[i] > 0) {
            ans[i]++;
            count[change[i]]--;
        }
    }
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < ans.length; i++) {
        while(ans[i]-- > 0) sb.append(i);
    }
    return sb.toString();
}

public static void main(String[] args) {
    int[] arr = {9, 9, 9, 9, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8};
    System.out.println(maximumNumber("9876543210", arr));
}
}