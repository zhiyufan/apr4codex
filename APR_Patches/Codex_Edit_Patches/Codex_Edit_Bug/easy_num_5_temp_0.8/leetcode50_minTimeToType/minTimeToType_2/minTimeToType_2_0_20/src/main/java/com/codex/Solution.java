package com.codex;

import java.util.*;

public class Solution {
public int count(TreeNode root) {
    if (root == null)
        return 0;
    if (root.left == null && root.right == null)
        return 1;
    return count(root.left) + count(root.right);
}

    
}