package com.codex;

import java.util.*;

public class Solution {
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * A simple program to simulate the game
 * @author Luis Zuluaga
 *
 */
public class GameOfOneFactorial {

	public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
        	int n = Integer.parseInt(br.readLine());
        	System.out.println("Minimum moves to win: " + minMoves(n, 1));
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
	
	/**
	 * Calculate the minimum number of moves to win the game
	 * @param target
	 * @param maxDoubles
	 * @return
	 */
	public static int minMoves(int target, int maxDoubles) {
        
        int moves = 0;
        boolean tookDouble = false;
        while (target > 0) {
        	boolean canTakeDouble = target % 2 == 0 && maxDoubles > 0;
        	if (!tookDouble && canTakeDouble) {
                target /= 2;                
            }
            moves++;
        }
        return moves;
    }

    
}