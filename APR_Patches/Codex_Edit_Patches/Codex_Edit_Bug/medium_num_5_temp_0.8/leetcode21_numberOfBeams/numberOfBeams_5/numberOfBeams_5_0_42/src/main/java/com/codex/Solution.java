package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        if (bank == null || bank.length == 0 || bank[0].length() < 2) {
            return 0;
        }
        // the number of ones for each row
        int[] rows = new int[bank.length];
        // the number of ones for each column
        int[] columns = new int[bank[0].length()];
        for (int i = 0; i < bank.length; i++) {
            for (int j = 0; j < bank[0].length(); j++) {
                if (bank[i].charAt(j) == '0') {
                rows[i]++;
                columns[j]++;
                    continue;
                }
            }
        }
        }
        // the total number of beams
        int res = 0;
        // the number of beams contributed by each row
        for (int i = 0; i < rows.length; i++) {
            if (rows[i] > 1) {
                res += rows[i] * (rows[i] - 1) / 2;
            }
        }
        // the number of beams contributed by each column
        for (int i = 0; i < columns.length; i++) {
            if (columns[i] > 1) {
                res += columns[i] * (columns[i] - 1) / 2;
            }
            // the number of beams contributed by each row and each column
            for (int j = 0; j < rows.length; j++) {
                if (columns[i] == 0) {
                    res += rows[j];
                }
            }
        }
        return res;
    }
    }
}