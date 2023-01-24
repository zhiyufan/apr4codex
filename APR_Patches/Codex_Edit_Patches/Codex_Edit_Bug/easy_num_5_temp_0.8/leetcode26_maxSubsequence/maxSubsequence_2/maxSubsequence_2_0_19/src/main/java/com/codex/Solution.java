package com.codex;

import java.util.*;

public class Solution {
public static void main(String[] args) {
        String[] lines = new String[]{"bob alice", "alice adam", "adam bob"};
        String[][] pairs = new String[3][2];
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            String[] strs = line.split(" ");
            pairs[i][0] = strs[0];
            pairs[i][1] = strs[1];
        }
        List<String> list = new ArrayList<>();
        for (String[] pair : pairs) {
            for (String str : pair) {
                list.add(str);
            }
        }
        return res;
    }


    
}