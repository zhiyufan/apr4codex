package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws java.lang.Exception {
    public static int numOfPairs(String[] nums, String target) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : nums) map.put(s, map.getOrDefault(s, 0) + 1);
        int result = 0;
        for (String s : map.keySet()) result += map.get(s) * map.getOrDefault(target - s, 0);

        return result;

    }

    
}