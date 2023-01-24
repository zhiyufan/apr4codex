package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;


    public static void main(String[] args) {
        int[] arr = new int[] {2 ,7, 9, 23};
        System.out.println(Arrays.toString(chanes(arr, 18)));
    }

    public static int minTimeToType(String word) {

        int[] pos = new int[26];
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            pos[ch - 'a'] = i++;
        }

        int cur = 0, res = 0;
        for (char ch : word.toCharArray()) {
            res += Math.min(Math.abs(pos[ch - 'a'] - cur), 26 - Math.abs(pos[ch - 'a'] - cur));
            cur = pos[ch - 'a'];
        }
        return res;
    }
}