package com.codex;

import java.util.*;

public class Solution {
 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        int pos;
        

        for (int i = 0; i < 5; i++) {
            numbers[i] = scan.nextInt();
        }
        
        int result = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            result += numbers[i];
        }
        System.out.println(result);
        scan.close();
    }

}
}