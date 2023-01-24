package com.codex;

import java.util.*;

public class Solution {
    public static int minTimeToType(String word) {
        

        int res = 0;
        for (int i = 1; i < word.length(); i++) {
            res += Math.min(move(word.charAt(i - 1), word.charAt(i)), 26 - move(word.charAt(i - 1), word.charAt(i)));
        }
        return res;
    }

    private static int move(char c1, char c2) {
        int num1 = c1 - 'a';
        int num2 = c2 - 'a';
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < J.length(); i++) {
            list.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (list.contains(S.charAt(i))) {
                count += 1;
            }
        }
        return count;
    }

    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                count += 1;
            }
        }
        return count;
    }

        public int numJewelsInStones(String J, String S) {
        int count = 0;
        int[] arr = new int[58];
        for (int i = 0; i < J.length(); i++) {
            arr[J.charAt(i) - 'A'] = 1;
        }
        for (int i = 0; i < S.length(); i++) {
            if (arr[S.charAt(i) - 'A'] == 1) {
                count += 1;
            }
        }
        return count;
    }
        return Math.abs(num1 - num2);
    }

    

    
}