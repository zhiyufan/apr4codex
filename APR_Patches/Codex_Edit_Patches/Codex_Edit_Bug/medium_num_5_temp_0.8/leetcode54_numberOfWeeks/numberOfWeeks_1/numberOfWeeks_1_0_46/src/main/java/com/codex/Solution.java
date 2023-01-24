package com.codex;

import java.util.*;

public class Solution {
    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int turn = (n - p) / 2;
        int turnFromLeft = p / 2;
        System.out.println(turn+" "+turnFromLeft);
        return (turn < turnFromLeft)? turn : turnFromLeft;

     }


    
    
}