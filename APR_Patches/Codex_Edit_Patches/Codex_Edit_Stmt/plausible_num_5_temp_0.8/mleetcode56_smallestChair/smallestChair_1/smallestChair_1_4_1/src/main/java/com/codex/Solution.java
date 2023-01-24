package com.codex;

import java.util.*;

public class Solution {
// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int getMaxStockProfit(int[] prices) {
    int profit = 0;

    for (int i = 0; i < prices.length - 1; i++) {
        for (int j = i + 1; j < prices.length; j++) {
            if (prices[j] - prices[i] > profit)
                profit = prices[j] - prices[i];
        }
    }

    return profit;
}


public static int getMaxStockProfit(int[] prices) {
    int profit = 0;
    int min = Integer.MAX_VALUE;

    for (int p : prices) {
        if (p < min)
            min = p;
        else if (p - min > profit)
            profit = p - min;
    }

    return profit;
}

public static int getMaxStockProfit(int[] prices) {
    if (prices.length < 2)
        return 0;

    int maxProfit = prices[1] - prices[0];
    int minPrice = Math.min(prices[0], prices[1]);

    for (int i = 2; i < prices.length; i++) {
        maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        minPrice = Math.min(minPrice, prices[i]);
    }

    return maxProfit;
}

public static int getMaxStockProfit(int[] prices) {
    if (prices.length < 2)
        return 0;

    int minPrice = prices[0];
    int maxProfit = prices[1] - minPrice;

    for (int i = 2; i < prices.length; i++) {
        minPrice = Math.min(minPrice, prices[i]);
        int potentialProfit = prices[i] - minPrice;
        maxProfit = Math.max(maxProfit, potentialProfit);
    }

    return maxProfit;
}

// Space O(1)
public static LinkNode reverseLinkedList(LinkNode head) {
    LinkNode prev = null;
    while (head != null) {
        LinkNode next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
}

// Space O(N)
public static LinkNode reverseLinkedList(LinkNode head) {
    if (head == null) return null;

    LinkNode[] arr = reverseHelper(head);
    arr[0].next = null;
    return arr[1];
}

public static LinkNode[] reverseHelper(LinkNode head) {
    if (head.next == null)
        return new LinkNode[]{head, head};

    LinkNode[] arr = reverseHelper(head.next);
    arr[0].next = head;
    return new LinkNode[] {head, arr[1]};
}

public static LinkNode reverseLinkedList(LinkNode head) {
    return reverseHelper(head, null);
}

public static LinkNode reverseHelper(LinkNode head, LinkNode prev) {
    if (head == null) return null;

    LinkNode next = head.next;
    head.next = prev;

    if (next == null)
        return head;

    return reverseHelper(next, head);
}

// /

public static LinkNode reverseLinkedList(LinkNode head) {
    LinkNode curr = head;
    LinkNode prev = null;
    while (curr != null) {
        LinkNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}


// /

public static LinkNode getNthFromLast(LinkNode head, int n) {
    LinkNode p1 = head;
    LinkNode p2 = head;

    if (head == null)
        return null;

    for (int i = 0; i < n; i++) {
        p2 = p2.next;
        if (p2 == null) return null;
    }

    while (p2.next != null) {
        p1 = p1.next;
        p2 = p2.next;
    }
    return p1;
}

// /

public static boolean hasCycle(LinkNode head) {
    if (head == null)
        return false;

    LinkNode fast = head;
    LinkNode slow = head;

    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if (fast == slow)
            return true;
    }
    return false;
}

public static LinkNode detectCycle(LinkNode head) {
    if (head == null) return null;
    LinkNode fast = head;
    LinkNode slow = head;

    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;

        if (fast == slow) {
            slow = head;
            while (slow != fast) {
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
        }
    }
    return null;
}
}