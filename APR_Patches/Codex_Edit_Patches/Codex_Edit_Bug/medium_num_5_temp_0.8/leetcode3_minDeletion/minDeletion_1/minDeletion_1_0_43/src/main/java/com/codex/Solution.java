package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int n) {
        

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
            else if (i % 2 == 0 || i % 3 == 0){
                count+=2;
            }
            else{
                count+=3;
            }
            
                count++;
            }
        }
        return count;
    }
}