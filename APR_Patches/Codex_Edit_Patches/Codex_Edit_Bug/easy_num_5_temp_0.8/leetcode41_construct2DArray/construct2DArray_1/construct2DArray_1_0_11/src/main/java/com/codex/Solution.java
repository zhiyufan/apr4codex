package com.codex;

import java.util.*;

public class Solution {
    public static void printX(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        return result;
    }

    
}