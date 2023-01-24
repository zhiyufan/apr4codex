package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Main{

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (isPrime(arr[i])) {
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                count--;
                System.out.print(arr[i]);
                if (count != 0) {
                    System.out.print(" ");
                }
            }
        }
        

 
        // Write your code here
        }

     
    }
}