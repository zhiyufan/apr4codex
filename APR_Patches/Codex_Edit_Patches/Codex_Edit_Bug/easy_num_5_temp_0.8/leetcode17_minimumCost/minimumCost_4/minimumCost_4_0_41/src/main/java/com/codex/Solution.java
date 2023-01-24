package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
    // input: a list of sorted list of numbers
    // output: a sorted list of the possible numbers you can make with the numbers given in the input
    // [-2, -1, 0, 1, 2], [1, 2, 3] -> [-2, 3], [-2, -1, 4], [-1, 5], [0, 4], [1, 3], [2, 2]
    public static List<Integer> numbers(List<List<Integer>> input) {
        
        List<Integer> res = new ArrayList<Integer>();
        if (input == null || input.size() == 0) {
            return res;
        }
        for (List<Integer> list : input) {
            for (int num : list) {
                res.add(num);
            }
        }
        return res;
    }
}