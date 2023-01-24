package com.codex;

import java.util.*;

public class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
        int[] max = new int[1];
        Map<TreeNode, Integer> map = new HashMap<>();
        helper(root, map, 0, max);
        return max[0];
    }
    
    private void helper(TreeNode root, Map<TreeNode, Integer> map, int index, int[] max) {
        
        if (root == null) return;
        
        map.put(root, index);
        
        max[0] = Math.max(map.get(root) - index + 1, max[0]); 
        
        helper(root.left, map, index * 2 + 1, max);
        helper(root.right, map, index * 2 + 2, max);
    }



    public int widthOfBinaryTree1(TreeNode root) {
        
        int[] max = new int[1];
        
        List<Integer> index = new ArrayList<>();
        
        helper(root, index, 0, max);
        
        return max[0];
    }
    
    private void helper(TreeNode root, List<Integer> index, int level, int[] max) {
        
        if (root == null) return;
        
        if (level >= index.size()) {
            index.add(0);
        } else {
            max[0] = Math.max(max[0], index.get(level) - index.get(level) + 1);
        }
        
        helper(root.left, index, level + 1, max);
        helper(root.right, index, level + 1, max);
    }
}