package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public static void main(String[] args) {
        int num = 22;

        long[] result = new long[3];
        result = sumOfThree(num);

        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }

    public static long[] sumOfThree(int num) {
        
        long[] result = new long[3];
        boolean flag = false;
        for (int i = 1; i < num/3; i++) {
            if (flag == false) {
                for (int j = i; j < num/2; j++) {
                    if (flag == false) {
                        for (int k = j + 1; k < num; k++) {
                            if (flag == false) {
                                if (i + j + k == num) {
                                    result[0] = i;
                                    result[1] = j;
                                    result[2] = k;
                                    flag = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
    
}