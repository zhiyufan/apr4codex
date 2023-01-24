package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class file {   
    public static void main(String[] args) {

        int[] test = {2,2,2};
        System.out.println(timeRequiredToBuy(test, 4));

    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i : tickets) {
            q.offer(i);
        }
        int max = 0;
        for (int i : tickets) {
            if (i > max) {max = i;}
        }
        int cur = 0;
        while (k > 0 && max > 0) {
            int num = q.poll();
            if (num > 1) {
                q.offer(num - 1);
            }
            if (num == max) {
                max--;
            }
            cur++;
            k--;
        }
        while (max > 0) {
            max--;
            cur++;
        }
        while (!q.isEmpty()) {
            q.poll();
            cur++;
        }
        return cur;
    }
}

    
}