package com.codex;

import java.util.*;

public class Solution {
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

    
    
    
//  Here we use the same idea of Merge Sort to sort the numbers in the string to get the biggest number. 
//But we need to perform the merge sort recursively because the numbers in the string can be of different lengths. 
//Therefore, when we compare the concatenated numbers, we have to be careful not to miss any number. 
//To avoid missing numbers, we make sure that the length of the left and the right numbers are longer than the other string before comparing them.
    
    
}