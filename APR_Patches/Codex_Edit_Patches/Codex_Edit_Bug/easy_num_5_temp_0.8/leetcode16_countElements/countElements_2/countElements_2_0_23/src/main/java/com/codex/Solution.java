package com.codex;

import java.util.*;

public class Solution {
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
}