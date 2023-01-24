package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            cur = cur.next;
        }
        while (l1 != null) {
            int sum = l1.val + carry;
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;
            l1 = l1.next;
            cur = cur.next;
        }
        while (l2 != null) {
            int sum = l2.val + carry;
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;
            l2 = l2.next;
            cur = cur.next;
        }
        if (carry != 0) {
            cur.next = new ListNode(carry);
        }
        return dummy.next;
    }

    public ListNode merge(List<ListNode> listOfLists) {
        if (listOfLists.size() == 0) {
            return null;
        }
        return helper(listOfLists, 0, listOfLists.size() - 1);
    }

    private ListNode helper(List<ListNode> listOfLists, int left, int right) {
        if (left == right) {
            return listOfLists.get(left);
        }
        int mid = left + (right - left) / 2;
        ListNode leftNode = helper(listOfLists, left, mid);
        ListNode rightNode = helper(listOfLists, mid + 1, right);
        return mergeTwo(leftNode, rightNode);
    }

    private ListNode mergeTwo(ListNode node1, ListNode node2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while (node1 != null && node2 != null) {
            if (node1.val <= node2.val) {
                cur.next = node1;
                node1 = node1.next;
            } else {
                cur.next = node2;
                node2 = node2.next;
            }
            cur = cur.next;
        }
        if (node1 != null) {
            cur.next = node1;
        }
        if (node2 != null) {
            cur.next = node2;
        }
        return dummy.next;
    }
}





public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid / col][mid % col] == target) {
                return true;
            } else if (matrix[mid / col][mid % col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}





public class Solution {
    public String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) {
            return "";
        }
        Map<Character, Integer> dict = new HashMap<Character, Integer>();
        for (Character c : t.toCharArray()) {
            if (!dict.containsKey(c)) {
                dict.put(c, 1);
                } else {
                    dict.put(c, dict.get(c) + 1);
                }
            }
        }
        int match = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (dict.containsKey(c)) {
                dict.put(c, dict.get(c) - 1);
                if (dict.get(c) >= 0) {
                    match++;
                }
                while (match == t.length()) {
                    if (minLen > i - start + 1) {
                        minLen = i - start + 1;
                        res = s.substring(start, i + 1);
                    }
                    char cur = s.charAt(start);
                    if (dict.containsKey(cur)) {
                        dict.put(cur, dict.get(cur) + 1);
                        if (dict.get(cur) > 0) {
                            match--;
                        }
                    }
                    start++;
                }
            }
        }
        return res;
    }
}
}