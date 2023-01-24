package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class HelloWorld
{
  public static void main (String[] args)
  {
    int[] test = {4, 5, 2, 25};
    System.out.println("hi");// prints Hello World
  }
}

    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> pq = new PriorityQueue<>(k, (a, b) -> (b + a).compareTo(a + b));
        for (String s : nums) {
            pq.offer(s);
            if (pq.size() > k-1) {
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




/*
    public static void main (String[] args)
  {
    int[] test = {4, 5, 2, 25};
    System.out.println("hi");// prints Hello World
  }
  */
    
}