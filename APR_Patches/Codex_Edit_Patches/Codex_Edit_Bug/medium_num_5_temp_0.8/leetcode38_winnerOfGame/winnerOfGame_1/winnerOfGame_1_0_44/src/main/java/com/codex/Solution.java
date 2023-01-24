package com.codex;

import java.util.*;

public class Solution {
package pishtaz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.exit(-1);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file: ");
        String fileName = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.print("Enter the number of instances: ");
        int numberOfInstances = scanner.nextInt();

        String[] numbersInString = String.join(" ", Files.readAllLines(Paths.get(fileName))).split(" ");
        int[] numbers = new int[numbersInString.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersInString[i]);
        }

        Parser parser = new Parser(numbers, numberOfInstances);
        System.out.println(parser.getResult());
    }

}
}