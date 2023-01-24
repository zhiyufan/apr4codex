package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOriginalArray {
    public static void main(String[] args) {
        int[] input = new int[]{4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4};
        int[] output = findOriginalArray(input);
        printArray(output);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] findOriginalArray(int[] changed) {
        /*The idea is to use a map to count the number of times each number occurs in the array,
        * and then iterate over the map and return an array containing all the numbers which occured twice
        * in the map.
        * */
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        /*Iterate over the array and put each number in the map using the put method
        * If the number is already a key, then use put method with the count + 1
        * */

        for (int i = 0; i < changed.length; i++) {
            map.put(changed[i], map.getOrDefault(changed[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (count != 2) {
                return new int[0];
            }
            list.add(num);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    
}