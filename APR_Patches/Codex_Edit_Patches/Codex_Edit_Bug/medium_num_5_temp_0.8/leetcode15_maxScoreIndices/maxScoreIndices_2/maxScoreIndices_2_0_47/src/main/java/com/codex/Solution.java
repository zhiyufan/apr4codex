package com.codex;

import java.util.*;

public class Solution {
public static void main(String[] args) throws IOException {
        System.out.println(StringHelper.isPalindrome("aabbc"));
    }

    private static class StringHelper {

        public static boolean isPalindrome(String input) {
            int[] count = new int[128];
            char[] array = input.toCharArray();
            for (int i = 0; i < array.length; i++) {
                count[array[i] - 'a']++;
            }
            int oddCount = 0;
            for (int c : count) {
                if (c % 2 != 0 && ++oddCount > 1) return false;
            }
            return true;
        }
    }

    private static class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}