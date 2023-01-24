package com.codex;

import java.util.*;

public class Solution {
public class Main {
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
        }
        return res;
    }

    public static List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].contains(words[j])) {
                    res.add(words[j]);
                }
                else if (words[j].contains(words[i])) {
                    res.add(words[i]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(targetIndices(new int[]{1,2,3,4,5,6}, 4));
        System.out.println(stringMatching(new String[]{"blue", "green", "bu"}));
    }
}
}