package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <= words[i].length(); j++) {
                String s1 = words[i].substring(0, j);
                String s2 = words[i].substring(j);

                if (isPalindrome(s1)) {
                    String s2rvs = new StringBuilder(s2).reverse().toString();
                    if (map.containsKey(s2rvs) && map.get(s2rvs) != i) {
                        res.add(Arrays.asList(map.get(s2rvs), i));
                    }
                }
                if (isPalindrome(s2)) {
                    String s1rvs = new StringBuilder(s1).reverse().toString();
                    if (map.containsKey(s1rvs) && map.get(s1rvs) != i && s2.length() != 0) {
                        res.add(Arrays.asList(i, map.get(s1rvs)));
                    }
                }
            }
        }

        return res;
    }

    private static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;

        while (l <= r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }

        return true;
    }
}
}