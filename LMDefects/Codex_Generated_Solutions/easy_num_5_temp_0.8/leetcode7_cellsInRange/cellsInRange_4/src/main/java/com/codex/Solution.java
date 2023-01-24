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
        String[] strings = s.split(":");
        String start = strings[0]; String end = strings[1];
        int startCol = convertCol(start.charAt(0));
        int startRow = convertRow(start.substring(1));
        int endCol = convertCol(end.charAt(0));
        int endRow = convertRow(end.substring(1));
        List<String> res = new ArrayList<>();
        for (int i = startCol; i <= endCol; i++) {
            for (int j = startRow; j <= endRow; j++) {
                res.add(convertCol(i) + convertRow(j));
            }
        }
        return res;
    }

    private static int convertCol(char c) {
        return (c - 'A' + 1);
    }

    private static int convertCol(int c) {
        return c + 'A' - 1;
    }

    private static int convertRow(String s) {
        return Integer.parseInt(s);
    }

    private static String convertRow(int r) {
        return Integer.toString(r);
    }
}}