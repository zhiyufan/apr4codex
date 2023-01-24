package com.codex;

import java.util.*;

public class Solution {
    public static List<String> cellsInRange(String s) {
        /** A cell (r, c) of an excel sheet is represented as a string "<col><row>" where:
         * <col> denotes the column number c of the cell. It is represented by alphabetical letters.
         * For example, the 1st column is denoted by 'A', the 2nd by 'B', the 3rd by 'C', and so on.
         * <row> is the row number r of the cell. The rth row is represented by the integer r.
         * You are given a string s in the format "<col1><row1>:<col2><row2>", where <col1> represents the column c1, <row1> represents the row r1, <col2> represents the column c2, and <row2> represents the row r2, such that r1 <= r2 and c1 <= c2.
         * Return the list of cells (x, y) such that r1 <= x <= r2 and c1 <= y <= c2. The cells should be represented as strings in the format mentioned above and be sorted in non-decreasing order first by columns and then by rows.
         */
        List<String> res = new ArrayList<>();
        int c1 = s.charAt(0) - 'A';
        int c2 = s.charAt(s.length() - 1) - 'A';
        int r1 = Integer.parseInt(String.valueOf(s.charAt(1)));
        int r2 = Integer.parseInt(String.valueOf(s.charAt(s.length() - 2)));
        for (int r = r1; r <= r2; r++) {
            for (int c = c1; c <= c2; c++) {
                StringBuilder sb = new StringBuilder();
                sb.append((char)(c + 'A'));
                sb.append(r);
                res.add(sb.toString());
            }
        }
        return res;
    }

    }