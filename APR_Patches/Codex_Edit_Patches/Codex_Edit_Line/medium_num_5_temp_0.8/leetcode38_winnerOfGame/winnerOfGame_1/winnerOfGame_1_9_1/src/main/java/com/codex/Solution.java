package com.codex;

import java.util.*;

public class Solution {
public static boolean winnerOfGame(String colors) {

        int i = 0;
        int count = 0;
        while (i < colors.length()) {
            char currentColor = colors.charAt(i);
            if (currentColor == 'A') {
                if (i == colors.length() - 1) {
                    if (i == 1) {
                        if (colors.charAt(i) == colors.charAt(i - 1)) {
                            i -= 2;
                            count++;
                        } else {
                            i--;
                        }
                    } else {
                        if (colors.charAt(i) == colors.charAt(i - 1)) {
                            i -= 2;
                            count++;
                        } else {
                            i = 0;
                        }
                    }
                } else if (i == 0) {
                    if (i == colors.length() - 2) {
                        if (colors.charAt(i) == colors.charAt(i + 1)) {
                            i += 2;
                            count++;
                        } else {
                            i++;
                        }
                    } else {
                        if (colors.charAt(i) == colors.charAt(i + 1)) {
                            i += 2;
                            count++;
                        } else {
                            i = colors.length() - 1;
                        }
                    }
                } else {
                    if (colors.charAt(i) == colors.charAt(i - 1) || colors.charAt(i) == colors.charAt(i + 1)) {
                        if (colors.charAt(i) == colors.charAt(i - 1)) {
                            i -= 2;
                        } else {
                            i += 2;
                        }
                        count++;
                    } else {
                        if (i + 1 < colors.length()) {
                            if (colors.charAt(i + 1) == colors.charAt(i + 2)) {
                                i = i + 2;
                            } else {
                                i++;
                            }
                        } else {
                            if (colors.charAt(i - 1) == colors.charAt(i - 2)) {
                                i = i - 2;
                            } else {
                                i--;
                            }
                        }
                    }
                }
            } else {
                i++;
            }
        }
        if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }



=======
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Let's play a game");
        System.out.println("Choose the color of your first marble: ");
        String color1 = input.nextLine();
        System.out.println("Choose the color of your second marble: ");
        String color2 = input.nextLine();
        System.out.println("Choose the color of your third marble: ");
        String color3 = input.nextLine();
        System.out.println("Choose the color of your fourth marble: ");
        String color4 = input.nextLine();
        String color5 = input.nextLine();
        String color6 = input.nextLine();
        String color7 = input.nextLine();
        String color8 = input.nextLine();
        String color9 = input.nextLine();
        String color10 = input.nextLine();
        String color11 = input.nextLine();
        String color12 = input.nextLine();
        System.out.println("Here is your first row: " + color1 + " " + color2 + " " + color3 + " " + color4);
        System.out.println("Here is your second row: " + color5 + " " + color6 + " " + color7 + " " + color8);
        System.out.println("Here is your third row: " + color9 + " " + color10 + " " + color11 + " " + color12);
        System.out.println("Here is the game board");
        System.out.println(color1 + " " + color2 + " " + color3 + " " + color4);
        System.out.println(color5 + " " + color6 + " " + color7 + " " + color8);
        System.out.println(color9 + " " + color10 + " " + color11 + " " + color12);
        System.out.println("Choose the number of the marble you want to remove: ");
        Scanner number = new Scanner(System.in);
        String marble = number.nextLine();
        System.out.println("You have chosen the " + marble + " marble");
        System.out.println("What color is it?");
        String marbleColor = input.nextLine();
        System.out.println("You have chosen the " + marbleColor + " marble");
        System.out.println("What color would you like to replace it with?");
        String newColor = input.nextLine();
        System.out.println(marbleColor + " has been replaced with " + newColor);
    }
}
}