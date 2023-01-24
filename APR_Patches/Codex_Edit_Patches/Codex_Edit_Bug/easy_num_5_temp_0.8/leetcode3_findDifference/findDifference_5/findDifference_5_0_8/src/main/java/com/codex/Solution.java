package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

class Diference {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 3, 5, 8, 10};
        List<List<Integer>> result = findDifference(a, b);
        for (int i = 0; i < result.size(); i++) {
            result.get(i).forEach(n -> System.out.print(n + " "));
            System.out.println();
        }
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n1 : nums1)
            map.put(n1, 1);
        for (int n2 : nums2) {
            if (map.containsKey(n2))
                map.remove(n2);
            else
                map.put(n2, 1);
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        result.add(new ArrayList<Integer>());
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            if (entry.getValue() == 1)
                result.get(1).add(entry.getKey());
            else
                result.get(0).add(entry.getKey());
        return (result);
    }
}
}