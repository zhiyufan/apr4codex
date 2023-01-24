package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> closestKValues(TreeNode root, double target, int k) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> maxHeap = new PriorityQueue<>(k+1, (a,b) -> (int) (target - b) - (int) (target - a));
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            maxHeap.offer(root.val);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
            root = root.right;
        }
        while (maxHeap.size() > 0) {
            res.add(maxHeap.poll());
        }
    
        return res;
    }

    
}