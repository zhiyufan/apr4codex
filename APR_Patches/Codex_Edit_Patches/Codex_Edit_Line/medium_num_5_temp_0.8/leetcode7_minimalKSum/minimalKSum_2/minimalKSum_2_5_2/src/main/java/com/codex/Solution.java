package com.codex;

import java.util.*;

public class Solution {
package com.tian.leetcode.code.com.leetcode.util;

import com.tian.shujujiegou.code3.TreeNode;

/**
 * @author tian
 * @date 2019/6/28 11:31
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }

    public static ListNode createListNode(int[] nums){
        if(nums.length==0){
            return null;
        }
        ListNode listNode = new ListNode(nums[0]);
        ListNode tmp = listNode;
        for (int i = 1; i < nums.length; i++) {
            ListNode ln = new ListNode(nums[i]);
            tmp.next = ln;
            tmp = tmp.next;
        }
        return listNode;
    }

    public static void print(ListNode listNode){
        while(listNode!=null){
            System.out.print(listNode.val+" ");
            listNode = listNode.next;
        }
    }

    public static void minimalKSum(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            pq.add(num);
        }
        for(int i = 1; i <= k; i++) {
            if(pq.peek() < i) {
                pq.add(i);
            }
        }
        long sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
    }


}
}