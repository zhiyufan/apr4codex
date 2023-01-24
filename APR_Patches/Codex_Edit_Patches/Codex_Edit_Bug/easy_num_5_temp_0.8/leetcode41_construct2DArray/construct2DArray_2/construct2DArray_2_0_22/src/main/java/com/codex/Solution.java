package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i * n + j < original.length) {
                    result[i][j] = original[i * n + j];
                }
            }
        }
        return result;
    }




        public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode first = null;
        ListNode second = null;
        ListNode last = dummyHead;
        int count = 1;
        while (count < m) {
            last = last.next;
            count++;
        }
        first = last;
        last = last.next;
        count++;
        while (count <= n) {
            ListNode temp = last;
            last = last.next;
            temp.next = first.next;
            first.next = temp;
            count++;
        }
        return dummyHead.next;
    }

    
}