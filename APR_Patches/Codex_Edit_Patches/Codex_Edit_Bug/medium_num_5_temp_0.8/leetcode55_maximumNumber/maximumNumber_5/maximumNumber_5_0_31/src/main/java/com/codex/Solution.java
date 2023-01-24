package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change){
        

        StringBuilder maximumNumber = new StringBuilder(num);
        int[] frequencies = new int[10];

        for (int i = 0; i < num.length(); i++) {
            frequencies[num.charAt(i) - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequencies[i] > 0) {
                frequencies[i]--;
                StringBuilder temp = new StringBuilder();
                for (int j = 9; j >= 0; j--) {
                    while (frequencies[j] > 0) {
                        temp.append(j);
                        frequencies[j]--;
                    }
                }

                frequencies[i]++;
                maximumNumber = temp.append(i).length() > maximumNumber.length() ? temp.append(i) : maximumNumber;
            }
        }

        return maximumNumber.toString();
    }

    
}