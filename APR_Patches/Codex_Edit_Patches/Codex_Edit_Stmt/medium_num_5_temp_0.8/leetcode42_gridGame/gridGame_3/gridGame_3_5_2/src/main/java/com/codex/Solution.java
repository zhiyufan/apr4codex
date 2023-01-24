package com.codex;

import java.util.*;

public class Solution {
function connect(root) {
    if (!root) return root;
    if (root.left) {
        root.left.next = root.right;
        if (root.next) root.right.next = root.next.left;
    }

    connect(root.left);
    connect(root.right);
    return root;
}
}