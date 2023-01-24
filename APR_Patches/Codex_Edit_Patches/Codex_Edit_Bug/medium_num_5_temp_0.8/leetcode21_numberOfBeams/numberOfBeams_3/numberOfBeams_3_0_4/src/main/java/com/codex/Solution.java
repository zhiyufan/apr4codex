package com.codex;

import java.util.*;

public class Solution {
 public static int numberOfBeams(String[] bank) {

        int count = 0;

        for (int i = 0; i < bank.length - 1; i++) {

            char[] first = bank[i].toCharArray();
            int j = i + 1;

            while (j < bank.length) {

                char[] second = bank[j].toCharArray();

                for (int k = 0; k < first.length; k++) {

                    if (first[k] == '1' && second[k] == '1') {
                        int rowIndex = i + 1;
                        while (rowIndex < j) {

                            if (bank[rowIndex].charAt(k) == '1') {
                                break;
                            }
                            rowIndex++;

                        }
                        if (rowIndex == j) {
                            count++;
                        }
                        }
                    }
                }
            }

        }
        return count;
    }
}