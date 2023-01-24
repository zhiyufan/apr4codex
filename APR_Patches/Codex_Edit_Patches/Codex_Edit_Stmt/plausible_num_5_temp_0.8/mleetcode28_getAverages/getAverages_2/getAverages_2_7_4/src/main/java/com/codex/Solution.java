package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static List<Integer> findPrimes(int k) {
        List<Integer> primes = new ArrayList<>();
        if (k <= 1) {
            return primes;
        }
        boolean[] arr = new boolean[k + 1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i < k + 1; i++) {
            if (arr[i]) {
                for (int j = i * 2; j < k + 1; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i < k + 1; i++) {
            if (arr[i]) {
                primes.add(i);
            }
        }
        return primes;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        
        List<Integer> primes = findPrimes(k);
        for (int prime : primes) {
            System.out.println(prime);
        }
    }

    
}