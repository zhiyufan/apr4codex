package com.codex;

import java.util.*;

public class Solution {
public static String kthLargestNumber(String[] nums, int k) {
    
    PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
    for (String s : nums) {
        pq.offer(s);
        if (pq.size() > k) {
            pq.poll();
        }
    }
    List<String> res = new ArrayList<>();
    while (!pq.isEmpty()) {
        res.add(pq.poll());
    }
    Collections.reverse(res);
    return String.join("", res);
}

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        
        while (right < s.length()) {
            char c = s.charAt(right);
            if (!set.contains(c)) {
                set.add(c);
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                char leftChar = s.charAt(left);
                set.remove(leftChar);
                left++;
            }
        }
        
        return max;
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') return false;
                    stack.pop();
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') return false;
                    stack.pop();
                    break;
                case '}':
                    if (stack.isEmpty() || stack.peek() != '{') return false;
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }


    public static String kthNumber(String[] nums, int k) {
        
        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
        for (String s : nums) {
            pq.offer(s);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return String.join("", res);
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> frequencies = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(k + 1,
                (a, b) -> b.getValue() - a.getValue());
        
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        for (int i = 0; i < k; i++) {
            res.add(pq.poll().getKey());
        }
        return res;
    }
}