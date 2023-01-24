package com.codex;

import java.util.*;

public class Solution {
        List<List<String>> res = new ArrayList<>();
        char[] chs = str.toCharArray();
        int n = chs.length;
        boolean[] used = new boolean[n];
        // List<String> list = new ArrayList<>();
        List<Character> list = new ArrayList<>();
        backtrack(list, res, chs, used, n, 0);
        return res;
}