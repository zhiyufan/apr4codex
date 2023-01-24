package com.codex;

import java.util.*;

public class Solution {
public class Program {

    public static int mean(int[] rolls) {
        
        int mean = 0;
        
        for (int i : rolls) {
			mean += i;
		}
        
        return mean / rolls.length;
    }

    public static int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] missingRolls = new int[n];

        for (int i = 0; i < rolls.length; i++) {
            mean = mean - rolls[i];
        }

        int next = mean / n;
        if (next > 6 || next < 1) {
            return new int[0];
        }

        if (next == 6) {
            while (n > 0) {
                missingRolls[n - 1] = 6;
                n--;
            }
        }
        if (next == 1) {
            while (n > 0) {
                missingRolls[n - 1] = 1;
                n--;
            }
        }
        while (n > 0) {
            missingRolls[n - 1] = next;
            n--;
        }

        return missingRolls;
    }
}

    //uncomment everything below to test your mean, roll, and missingRolls methods

    public static void main(String args[]) {
        //test mean
        
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        int[] array3 = {100, 200, 300, 400, 500};
        System.out.println(mean(array1) == 3);
        System.out.println(mean(array2) == 6);
        System.out.println(mean(array3) == 300);
        
        
        //test roll
        
        System.out.println(roll(5,10)[0] < 6);
        
        HashSet<Integer> set = new HashSet<>();
        for (int i : roll(5,10)) {
            set.add(i);
        }
        System.out.println(set.size() == 5);
        
        
        //test missingRolls
        
        int[] array4 = {1, 2, 3, 4, 5};
        int[] array5 = {3, 1, 5, 2};
        int[] array6 = {1, 2, 3, 4};
        System.out.println(missingRolls(array4, 10, 3)[0] == 1);
        System.out.println(missingRolls(array4, 10, 3)[1] == 2);
        System.out.println(missingRolls(array4, 10, 3)[2] == 3);
        System.out.println(missingRolls(array5, 10, 4)[0] == 2);
        System.out.println(missingRolls(array5, 10, 4)[1] == 3);
        System.out.println(missingRolls(array5, 10, 4)[2] == 4);
        System.out.println(missingRolls(array6, 10, 5).length == 0);
    }
}

    
}