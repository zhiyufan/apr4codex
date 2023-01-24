package com.codex;

import java.util.*;

public class Solution {
package DSA;

public class LCM {

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static int findLCM(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
}