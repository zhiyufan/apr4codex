package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int ans = 0;
        for (int i = 0; i < tickets.length; i++){
            ans += tickets[i];
            if (i == k){
                break;
            }
        }
        return ans;
    }

    
}