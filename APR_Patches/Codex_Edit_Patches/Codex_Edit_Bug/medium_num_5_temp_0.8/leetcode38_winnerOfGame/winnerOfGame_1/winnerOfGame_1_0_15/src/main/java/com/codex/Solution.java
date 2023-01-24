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
                } else if (i == 0){
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

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] players = {"Kawhi Leonard", "LeBron James", "Stephen Curry", "James Harden", "Kevin Durant"};
        int[] scores = {10, 2, 5, 2, 10};
        boolean isOnTheTeam = false;
        System.out.println("Welcome to our Basketball team!");
        System.out.println("Please enter a player's name");
        String playerName = scanner.next();
        for (int i = 0; i < players.length; i++) {
            if (playerName.equals(players[i])) {
                isOnTheTeam = true;
                break;
            }
        }
        if (isOnTheTeam) {
            System.out.println("The player is on the team!");
        } else {
            System.out.println("The player is not on the team!");
        }
    }
}*/
}