package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += (s.charAt(i) - 'a' + 1);
        }
        

        for (int i = 0; i < k; i++) {
            int temp = 0;
            while (result > 0) {
                temp += result % 10;
                result /= 10;
            }
            result = temp;
        }
        return result;
    }

    
}