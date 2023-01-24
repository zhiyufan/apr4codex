package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    
    public static int[] minMoves(int[] arr) {
        
        int min_value = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            min_value = Math.min(min_value, arr[i]);
        }
        
        int[] moves = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                moves[i] = (arr[i] - min_value) / 2;
            } else {
                moves[i] = arr[i] - min_value;
            }
        }
        return moves;
    }

}
    
}