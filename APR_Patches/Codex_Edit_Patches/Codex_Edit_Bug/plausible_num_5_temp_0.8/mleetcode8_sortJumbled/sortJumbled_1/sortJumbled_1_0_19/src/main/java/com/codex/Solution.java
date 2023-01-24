package com.codex;

import java.util.*;

public class Solution {
public class Solution {

    public static String sortJumbled(int[] mapping, String s) {

        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            nums[i] = s.charAt(i) - '0';
        }


        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        Arrays.sort(res);

        int[] map = new int[10];
        for (int i = 0; i < 10; i++) {
            map[mapping[i]] = i;
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = map[res[i]];
        }

        Arrays.sort(res);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            str.append(res[i]);
        }
        return str.toString();
    }


    public static void main(String[] args) {
        int[] map = {0, 9, 1, 8, 2, 7, 3, 6, 4, 5};
        String s = "6938542750";
        System.out.println(sortJumbled(map, s));
    }
}
}