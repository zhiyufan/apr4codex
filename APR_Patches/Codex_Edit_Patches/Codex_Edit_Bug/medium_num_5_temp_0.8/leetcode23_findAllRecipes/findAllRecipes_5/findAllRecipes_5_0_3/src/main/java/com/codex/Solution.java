package com.codex;

import java.util.*;

public class Solution {
import java.util.*;
public class Test{
    public static void main(String[] args){
        String[] strs = {"hello", "leetcode"};
        int k = 5;
        System.out.println(longestCommonPrefix(strs));
        //System.out.println(doubleExpression(0.66, 0.66, 0.66));
    }
    
    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0) return "";
        if (len == 1) return strs[0];
        String result = strs[0];
        for (int i = 1; i<len; i++) {
            while (strs[i].indexOf(result) != 0) result = result.substring(0,result.length() - 1);
        }

        return result;
    }

    private static void dfs(String supply, Map<String, List<String>> graph, Map<String, Boolean> visited, List<String> ans) {
        visited.put(supply, true);
        for (String neighbor: graph.get(supply)) {
            if (!visited.get(neighbor)) dfs(neighbor, graph, visited, ans);
        }
        ans.add(0, supply);
    }

    
}