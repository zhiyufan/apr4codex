package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public static int minDeletionSize(String[] A) {
        

        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            
            for (int j = 0; j < A.length-1; j++) {
                if (A[j].charAt(i) > A[j+1].charAt(i)) {
                    count++; 
                    break;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String[] s = {"cba", "daf", "ghi"};
        
        System.out.println(minDeletionSize(s));
        
    }
}
    }

    
}