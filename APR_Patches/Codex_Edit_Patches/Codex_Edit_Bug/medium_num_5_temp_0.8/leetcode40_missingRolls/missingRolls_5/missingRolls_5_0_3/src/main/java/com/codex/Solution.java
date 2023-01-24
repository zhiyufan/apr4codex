package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int size = scan.nextInt();
            int[] array = new int[size - 1];

            int sum = 0;
            for(int j = 0; j < size - 1; j++) {
                array[j] = scan.nextInt();
                sum = sum + array[j];
            }
            int missing = (size * (size + 1)) / 2 - sum;
            System.out.println(missing);
        }
    }

}
}