package com.codex;

import java.util.*;

public class Solution {

import java.util.*;
class MAIN
{
    public static void main(String args[])
    {
        String arr[] = {"3","30","34","34"};
        System.out.println(kthLargestNumber(arr,2));
    }
    public static String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> minHeap = new PriorityQueue<String>((a, b) -> (a + b).compareTo(b + a));
        for (String num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }
        return sb.reverse().toString();
    }

}
    
}