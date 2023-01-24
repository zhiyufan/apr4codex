package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] A = {1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0};
        int[] B = {0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1};
        int[] C = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1};
        System.out.println(findDifferentBinaryString(A)); // 10010100010
        System.out.println(findDifferentBinaryString(B)); // 1001010001
        System.out.println(findDifferentBinaryString(C)); // 11010101000
}
}