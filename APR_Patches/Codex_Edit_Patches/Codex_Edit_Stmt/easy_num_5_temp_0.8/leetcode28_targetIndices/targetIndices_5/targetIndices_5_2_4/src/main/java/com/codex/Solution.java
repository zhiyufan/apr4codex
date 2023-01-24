package com.codex;

import java.util.*;

public class Solution {
public class Main {

    public static int balancedStringSplit(String s) {
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            int rCount = 0;
            int lCount = 0;
            int j = i;
            while (j < s.length()) {
                if (s.charAt(j) == 'R') {
                    rCount++;
                } else {
                    lCount++;
                }
                if (rCount == lCount) {
                    count++;
                    break;
                }
            i = j + 1;
                j++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
	// write your code here
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }
}
}