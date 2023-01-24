package com.codex;

import java.util.*;

public class Solution {
    public static int hero(int[] experiencePoints, int[] minimalExperience) {
        

        int result = 0;
        for (int exp : experiencePoints) {
            result += exp < minimalExperience[1] ? 0 : exp < minimalExperience[0] ? 1 : 2;
        }
        return result;
    }

}