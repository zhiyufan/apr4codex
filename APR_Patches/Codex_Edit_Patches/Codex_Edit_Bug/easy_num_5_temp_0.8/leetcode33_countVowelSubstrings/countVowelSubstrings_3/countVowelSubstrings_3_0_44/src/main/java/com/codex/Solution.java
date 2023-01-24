package com.codex;

import java.util.*;

public class Solution {

public class JavaApplication {
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 7;
        System.out.println("To the power of 2: " + power(7, 2));
        System.out.println("To the power of 3: " + power(7, 3));
        System.out.println("To the power of 4: " + power(7, 4));
        System.out.println("To the power of 5: " + power(7, 5));
        System.out.println("To the power of 6: " + power(7, 6));
    }


    public static double power(int base, int power) {
        if (base == 0)
            return 0;
        else if (power == 0)
            return 1;
        else
            return base * power(base, power - 1);
    }
}
}