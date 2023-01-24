package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        
    }
    public static void main(String[] args) {
        System.out.println(timeRequiredToBuy(new int[]{1, 2, 3, 4}, 2));
    }

    private static int timeRequiredToBuy(int[] tickets, int k) {
        int[] _tickets = new int[tickets.length];
        System.arraycopy(tickets, 0, _tickets, 0, tickets.length);
        Arrays.sort(_tickets);
        int start = 0, end = _tickets.length - 1;
        int count = 0;

        while(start < end) {
            _tickets[end] /= 2;
            count++;

            if (k < count) {
                break;
            }

            while (start < end && _tickets[start] <= _tickets[end]) {
                start++;
            }
        }

        return _tickets.length - start;
    }
    }
}
}