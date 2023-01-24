package com.codex;

import java.util.*;

public class Solution {
// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int max = 1000000000;
        int count = 0;
        boolean flag = true;
        while (flag) {
            max--;
            count = 0;
            for (int i = 0; i < A.length; i++) {
                int n = A[i] * max;
                if (n >= B[i]) count++;
            }
            if (count == A.length) flag = false;
        }
        return max + 1;
    }

}
}