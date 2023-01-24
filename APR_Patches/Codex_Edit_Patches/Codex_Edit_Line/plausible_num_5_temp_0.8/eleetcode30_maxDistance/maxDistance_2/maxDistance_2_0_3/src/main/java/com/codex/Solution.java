package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class MyClass
{
    public static int maxDistance(int[] colors) {


        int n = colors.length;
        int maxDist = 0;
        int lastColor = -1;
        int lastColorPos = -1;
        for (int i = 0; i < n; i++) {
            if (colors[i] != lastColor) {
                if (lastColor != -1) {
                    maxDist = Math.max(maxDist, i - lastColorPos);
                }
                lastColor = colors[i];
                lastColorPos = i;
            }
        }
        return maxDist;
    }

    public static void main(String args[])
    {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        System.out.println(maxDistance(a));
    }
}
}