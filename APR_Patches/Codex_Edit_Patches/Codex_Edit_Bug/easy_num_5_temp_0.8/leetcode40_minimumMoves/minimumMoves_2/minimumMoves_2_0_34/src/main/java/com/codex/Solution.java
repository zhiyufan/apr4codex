package com.codex;

import java.util.*;

public class Solution {
public class Solution {

     public static int minimumMoves(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                if (i + 1 <= s.length() - 1 && s.charAt(i + 1) == '-') {
                    count++;
                    i++;
                } else if (i - 1 >= 0 && s.charAt(i - 1) == '-') {
                    count++;
                }
            }
        }
        return count;
    } 

    public static void main(String[] args) {
        int result = minimumMoves("----X-+++--");
        System.out.println("result = " + result);
    }

}
}