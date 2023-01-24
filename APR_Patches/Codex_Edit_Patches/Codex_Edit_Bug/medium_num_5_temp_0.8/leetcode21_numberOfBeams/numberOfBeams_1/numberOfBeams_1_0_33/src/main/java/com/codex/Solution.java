package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        
        int beams = 0;
        for (int i = 0; i < bank.length; i++) {
            int num = Integer.parseInt(bank[i], 2);
            for (int j = 0; j < bank.length; j++) {
                int tmp = Integer.parseInt(bank[j], 2);
                if (i != j && (tmp & num) == 0) {
                    beams += Integer.bitCount(num);
                    break;
                }
            }
        }
        return beams;
    }

    public static String[] readMap(String file) {
        String[] map = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = bufferedReader.readLine();
            int length = Integer.parseInt(line);
            map = new String[length];
            for (int i = 0; i < length; i++) {
                map[i] = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}