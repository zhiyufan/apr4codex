package com.codex;

import java.util.*;

public class Solution {
//question is :-
//find the sum of given array
//if the sum is 17 
//3+4+5+5= 17
//input - 3,4,5,5,0,0,0,0,0
//4+4+4+4+4+4+4+4+4=36
//input 4,4,4,4,4,4,4,4,4




    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] ans = new int[n];
        int sum1 = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum1 += rolls[i];
        }
        int sum = (mean * (n + rolls.length)) - sum1;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sum / n;
        }
        return ans;
    }

    //main function
      public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int mean = sc.nextInt();
            int[] rolls = new int[n];
            for (int i = 0; i < n; i++) {
                rolls[i] = sc.nextInt();
            }
            rolls = missingRolls(rolls, mean, n);
            for (int i = 0; i < rolls.length; i++) {
                System.out.print(rolls[i]+" ");
            }
            System.out.println();
        }

    }
}