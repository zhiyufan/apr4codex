package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfBeams(String[] bank) {
        /** Anti-theft security devices are activated inside a bank. You are given a 0-indexed binary string array bank representing the floor plan of the bank, which is an m x n 2D matrix. bank[i] represents the ith row, consisting of '0's and '1's. '0' means the cell is empty, while'1' means the cell has a security device.
         * There is one laser beam between any two security devices if both conditions are met:
         * The two devices are located on two different rows: r1 and r2, where r1 < r2.
         * For each row i where r1 < i < r2, there are no security devices in the ith row.
         * Laser beams are independent, i.e., one beam does not interfere nor join with another.
         * Return the total number of laser beams in the bank.
         */
        int length = bank.length;
        int width = bank[0].length();
        int result = 0;
        char[][] arr = new char[length][width];
        boolean[][] check = new boolean[length][width];
        for (int i = 0; i < length; i++) {
            arr[i] = bank[i].toCharArray();
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (arr[i][j] == '1' && !check[i][j]) {
                    check[i][j] = true;
                    result += breadthFirstSearch(i, j, arr, check);
                }
            }
        }
        return result;
    }

    private static int breadthFirstSearch(int a, int b, char[][] arr, boolean[][] check) {
        int length = arr.length;
        int width = arr[0].length;
        int result = 0;
        Point tempPoint = new Point(a, b);
        Queue<Point> queue = new LinkedList<>();
        HashMap<Point, Integer> map = new HashMap<>();
        Point startPoint = new Point(0, b);
        queue.offer(startPoint);
        map.put(startPoint, 1);
        for (int i = 1; i < length; i++) {
            if (arr[i][b] == '1') {
                queue.offer(tempPoint);
                map.put(tempPoint, 1);
            }
        }
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            check[point.x][point.y] = true;
            if (arr[point.x][point.y] == '1') {
                result += map.get(point);
                if (map.containsKey(new Point(point.x - 1, point.y))) {
                    if (!check[point.x - 1][point.y]) {
                        queue.offer(new Point(point.x - 1, point.y));
                        check[point.x - 1][point.y] = true;
                    }
                    map.put(new Point(point.x - 1, point.y), map.get(new Point(point.x - 1, point.y)) + 1);
                } else {
                    map.put(new Point(point.x - 1, point.y), 1);
                    if (!check[point.x - 1][point.y]) {
                        queue.offer(new Point(point.x - 1, point.y));
                        check[point.x - 1][point.y] = true;
                    }
                }
                if (map.containsKey(new Point(point.x + 1, point.y))) {
                    if (!check[point.x + 1][point.y]) {
                        queue.offer(new Point(point.x + 1, point.y));
                        check[point.x + 1][point.y] = true;
                    }
                    map.put(new Point(point.x + 1, point.y), map.get(new Point(point.x + 1, point.y)) + 1);
                } else {
                    map.put(new Point(point.x + 1, point.y), 1);
                    if (!check[point.x + 1][point.y]) {
                        queue.offer(new Point(point.x + 1, point.y));
                        check[point.x + 1][point.y] = true;
                    }
                }
                if (map.containsKey(new Point(point.x, point.y - 1))) {
                    if (!check[point.x][point.y - 1]) {
                        queue.offer(new Point(point.x, point.y - 1));
                        check[point.x][point.y - 1] = true;
                    }
                    map.put(new Point(point.x, point.y - 1), map.get(new Point(point.x, point.y - 1)) + 1);
                } else {
                    map.put(new Point(point.x, point.y - 1), 1);
                    if (!check[point.x][point.y - 1]) {
                        queue.offer(new Point(point}