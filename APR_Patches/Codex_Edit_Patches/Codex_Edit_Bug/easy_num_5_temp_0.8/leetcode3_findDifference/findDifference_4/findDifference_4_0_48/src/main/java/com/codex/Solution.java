package com.codex;

import java.util.*;

public class Solution {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        for (int n : nums1) {
            if (!set2.contains(n)) {
                set2.add(n);
            } else {
                set2.remove(n);
            }
        }
        for (int n : nums2) {
            if (!set1.contains(n)) {
                set1.add(n);
            } else {
                set1.remove(n);
            }
        }
        ans.add(new ArrayList<>(set1));
        ans.add(new ArrayList<>(set2));
        return ans;
    }

    public List<String> findWords(char[][] board, String[] words) {
        
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            if (helper(board, word)) {
                ans.add(word);
            }
        }
        return ans;
    }
    private boolean helper(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, 0, i, j, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, String word, int index, int i, int j, boolean[][] visited) {
        if (word.length() == index) {
            return true;
        }
        if (!isValid(board, i, j)) {
            return false;
        }
        if (visited[i][j]) {
            return false;
        }
        if (board[i][j] != word.charAt(index)) {
            return false;
        }
        visited[i][j] = true;
        boolean ans = dfs(board, word, index + 1, i + 1, j, visited) ||
        dfs(board, word, index + 1, i - 1, j, visited) ||
        dfs(board, word, index + 1, i, j + 1, visited) ||
        dfs(board, word, index + 1, i, j - 1, visited);
        visited[i][j] = false;
        return ans;
    }
    private boolean isValid(char[][] board, int i, int j) {
        return i >= 0 && i < board.length && j >= 0 && j < board[0].length;
    }
}