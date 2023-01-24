package com.codex;

import java.util.*;

public class Solution {
class Solution {
   public static int minStoneSum(int[] piles, int k) {
        
        int low = 0;
        int high = 0;
        for(int pile : piles){
            high += pile;
            if(low < pile) low = pile;
        }
        
        while(low < high){
            int mid = low + (high-low)/2;
            if(canFullFill(piles, k, mid)){
                high = mid;
            }else{
                low = mid+1;
            }
            
        }
        return right;
    }

    private static boolean canGet(int[] piles, int k, int mid) {
        int count = 0;
        for (int i = 0; i < piles.length; i++) {
            count += piles[i] / mid;
        }
        return count >= k;
    }

    
}