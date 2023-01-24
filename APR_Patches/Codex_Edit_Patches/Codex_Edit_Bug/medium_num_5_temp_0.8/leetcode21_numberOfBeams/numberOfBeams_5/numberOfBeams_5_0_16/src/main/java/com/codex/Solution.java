package com.codex;

import java.util.*;

public class Solution {
package array;

import java.util.Arrays;
import java.util.HashMap;

public class Array {
    
    public static int NumberOfBeams(String[] bank) {
        

        int n = bank.length;
        int m = bank[0].length();
        int[] ones = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (bank[i].charAt(j) == '1') {
                    ones[i]++;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ones[i] > 1) {
                res += ones[i] * (ones[i] - 1) / 2;
            }

            for (int j = i + 1; j < n; j++) {
                if (ones[j] == 0) {
                    res += ones[i];
                }
            }
        }

    public static String dnaComplement(String dna) {
        char[] array = new char[]{'A', 'T', 'C', 'G'};
        HashMap<Character, Character> map = new HashMap<>();
        map.put(array[0], array[1]);
        map.put(array[1], array[0]);
        map.put(array[2], array[3]);
        map.put(array[3], array[2]);
        char[] res = new char[dna.length()];
        for (int i = 0; i < dna.length(); i++) {
            res[i] = map.get(dna.charAt(i));
        }
        return new String(res);
    }
    
    public static String 
    numberOfSubstrings(String s) {
        int n = s.length();
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = (s.charAt(0) == '0') ? 1 : 0;
        right[n - 1] = (s.charAt(n - 1) == '1') ? 1 : 0;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + (s.charAt(i) == '0' ? 1 : 0);
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + (s.charAt(i) == '1' ? 1 : 0);
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        long res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.min(left[i], right[i]);
        }

        return Long.toString(res);
    }

    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("0110111"));
    }
}
        return res;
    }


    
}