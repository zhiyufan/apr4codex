package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] beam = new String[]{"10101", "00000", "10101", "10101"};
        System.out.println(numberOfBeams(beam));

        System.out.println(new Subs().solution("abcba"));
    }

    public static int numberOfBeams(String[] bank) {
        

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

        return res;
    }


    static class Subs {
    public int solution(String S) {
        int result = 0;
        if (S.length() != 0) {
            int max = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (max < entry.getValue()) {
                    max = entry.getValue();
                }
            }

            result = S.length() - max;
        }

        return result;
    }
}
}