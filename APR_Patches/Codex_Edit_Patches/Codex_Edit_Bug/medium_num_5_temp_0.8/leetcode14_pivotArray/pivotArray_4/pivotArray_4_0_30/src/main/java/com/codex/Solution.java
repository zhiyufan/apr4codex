package com.codex;

import java.util.*;

public class Solution {
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
    
        public static void plusMinus(int[] arr) {

        int countp=0,countn=0,countz=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                countn++;
            }
            else if(arr[i]>0){
                countp++;
            }
            else {
                countz++;
            }
        }
        System.out.println((float)countp/arr.length);
        System.out.println((float)countn/arr.length);
        System.out.println((float)countz/arr.length);
    }

    
}