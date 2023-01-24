package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int maxRotateFunction(int[] A) {
        // F(0) = (0*4) + (1*0) + (2*1) + (3*3) = 0
        // F(1) = (0*3) + (1*4) + (2*0) + (3*1) = 1
        // F(2) = (0*2) + (1*3) + (2*4) + (3*0) = 8
        // F(3) = (0*1) + (1*2) + (2*3) + (3*4) = 6
        // F(4) = (0*0) + (1*1) + (2*2) + (3*3) = 10
        // F(5) = F(4) + A(0) - A(4-1)
        // F(6) = F(5) + A(0) + A(5-1)
        // F(6) = F(5) + F(0) - F(5-1)
        // F(6) = F(0) + (A(0) + A(1) + ... + A(5)) - (A(0) + A(1) + ... + A(4))
        // F(7) = F(1) + (A(0) + A(1) + ... + A(6)) - (A(0) + A(1) + ... + A(5))
        // F(7) = F(1) + F(6) - F(6-1)
        // F(7) = F(1) + F(6) - F(0)
        // F(8) = F(2) + F(7) - F(7-1)
        // F(8) = F(2) + F(7) - F(1)
        // F(9) = F(3) + F(8) - F(8-1)
        // F(9) = F(3) + F(8) - F(2)
        
        if (A.length == 0) {
            return 0;
        }

        int n = A.length;
        double largestSum = -Double.MAX_VALUE;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i];
        }

        double current = 0;
        for (int i = 0; i < n; i++) {
           current += i * A[i];
        }

        largestSum = Math.max(largestSum, current);
        for (int i = 1; i < n; i++) {
            current += sum - n * A[n - i];
            largestSum = Math.max(largestSum, current);
        }

}
        return (int) largestSum;
    }
}