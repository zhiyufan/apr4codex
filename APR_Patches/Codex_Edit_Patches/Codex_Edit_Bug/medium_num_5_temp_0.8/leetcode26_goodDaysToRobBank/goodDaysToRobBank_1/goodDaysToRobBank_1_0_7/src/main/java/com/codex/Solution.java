package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Prog38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Введите количество отсчетов");
        int k = in.nextInt();
        in.close();
        boolean[] c = getGoodDays(a, k);
        for (int i = 0; i < c.length; i++) {
            if (c[i]) {
                System.out.println(i);
            }
        }
    }


    private static boolean[] getGoodDays(int[] a, int k) {
        boolean[] b = new boolean[a.length];
        for (int i = k - 1; i < a.length - k; i++) {
            boolean good = true;
            for (int j = i - k; j < i; j++) {
                if (a[j] >= a[j + 1]) {
                    good = false;
                    break;
                }
            }
            if (!good) continue;
            for (int j = i + 1; j < i + k; j++) {
                if (a[j - 1] >= a[j]) {
                    good = false;
                    break;
                }
            }
            b[i] = good;
        }

        return b;
    }
}
//1 2 3 4 5 6 7 8 9 10
//5
}