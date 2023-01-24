package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static long gridGame(int[][] grid) {

        int[] first = new int[grid[0].length];
        int[] second = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            first[i] = grid[0][i];
        }
        for (int i = 0; i < grid[0].length; i++) {
            second[i] = grid[1][i];
        }
        Arrays.sort(first);
        Arrays.sort(second);
        int sum = 0, i = 0;
        boolean swap = true, check = true;
        while (i < grid[0].length) {
            if (check) {
                if (swap) {
                    sum += second[grid[0].length - i - 1];
                    swap = false;
                } else {
                    sum += first[grid[0].length - i - 1];
                    swap = true;
                }
                check = false;
                i++;
            } else {
                check = true;
            }
        }
        return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        int[][] grid = { { 3, 6, 3, 2, 4, 6 }, { 5, 4, 6, 1, 5, 5 } };
        long a = Result.gridGame(grid);
        System.out.println(a);
    }

}
}