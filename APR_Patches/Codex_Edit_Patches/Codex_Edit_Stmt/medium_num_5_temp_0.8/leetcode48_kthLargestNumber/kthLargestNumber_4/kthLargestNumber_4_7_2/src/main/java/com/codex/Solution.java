package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    /**
     * @param nums: an integer array
     * @param k: An integer
     * @return: the top k largest numbers in array
     */
    public int[] topk(int[] nums, int k) {
        // write your code here
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a,b)->b-a);
        for(int num:nums){
            queue.offer(num);
        }
        int[] res = new int[k];
        int i = 0;
        while(!queue.isEmpty()&&i<k){
            res[i] = queue.poll();
            i++;
        }
        return res;
    }
}
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!minHeap.isEmpty()) {
            sb.append(minHeap.poll());
        }

        return sb.toString();

    }

    
}