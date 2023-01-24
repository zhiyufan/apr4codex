package com.codex;

import java.util.*;

public class Solution {
package hackerrank.algorithms.contests_unpublished;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Aleksandr on 01/05/2017.
 * Project Solutions
 * <p>
 * https://www.hackerrank.com/contests/hourrank-5/challenges/short-palindrome
 */
public class ShortPalindrome {
    public static void main(String[] args) throws IOException {
        final Scanner in = new Scanner(System.in);
        final String alphabet = in.next();
        int[][][] last = new int[alphabet.length() + 1][26][26];

        for (int i = alphabet.length() - 1; i >= 0; i--) {
            last[i] = last[i + 1].clone();
            last[i][alphabet.charAt(i) - 'a'][alphabet.charAt(i) - 'a']++;
        }

        long total = 0;
        for (int i = 0; i < alphabet.length(); i++) {
            for (int j = i + 1; j < alphabet.length(); j++) {
                for (int k = 0; k < 26; k++) {
                    total += last[j + 1][alphabet.charAt(i) - 'a'][k];
                }
            }
        }

        System.out.println(total);
    }
}

    public static int minimumMoves(String s) {
        
        if (s.length() < 3) return 0;
        int count = 0;
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) == 'X' && s.charAt(i - 1) == 'X' && s.charAt(i - 2) == 'X') {
                count++;
                i += 1;
            }
        }
        return count;
    }

    
}