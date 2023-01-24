package com.codex;

import java.util.*;

public class Solution {
public static int minSteps(String s, String t) {
        
    int[] letters = new int[26];
    int res = 0;
    for (char c : s.toCharArray()) {
        letters[c - 'a']++;
    }
    for (char c : t.toCharArray()) {
        letters[c - 'a']--;
    }
    for (int i : letters) {
        res += Math.abs(i);
    }
    return res / 2;
}

    /**
     * fix bug
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    /**
     * fix bug
     */
    public int maxProfit2(int[] prices) {
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit = maxProfit + prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }


    /**
     * fix bug
     */
    public int rob(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                a = Math.max(a + nums[i], b);
            } else {
                b = Math.max(a, b + nums[i]);
            }
        }
        return Math.max(a, b);
    }

    /**
     * fix bug
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pre = null;
        ListNode cur = slow;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        ListNode p1 = head;
        ListNode p2 = pre;
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    /**
     * fix bug
     */
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0) {
            return 0;
        }
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int maxEnvelopes = 1;
        int[] dp = new int[envelopes.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < envelopes.length; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxEnvelopes = Math.max(maxEnvelopes, dp[i]);
        }
        return maxEnvelopes;
    }

    /**
     * fix bug
     */
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                minLen = Math.min(minLen, i - start + 1);
                sum -= nums[start++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}