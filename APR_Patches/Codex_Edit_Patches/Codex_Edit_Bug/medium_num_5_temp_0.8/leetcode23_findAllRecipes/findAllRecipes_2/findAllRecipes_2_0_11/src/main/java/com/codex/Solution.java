package com.codex;

import java.util.*;

public class Solution {
private static boolean isPerfectSquare(int n){
    if (n < 0) {
        return false;
    }

    int root = (int) Math.sqrt(n);
    return root * root == n;
}

private static void printPerfectSquares(int n){
    StringBuilder sb = new StringBuilder();

    int num;
    double squareRoot;

    for (int i = 0; i < n; i++) {
        num = i + 1;
        squareRoot = Math.sqrt(num);
        if(squareRoot == (int) squareRoot)
            sb.append(num + ",");
    }

    System.out.println(sb.substring(0, sb.length() - 1));
}
}