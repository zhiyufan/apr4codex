package com.codex;

import java.util.*;

public class Solution {
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.println("Enter your place of birth: ");
        String placeOfBirth = scanner.nextLine();
        System.out.println("Enter your date of birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Enter your nickname: ");
        String nickname = scanner.nextLine();

    }

    public static void luckyNumber(String s) {
        int luckyNumber = getLucky(s,2);
        System.out.println("Your lucky number is: " + luckyNumber);
    }

    public static int getLucky(String s, int k) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                number += c - 'a' + 1;
            }
            if (c >= 'A' && c <= 'Z') {
                number += c - 'A' + 1;
            }
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

    public static int[] getHashCode(String s) {
        int[] hashCode = new int[5];

        return hashCode;
    }
}
}