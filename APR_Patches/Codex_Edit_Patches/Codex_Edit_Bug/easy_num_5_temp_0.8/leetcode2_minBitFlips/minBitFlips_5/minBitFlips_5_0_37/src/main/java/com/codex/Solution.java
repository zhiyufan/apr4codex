package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
 

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        while (root != null) {
            if (root.left == null) {
                result.add(root.val);
                root = root.right;
            } else {
                TreeNode node = root.left;
                while (node.right != null && node.right != root) {
                    node = node.right;
                }
                if (node.right == null) {
                    node.right = root;
                    root = root.left;
                } else {
                    node.right = null;
                    result.add(root.val);
                    root = root.right;
                }
            }
        }
        return result;
    }
}
}