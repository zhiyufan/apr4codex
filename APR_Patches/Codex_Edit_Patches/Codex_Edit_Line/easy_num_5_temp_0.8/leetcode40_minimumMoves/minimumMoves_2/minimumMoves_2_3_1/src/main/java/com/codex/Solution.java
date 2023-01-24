package com.codex;

import java.util.*;

public class Solution {
package io.github.org.dmitry.toyexchange;

public class Test {

    public static void main(String[] args) {
        System.out.println(minimumMoves("XSXSXS"));
    }

    private static int minimumMoves(String s) {
        
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2) && s.charAt(i) == 'X') {
                count++;
            }
        }
        return count;
    }

}
}