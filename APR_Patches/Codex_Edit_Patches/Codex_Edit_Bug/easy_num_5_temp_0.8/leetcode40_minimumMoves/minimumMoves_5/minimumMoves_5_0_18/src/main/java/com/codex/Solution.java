package com.codex;

import java.util.*;

public class Solution {

package test;

import java.util.Scanner;

public class Test {

    public static int minimumMoves(String s, int n) {
        
        if (n < 3) {
            return 0;
        }
        int moves = 0;
        int consecutiveX = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'X') {
                consecutiveX++;
            } else {
                consecutiveX = 0;
            }
            if (consecutiveX == 3) {
                moves++;
                consecutiveX = 1;
            }
        }
        return moves;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String s;
        n = sc.nextInt();
        s = sc.next();
        System.out.println(minimumMoves(s, n));
    }  
}
}