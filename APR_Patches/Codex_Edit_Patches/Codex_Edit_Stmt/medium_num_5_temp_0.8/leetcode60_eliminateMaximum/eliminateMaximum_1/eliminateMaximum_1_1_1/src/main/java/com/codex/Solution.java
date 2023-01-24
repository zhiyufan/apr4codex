package com.codex;

import java.util.*;

public class Solution {
    public static void test4() {
        int[] t = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int result = eliminateMaximum(t);
        if(result != 26) {
            System.out.println("test4 should return 26, not " + result);
        }
    }
}