package com.codex;

import java.util.*;

public class Solution {
/**
 * Created by rahul.pandey on 9/3/17.
 */
public class Tickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int[] max = new int[tickets.length];
        int[] sec = new int[tickets.length];
        int[] pos = new int[tickets.length];
        int[] res = new int[tickets.length];
        res[0] = tickets[0];
        max[0] = tickets[0];
        sec[0] = 0;
        pos[0] = -1;
        for (int i = 1; i < tickets.length; i++) {
            res[i] = tickets[i] + max[i - 1];
            if (tickets[i] > max[i - 1]) {
                max[i] = tickets[i];
                sec[i] = max[i - 1];
                pos[i] = i;
            } else if (tickets[i] > sec[i - 1]) {
                max[i] = max[i - 1];
                sec[i] = tickets[i];
                pos[i] = pos[i - 1];
            } else {
                max[i] = max[i - 1];
                sec[i] = sec[i - 1];
                pos[i] = pos[i - 1];
            }
        } 
        int maxx = res[0];
        int posi = 0;
        for (int i = 1; i < res.length; i++) {
            if (res[i] > maxx) {
                maxx = res[i];
                posi = i;
            }
        }
        System.out.println(maxx);
        System.out.println(posi);
        System.out.println(Arrays.toString(max));
        System.out.println(Arrays.toString(sec));
        System.out.println(Arrays.toString(pos));
        int cnt = 0;
        while (posi >= 0) {
            cnt++;
            int temp = tickets[posi];
            tickets[posi] = 0;
            posi = pos[posi - 1];
            for (int i = 0; i < temp - 1; i++) {
                posi = pos[posi - 1];
                cnt++;
            }
        }
        return cnt;
    }
}

    
}