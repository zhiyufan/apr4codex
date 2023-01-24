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

//https://www.geeksforgeeks.org/priority-queue-class-in-java-2/
//https://stackoverflow.com/questions/22252762/what-does-p-offer-x-mean




//PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
//https://www.baeldung.com/java-lambda-expressions-tips
PriorityQueue<Integer> queue = new PriorityQueue<>( (a, b) -> (b - a) );
//降序
PriorityQueue<Integer> queue = new PriorityQueue<>( (a, b) -> (a - b) );

//升序

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

    
}