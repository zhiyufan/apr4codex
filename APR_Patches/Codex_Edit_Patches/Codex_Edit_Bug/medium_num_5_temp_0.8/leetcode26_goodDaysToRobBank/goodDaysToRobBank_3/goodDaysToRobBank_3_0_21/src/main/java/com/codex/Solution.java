package com.codex;

import java.util.*;

public class Solution {
      public boolean isPivot(TreeNode root, int key) {
        if (root == null) {
            return false;
        }
        if (root.key == key) {
            return true;
        }
        if (root.key > key) {
            return isPivot(root.left, key);
        } else {
            return isPivot(root.right, key);
        }
    }   
}