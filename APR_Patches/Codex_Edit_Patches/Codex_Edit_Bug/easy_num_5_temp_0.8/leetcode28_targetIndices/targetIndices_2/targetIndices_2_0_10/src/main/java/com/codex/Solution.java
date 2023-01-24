package com.codex;

import java.util.*;

public class Solution {
public static double sumDouble(double x, double y) {
        double sum = x + y;
        if (x == y) {
            sum *= 2;
        }
        return sum;
    }
}