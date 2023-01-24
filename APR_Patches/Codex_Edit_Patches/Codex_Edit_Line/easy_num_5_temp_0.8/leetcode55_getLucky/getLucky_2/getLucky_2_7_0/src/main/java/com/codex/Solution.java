package com.codex;

import java.util.*;

public class Solution {
  import java.util.Scanner;

class Main{
	public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = 0;
        for(int j=0;j<arr.length;j++){
            sum = sum + arr[j]*k;
        }
        int temp = 0;
        for(int j=0;j<arr.length;j++){
            temp = temp + arr[j];
        }
        System.out.println(sum+temp);
	}
}


    public static int getLucky(String s, int k) {
        

        s = s.toLowerCase();
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            number = number + s.charAt(i) - 96;
        }
        while (k > 0) {
            int sum = 0;
            while (number != 0) {
                sum = sum + number % 10;
                number = number / 10;
            }
            number = sum;
            k--;
        }
        return number;
    }
}