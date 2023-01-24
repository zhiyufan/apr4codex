package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author alexey
 */
public class DiceThrows {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter sum of all rolls: ");
        int sum = sc.nextInt();
        System.out.println("Enter number of throws: ");
        int n = sc.nextInt();
        System.out.println("Enter all rolls: ");
        int[] rolls = new int[n - 1];
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = sc.nextInt();
        }
        int[] missingRolls = missingRolls(rolls, sum, n);
        
        if (missingRolls.length != 0) {
            System.out.println("Missing rolls: ");
            for (int i = 0; i < missingRolls.length; i++) {
                System.out.print(missingRolls[i] + " ");
            }
        } else {
            System.out.println("The result cannot be reached");
        }
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {

        int[] missingRolls = new int[n];

        for (int i : rolls) {
            mean = mean - rolls[i];
        }

        int next = mean / n;
        if (next > 6 || next < 1) {
            return new int[0];
        }

        if (next == 6) { // if it is 3,2 then n = 2 and it will go into this if statement
            while (n > 0) {
                missingRolls[n - 1] = 6; // start filling array with 6's
                n--;
            }
        } else if (next == 1) {
            while (n > 0) {
                missingRolls[n - 1] = 1; // start filling array with 1's
                n--;
            }
        } else {
            while (n > 0) {
                missingRolls[n - 1] = next; // fill array with next till n equals 1
                n--;
            }
        }
        

        return missingRolls;
    }

}
}