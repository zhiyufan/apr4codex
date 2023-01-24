package com.codex;

import java.util.*;

public class Solution {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] array = new String[string.length()];
        for (int i = 0; i < string.length(); i++){
            array[i] = Character.toString(string.charAt(i));
        }
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < string.length(); j++){
            if (array[j].equals("a")) a++;
            if (array[j].equals("e")) e++;
            if (array[j].equals("i")) i++;
            if (array[j].equals("o")) o++;
            if (array[j].equals("u")) u++;
        }
        int[] freq = {a, e, i, o, u};
        int count = 0;
        for (int j = 0; j < 5; j++){
            if (freq[j] == 0)
                count++;
        }
        System.out.println(count);
    }   
}