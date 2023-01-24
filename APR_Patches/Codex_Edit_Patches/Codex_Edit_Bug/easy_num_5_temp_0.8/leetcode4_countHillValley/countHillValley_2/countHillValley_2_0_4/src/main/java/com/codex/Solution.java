package com.codex;

import java.util.*;

public class Solution {
package dsalgjava.ch07.lst0708;

import java.util.Random;

import dsalgjava.ch03.shared.ArrayNonSorted;
import dsalgjava.tools.RandomArray;

public class CountHillValley {

    public static void main(String[] args) {
        int n = 20;
        int maxValue = 9;
        RandomArray randomArray = new RandomArray(n, maxValue);
        int[] a = randomArray.get();
        ArrayNonSorted.display(a);
        int count = countHillValley(a);
        System.out.println("hills: " + count);

        n = 10;
        a = new int[n];
        int i = 0;
        Random random = new Random();
        a[i++] = random.nextInt(maxValue);
        while (i < n) {
            int sign = random.nextInt(2);
            int delta = random.nextInt(maxValue);
            if (sign == 0) {
                delta = -delta;
            }
            a[i] = a[i - 1] + delta;
            i++;
        }
        ArrayNonSorted.display(a);
        count = countHillValley(a);
        System.out.println("hills: " + count);

        n = 10;
        a = new int[n];
        a[0] = random.nextInt(maxValue);
        for (int j = 1; j < n; j++) {
            a[j] = a[j - 1] + random.nextInt(maxValue);
        }
        ArrayNonSorted.display(a);
        count = countHillValley(a);
        System.out.println("hills: " + count);
    }

    public static int countHillValley(int[] a) {
        int n = a.length;
        int hills = 0;
        int valleys = 0;
        int i = 0;
        
        while (i < n - 1) {
            if (a[i] < a[i + 1]) {
                while (i < n - 1 && a[i] <= a[i + 1]) { i++; }
                if (i == n - 1) {
                    break;
                }
                hills++; 
            } else if (a[i] > a[i + 1]) {
                while (i < n - 1 && a[i] >= a[i + 1]) { i++; }
                if (i == n - 1) {
                    break;
                }
                valleys++; 
            }
        }
        return hills + valleys;
    }

}
}