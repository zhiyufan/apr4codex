package com.codex;

import java.util.*;

public class Solution {
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task_1_1 {
    public static void main(String[] args) {
        int cs = 0;
        //File file = new File("/Users/steve/Desktop/test/test.txt");
        System.out.println("Hello, please enter the name of the file");
        Scanner sc = new Scanner(System.in);
        File file = new File(sc.next());
        try (Scanner scn = new Scanner(file)) {
            while (scn.hasNextLine()) {
                cs += countSentences(scn.nextLine());
            }
            System.out.println(cs);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }


    private static int countSentences(String str) {
        return str.split("[.!?:]+").length;
    }
}
}