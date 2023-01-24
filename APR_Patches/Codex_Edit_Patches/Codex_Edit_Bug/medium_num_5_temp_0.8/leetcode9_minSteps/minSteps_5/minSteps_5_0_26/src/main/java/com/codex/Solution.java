package com.codex;

import java.util.*;

public class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        helper(root, sum, new ArrayList<>(), result);
        return result;
    }
    public void helper(TreeNode root, int sum, List<Integer> list, List<List<Integer>> result) {
        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                list.add(root.val);
                result.add(list);
            }
            return;
        }
        int step = 0;
        for (int i = 0; i < t.length(); i++) {
            if (hash[t.charAt(i) - 'a'] == 0) {
                step++;
            } else {
                hash[t.charAt(i) - 'a']--;
            }
        }
        return step;
    }

    
}