package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLength = sc.nextInt();
        int[] inputs = new int[inputLength];
        for (int i = 0; i < inputLength; i++) {
            inputs[i] = sc.nextInt();
        }
        int maxNegative = -10000;
        for (int i : inputs) {
            if (i < 0) {
                maxNegative = Math.max(maxNegative, i);
            }
        }

        if (maxNegative == -10000) { // all positive
            single(inputs);
        } else {
            dual(inputs, maxNegative);
        }
    }

    private static void single(final int[] inputs) {
        int start = 0;
        int end = inputs.length - 1;
        long maxSum = -10000;
        while (start < end) {
            long sum = inputs[start] + inputs[end];
            maxSum = Math.max(maxSum, sum);
            if (inputs[end] >= sum && start != end - 1) {
                end--;
            } else { // end == start + 1
                start++;
                end = inputs.length - 1;
            }
        }

        System.out.println(maxSum);
    }

    private static void dual(final int[] inputs, final int maxNegative) {
        int start = 0;
        int end = inputs.length - 1;
        long maxSum = -10000;
        long lastOver = -10000;

        while (start < end) {
            long sum = inputs[start] + inputs[end];
            maxSum = Math.max(maxSum, sum);
            if (inputs[end] >= sum) {
                if (sum > lastOver) {
                    lastOver = sum;
                } else {
                    end--;
                }
            } else {
                if (lastOver == -10000) {
                    start++;
                    end = inputs.length - 1;
                } else {
                    long tempSum = inputs[start] + lastOver;
                    maxSum = Math.max(maxSum, tempSum);
                    lastOver = -10000;
                    start++;
                    end = inputs.length - 1;
                }
            }
        }

        }

        System.out.println(maxSum);
    }

}
}