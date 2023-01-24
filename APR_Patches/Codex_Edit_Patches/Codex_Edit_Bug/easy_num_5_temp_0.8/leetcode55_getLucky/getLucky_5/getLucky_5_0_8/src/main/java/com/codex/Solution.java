package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Kata {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string");
        String s = input.nextLine();

        System.out.println("Enter the value of k");
        int k = input.nextInt();

        int i = getLucky(s, k);

        System.out.println("The transformed value is " + i);
    }

    public static int getLucky(String s, int k) {     

        int convert;

        for(int i = 0; i < s.length(); i++){
            convert += (int)s.charAt(i) - 96;
        }

        int transformation;

        if (k == 1) {
            transformation = convert;
        } else {
            int digit = s.length();
            int sum = 0;
            int c = convert;
            while (c > 0) {
                c = c / 10;
                ++digit;
            }

            while (convert > 0) {
                int r = convert % 10;
                sum = sum + r;
                convert = convert / 10;
            }
            transformation = sum;
        }

        return transformation;
    }
}