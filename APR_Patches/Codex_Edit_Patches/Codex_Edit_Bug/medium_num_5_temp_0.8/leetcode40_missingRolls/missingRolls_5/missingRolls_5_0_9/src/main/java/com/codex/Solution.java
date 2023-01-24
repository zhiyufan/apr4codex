package com.codex;

import java.util.*;

public class Solution {
public class DiceRoller {
    public static int[] getDieRoll(int[] rolls, int mean, int n) {

            int[] res = new int[n];

            for (int i = 0; i < n; i++) {
                res[i] = mean;
            }
            return res;
    }

}
}