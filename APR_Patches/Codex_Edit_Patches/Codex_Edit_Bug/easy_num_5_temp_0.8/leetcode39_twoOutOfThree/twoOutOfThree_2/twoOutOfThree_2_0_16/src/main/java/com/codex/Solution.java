package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums1) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : nums2) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : nums3) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int n : map.keySet()) {
            if (map.get(n) > 1) {
                list.add(n);
            }
        }
        return list;
    }

    private static void preorderTraversal(TreeNode t) {
        if (t == null) return;
        System.out.print(t.val + " ");
        preorderTraversal(t.left);
        preorderTraversal(t.right);
    }

    private static void inorderTraversal(TreeNode t) {
        if (t == null) return;
        inorderTraversal(t.left);
        System.out.print(t.val + " ");
        inorderTraversal(t.right);
    }

    private static void postorderTraversal(TreeNode t) {
        if (t == null) return;
        postorderTraversal(t.left);
        postorderTraversal(t.right);
        System.out.print(t.val + " ");
    }

    private static void preorderTraversalIter(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val + " ");
            
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    private static void inorderTraversalIter(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            System.out.print(cur.val + " ");
            cur = cur.right;
        }
    }

    private static void postorderTraversalIter(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == prev) {
                System.out.print(cur.val + " ");
                prev = cur;
                stack.pop();
                cur = null;
            } else {
                cur = cur.right;
            }
        }
    }

    private static void dfs(TreeNode root) {
        if (root == null) return;

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode prev = null;
        while (!stack.isEmpty()) {
            TreeNode cur = stack.peek();
            if (prev == null || cur == prev.left || cur == prev.right) {
                if (cur.left != null) {
                    stack.push(cur.left);
                } else if (cur.right != null) {
                    stack.push(cur.right);
                } else {
                    stack.pop();
                    list.add(cur.val);
                }
            } else if (prev == cur.left) {
                if (cur.right != null) {
                    stack.push(cur.right);
                } else {
                    stack.pop();
                    list.add(cur.val);
                }
            } else if (prev == cur.right) {
                stack.pop();
                list.add(cur.val);
            }
            prev = cur;
        }
        System.out.println(list);
    }

    private static void dfs2(TreeNode root) {
        if (root == null) return;

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode prev = null;
        while (!stack.isEmpty()) {
            TreeNode cur = stack.peek();
            if (prev == null || cur == prev.left || cur == prev.right) {
                if (cur.left != null) {
                    stack.push(cur.left);
                } else if (cur.right != null) {
                    stack.push(cur.right);
                } else {
                    stack.pop();
                    list.add(cur.val);
                }
            } else if (prev == cur.left) {
                if (cur.right != null) {
                    stack.push(cur.right);
                } else {
                    stack.pop();
                    list.add(cur.val);
                }
            } else if (prev == cur.right) {
                stack.pop();
                list.add(cur.val);
            }
            prev = cur;
        }
        System.out.println(list);
    }

    private static void dfs3(TreeNode root) {
        if (root == null) return;

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode prev = null;
        while (!stack.isEmpty()) {
            TreeNode cur = stack.peek();
            if (prev == null || cur == prev.left || cur == prev.right) {
                if (cur.left != null) {
                    stack.push(cur.left);
                } else if (cur.right != null) {
                    stack.push(cur.right);
                } else {
                    stack.pop();
                    list.add(cur.val);
                }
            } else if (prev == cur.left) {
                if (cur.right != null) {
                    stack.push(cur.right);
     
    
}