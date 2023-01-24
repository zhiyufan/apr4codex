package com.codex;

import java.util.*;

public class Solution {
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rungs = new int[n];
        for (int i = 0; i < n; i++) {
            rungs[i] = sc.nextInt();
        }
        System.out.println(addRungs(rungs, sc.nextInt()));
    }

    public static int addRungs(int[] rungs, int dist) {

        int count = 1;
        int max = rungs[0];
        for (int r : rungs) {
            if (r > max) {
                if (r - max > dist) {
                    max = r;
                    count++;
                }
            }
        }

        return count;
    }

    
}