package com.codex;

import java.util.*;

public class Solution {
public class DieRolls {
    public static int[] missingRolls(int[] rolls, int mean, int n)
    {
        int new_mean = mean - n;
        int lowest = new_mean/n;
        int highest = lowest;

        for(int i = 0; i < rolls.length; i++)
        {
            highest--;
            if(highest < 1) {
                highest = lowest;
            }
            new_mean = new_mean - rolls[i];
            int nn = n - i - 1;
            int temp_lowest = new_mean/nn;
            if(temp_lowest < lowest) {
                lowest = temp_lowest;
            }
        }

        if(lowest < 1) {
            lowest = 1;
        } else if(highest > 6) {
            highest = 6;
        } 

        int[] result = new int[n];
        if(lowest == highest) {
            for(int i = 0; i < n; i++) {
                result[i] = lowest;
            }
        }
        else {
            int n_lowest = new_mean - lowest*n;
            int n_highest = n - n_lowest;
            int i;
            for(i = 0; i < n_lowest; i++) {
                result[i] = lowest;
            }
            for(; i < n; i++) {
                result[i] = highest;
            }
        }
        return result;
    }
}

class DieRollsTester {
    public static void main(String[] args) {
        DieRolls die = new DieRolls();
        int[] rolls = {1, 1, 3, 3, 3};
        int N_ROLLS = 9;
        for(int i = 0; i < 100; i++) {
            int mean = (int)(Math.random()*(36-N_ROLLS))+N_ROLLS;
            int[] missingRolls = die.missingRolls(rolls,mean,N_ROLLS);
            int sum = 0;
            boolean flag = (missingRolls.length != rolls.length);
            for(int j = 0; j < missingRolls.length; j++) {
                if(missingRolls[j] > 6 || missingRolls[j] < 1) {
                    flag = true;
                }
                sum += missingRolls[j];
            }
            for(int j = 0; j < rolls.length; j++) {
                sum += rolls[j];
            }
            if(sum != mean) {
                flag = true;
            }
            if(flag) {
                System.out.println("Error: The program does not work");
                System.exit(1);
            }
        }
        System.out.println("The program works");
    }
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


public class DieRolls {
    public static int[] missingRolls(int[] rolls, int mean, int n)
    {
        int new_mean = mean - n;
        int lowest = new_mean/n;
        int highest = lowest;

        for(int i = 0; i < rolls.length; i++)
        {
            highest--;
            if(highest < 1) {
                highest = lowest;
            }
            new_mean = new_mean - rolls[i];
            int nn = n - i - 1;
            int temp_lowest = new_mean/nn;
            if(temp_lowest < lowest) {
                lowest = temp_lowest;
            }
        }
        if(lowest < 1) {
            lowest = 1;
        } else if(highest > 6) {
            highest = 6;
        }
        while (n > 0) {
            missingRolls[n - 1] = lowest;
            n--;
        }


        return missingRolls;

}
    }

    
}