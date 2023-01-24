package com.codex;

import java.util.*;

public class Solution {
    public String solution(String s) {
        String string_number = s;
        String answer = "";
        if (!s.equals("")) {
            String temp = "";
            for (int i = 0; i < string_number.length(); i++) {
                temp += string_number.charAt(i);
                if (string_number.charAt(i) != ' ')
            String[] array_number = temp.split(" ");
            String[] array_alphabet = new String[array_number.length];
            for (int i = 0; i < array_number.length; i++) {
                array_alphabet[i] = convertToAlphabet(Integer.parseInt(array_number[i]));
            }
            for (int i = 0; i < array_alphabet.length; i++) {
                if (i == 0)
                    answer += array_alphabet[i];
                else
                    answer += array_alphabet[i].substring(array_alphabet[i].length() - 1);
            }
        } else
            answer = "";
        return answer;
                    temp += " ";
            }
        }
    
    public String convertToAlphabet(int number) {
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remainder = number % 27;
            if (remainder == 0)
                remainder = 26;
            number /= 27;
            result.append((char) ((remainder - 1) + '`'));
        }
        return result.reverse().toString();
    }
}