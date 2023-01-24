package com.codex;

import java.util.*;

public class Solution {
// write your code here
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) count++;
        left[i] = count;
    }
    count = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
        if (nums[i] == 0) count++;
        right[i] = count;
    }
    List<Integer> res = new ArrayList<>();
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
        if (left[i] + right[i] > max) {
            res.clear();
            res.add(i);
            max = left[i] + right[i];
        } else if (left[i] + right[i] == max) {
            res.add(i);
        }
    }
    return res;


class Solution1{
    public int[] findItinerary(List<List<String>> tickets) {
        HashMap<String, PriorityQueue<String>> hm = new HashMap<>();
        for (List<String> ticket: tickets) {
            if (!hm.containsKey(ticket.get(0))) {
                hm.put(ticket.get(0), new PriorityQueue<>());
            }
            hm.get(ticket.get(0)).add(ticket.get(1));
        }
        List<String> itinerary = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        while (!stack.isEmpty()) {
            String a = stack.peek();
            if (hm.containsKey(a) && hm.get(a).size() > 0) {
                stack.push(hm.get(a).poll());
            } else {
                itinerary.add(0, stack.pop());
            }
        }
        return itinerary.stream().mapToInt(i -> Integer.parseInt(i)).toArray();
    }
}

class Solution {
    public int[] findItinerary(List<List<String>> tickets) {
        HashMap<String, PriorityQueue<String>> hm = new HashMap<>();
        for (List<String> ticket: tickets) {
            if (!hm.containsKey(ticket.get(0))) {
                hm.put(ticket.get(0), new PriorityQueue<>());
            }
            hm.get(ticket.get(0)).add(ticket.get(1));
        }
        List<String> itinerary = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        while (!stack.isEmpty()) {
            String a = stack.peek();
            if (hm.containsKey(a) && hm.get(a).size() > 0) {
                stack.push(hm.get(a).poll());
            } else {
                itinerary.add(0, stack.pop());
            }
        }
        return itinerary.stream().mapToInt(i -> Integer.parseInt(i)).toArray();
    }
}
}