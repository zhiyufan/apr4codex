package com.codex;

import java.util.*;

public class Solution {

import java.util.Arrays;

public class GcdLcm {

    public static void main(String[] args)
    {
        int n1 = 72, n2 = 120, gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }

        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
    }

}
}