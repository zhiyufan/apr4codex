package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums1) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : nums2) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : nums3) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : map.keySet()) {
            if (map.get(n) > 1) {
                list.add(n);
            }
        }
        return list;
    }

    
    public static int getKthMagicNumber(int k) {
        if (k < 0) return 0;

        int value = 0;
        Queue<Integer> q3 = new LinkedList<>();
        Queue<Integer> q5 = new LinkedList<>();
        Queue<Integer> q7 = new LinkedList<>();
        q3.add(1);

        for (int i = 0; i <= k; i++) {
            int v3 = q3.size() > 0 ? q3.peek() : Integer.MAX_VALUE;
            int v5 = q5.size() > 0 ? q5.peek() : Integer.MAX_VALUE;
            int v7 = q7.size() > 0 ? q7.peek() : Integer.MAX_VALUE;

            value = Math.min(v3, Math.min(v5, v7));
            if (value == v3) {
                q3.remove();
                q3.add(3 * value);
                q5.add(5 * value);
            } else if (value == v5) {
                q5.remove();
                q5.add(5 * value);
            } else {
                q7.remove();
            }
            q7.add(7 * value);
        }
        return value;
    }

    public static int getKthMagicNumber1(int k) {
        if (k < 0) return 0;

        int value = 0;
        Queue<Integer> q3 = new LinkedList<>();
        Queue<Integer> q5 = new LinkedList<>();
        Queue<Integer> q7 = new LinkedList<>();
        q3.add(1);

        for (int i = 0; i <= k; i++) {
            int v3 = q3.size() > 0 ? q3.peek() : Integer.MAX_VALUE;
            int v5 = q5.size() > 0 ? q5.peek() : Integer.MAX_VALUE;
            int v7 = q7.size() > 0 ? q7.peek() : Integer.MAX_VALUE;

            value = Math.min(v3, Math.min(v5, v7));
            if (value == v3) {
                q3.remove();
                q3.add(3 * value);
                q5.add(5 * value);
            } else if (value == v5) {
                q5.remove();
                q5.add(5 * value);
            } else {
                q7.remove();
            }
            q7.add(7 * value);
        }
        return value;
    }

    public static int getKthMagicNumber2(int k) {
        if (k < 0) return 0;

        int value = 0;
        Queue<Integer> q3 = new LinkedList<>();
        Queue<Integer> q5 = new LinkedList<>();
        Queue<Integer> q7 = new LinkedList<>();
        q3.add(1);

        for (int i = 0; i <= k; i++) {
            int v3 = q3.size() > 0 ? q3.peek() : Integer.MAX_VALUE;
            int v5 = q5.size() > 0 ? q5.peek() : Integer.MAX_VALUE;
            int v7 = q7.size() > 0 ? q7.peek() : Integer.MAX_VALUE;

            value = Math.min(v3, Math.min(v5, v7));
            if (value == v3) {
                q3.remove();
                q3.add(3 * value);
                q5.add(5 * value);
            } else if (value == v5) {
                q5.remove();
                q5.add(5 * value);
            } else {
                q7.remove();
            }
            q7.add(7 * value);
        }
        return value;
    }
    
    public static int getKthMagicNumber3(int k) {
        if (k < 0) return 0;

        int value = 0;
        Queue<Integer> q3 = new LinkedList<>();
        Queue<Integer> q5 = new LinkedList<>();
        Queue<Integer> q7 = new LinkedList<>();
        q3.add(1);

        for (int i = 0; i <= k; i++) {
            int v3 = q3.size() > 0 ? q3.peek() : Integer.MAX_VALUE;
            int v5 = q5.size() > 0 ? q5.peek() : Integer.MAX_VALUE;
            int v7 = q7.size() > 0 ? q7.peek() : Integer.MAX_VALUE;

            value = Math.min(v3, Math.min(v5, v7));
            if (value == v3) {
                q3.remove();
                q3.add(3 * value);
                q5.add(5 * value);
            } else if (value == v5) {
                q5.remove();
                q5.add(5 * value);
            } else {
                q7.remove();
            }
            q7.add(7 * value);
        }
        return value;
    }
}