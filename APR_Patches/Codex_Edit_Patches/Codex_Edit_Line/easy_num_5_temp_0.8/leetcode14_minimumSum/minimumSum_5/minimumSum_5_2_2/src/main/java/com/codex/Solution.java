package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Solution {
    public static Map<Integer, List<Integer>> player1 = new HashMap<>();
    public static Map<Integer, List<Integer>> player2 = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //num of rounds
        int m = in.nextInt(); //num of players

        String players[] = new String[m];
        for (int i = 0; i < m; i++) {
            players[i] = in.next();
        }

        int[] k = new int[n]; //num of moves p1 can do
        for (int i = 0; i < n; i++) {
            k[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int numMoves = k[i];
            for (int j = 0; j < numMoves; j++) {
                int temp = in.nextInt(); //move
                String player = in.next(); //name
                int playerInt = Arrays.asList(players).indexOf(player);
                if (j % 2 == 0) { //player 1
                    addValue(temp, playerInt, player1);
                } else { //player 2
                    addValue(temp, playerInt, player2);
                }
            }
        }

        int win = 0;
        int round = 0;
        for (int i = 0; i < n; i++) {
            int num1 = player1.get(i).size();
            int num2 = player2.get(i).size();
            int tempRound = 0;
            if (num1 > num2) {
                tempRound = num1 - num2;
                win++;
            } else {
                tempRound = num2 - num1;
            }
            if (tempRound > round) {
                round = tempRound;
            }
        }

        System.out.println(win + " " + round);
    }


    public static void addValue(int key, int value, Map<Integer, List<Integer>> player) {
        List<Integer> temp = new ArrayList<>();
        if (player.containsKey(key)) {
            temp = player.get(key);
            temp.add(value);
            player.put(key, temp);
        } else {
            temp.add(value);
            player.put(key, temp);
        }
    }
}
}