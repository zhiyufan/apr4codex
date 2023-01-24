package com.codex;

import java.util.*;

public class Solution {
    private int max = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root != null) {
            max = Math.max(max, dfs(root, 1));
        }
        return max;
    }
    private int dfs(TreeNode root, int level) {
        if (root == null) {
            return level;
        }
        level++;
        int left = dfs(root.left, level);
        int right = dfs(root.right, level);
        if (root.left == null && root.right == null) {
            return level;
        } else {
            if (root.left == null) {
                return right;
            } else if (root.right == null) {
                return left;
            } else {
                return Math.min(left, right);
            }
        }
    }
}