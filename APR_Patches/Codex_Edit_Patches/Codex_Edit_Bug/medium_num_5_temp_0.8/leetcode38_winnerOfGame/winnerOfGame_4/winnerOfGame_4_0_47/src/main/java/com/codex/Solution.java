package com.codex;

import java.util.*;

public class Solution {

    public static boolean isWinningPossibility(String inputString) {
        if (inputString.length() == 0) {
            return true;
        } else {
            char firstCharacter = inputString.charAt(0);
            if (firstCharacter == 'B') {
                return false;
            } else {
                int index = 0;
                while (index + 2 < inputString.length()) {
                    char secondCharacter = inputString.charAt(index + 1);
                    char thirdCharacter = inputString.charAt(index + 2);
                    if (firstCharacter == secondCharacter && secondCharacter == thirdCharacter) {
                        String nextString = inputString.substring(index + 2, inputString.length());
                        return isWinningPossibility(nextString);
                    } else {
                        index++;
                    }
                }
                return true;
            }
        }
    }

    public static int numberOfWaysToRemoveMarbles(String inputString) {
        if (inputString.length() == 0) {
            return 0;
        } else if (inputString.length() == 1) {
            return 1;
        }

            StringBuilder sb = new StringBuilder(inputString);
            int index = 0;
            while (index + 2 < sb.length()) {
                char start = sb.charAt(index);
                char mid = sb.charAt(index + 1);
                char end = sb.charAt(index + 2);
                if (start == mid && mid == end) {
                    sb.deleteCharAt(index + 1);
                    index++;
                    if (!isWinningPossibility(sb.toString())) {
                        sb.insert(index, 'B');
                        String newString = sb.toString();
                        int numberOfWays = numberOfWaysToRemoveMarbles(sb.toString());
                        return numberOfWays + 1;
                    }
                } else {
                    index++;
                }
            }
            if (!isWinningPossibility(sb.toString())) {
                int lastIndex = sb.length() - 1;
                sb.insert(lastIndex, 'B');
                return numberOfWaysToRemoveMarbles(sb.toString()) + 1;
            } else {
                return 0;
            }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isWinningPossibility(input)) {
            System.out.println(0);
        } else {
            System.out.println(numberOfWaysToRemoveMarbles(input));
        }
    }
        }
    }
}