package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int addRungs(List<Integer> rungs, int dist) {

        int count = 1;
        int max = rungs.get(0);
        for (int i = 1; i < rungs.size(); i++) {
            if (rungs.get(i) > max + dist) {
                count++;
                if (rungs.get(i) - max > dist) {
                    max = max + dist;
                } else {
                    max = rungs.get(i);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            String[] line2Arr = input.split(" ");
            String[] numberArr = scanner.nextLine().split(" ");
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < numberArr.length; j++) {
                list.add(Integer.parseInt(numberArr[j]));
            }

            System.out.println(addRungs(list, Integer.parseInt(line2Arr[1])));
        }
    }
}
}