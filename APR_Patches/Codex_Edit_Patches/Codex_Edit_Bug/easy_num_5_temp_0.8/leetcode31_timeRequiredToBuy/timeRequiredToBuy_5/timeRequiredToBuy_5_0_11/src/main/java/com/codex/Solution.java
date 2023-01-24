package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i : tickets) {
            q.offer(i);
        }
        int cur = 0;
        while (k > 0) {
            int num = q.poll();
            if (num > 1) {
                q.offer(num - 1);
            }
            cur++;
            k--;
        }
        while (!q.isEmpty()) {
            q.poll();
            cur++;
        }
        return cur;
    }


    public static int[] dataReverse(int[] data) {
        
        List<Integer> list = new ArrayList<Integer>();
        for (int i = data.length - 1; i >= 0; i--) {
            list.add(data[i]);
        }
        int[] res = new int[data.length];
        int k = 0;
        while (k < list.size()) {
            res[k] = list.get(k);
            k++;
        }
        return res;
    }



    public static boolean isDivisible(long n, long x, long y) {
        if (n % x == 0 && n % y == 0) {
            return true;
        }
        return false;
    }


    
    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus) {
            return "\u00A3" + salary * 10;
        }
        return "\u00A3" + salary;
    }


        

    
}