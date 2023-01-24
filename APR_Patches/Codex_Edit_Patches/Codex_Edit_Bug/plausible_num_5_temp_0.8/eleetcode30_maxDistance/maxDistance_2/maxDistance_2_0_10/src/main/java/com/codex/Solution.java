package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Main {
    public static int maxDistance(int[] col) {
        int[] colors = col;

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
        maxDist = Math.max(maxDist, n - lastColorPos);
            }
        }
        return maxDist;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println(maxDistance(a));

        input.close();
    }
}
}