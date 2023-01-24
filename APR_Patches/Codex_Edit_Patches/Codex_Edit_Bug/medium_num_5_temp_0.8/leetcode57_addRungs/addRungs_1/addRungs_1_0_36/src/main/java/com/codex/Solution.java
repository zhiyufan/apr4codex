package com.codex;

import java.util.*;

public class Solution {
public class A {

    public int addRungs(int[] rungs, int dist) {


        if (rungs[0] > dist) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i < rungs.length; i++) {
            if (rungs[i] - rungs[i-1] > dist) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new A().addRungs(new int[]{4, 6, 8, 12, 14, 15}, 5));
    }
}
}