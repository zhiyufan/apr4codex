package com.codex;

import java.util.*;

public class Solution {
 * You've been invited to play a game of Dungeons & Dragons. In the game you're 
 * rolling (virtual) dice to generate numbers. The game is played with n dice.
 * 
 * Each die has 6 faces with numbers from 1 to 6, so the number you can get with a 
 * single die is an integer between 1 and 6 (both inclusive). The result of the 
 * roll is interpreted as the sum of numbers on each die's top face.
 * 
 * You've been playing the game for a while and the dungeon master decided to 
 * change the rules a little. Now after each roll you can rearrange the numbers on 
 * the dice. You can only rearrange the top face of each die, i.e. you can't 
 * change any number that is not currently on the top face of any die.
 * 
 * You and your friends have already rolled the dice and got some numbers a1, a2, 
 * ..., an but the dungeon master took some dice away and you don't know which 
 * ones. Your task is to determine the minimum and the maximum possible sums of 
 * top faces of remaining dice.
 * 
 * Example
 * 
 *          For a = [1, 1, 1, 6, 6, 6], the output should be
 *          rearrangeDice(a) = [3, 18].
 *          When all 6 dice are rearranged to have their top faces show 1, the sum 
 *          of top faces will be 3. When all 6 dice are rearranged to have their 
 *          top faces show 6, the sum of top faces will be 18.
 * 
 *          For a = [1, 6, 2, 6, 2, 6], the output should be
 *          rearrangeDice(a) = [9, 12].
 *          There is only one way to rearrange the dice, so the sum of top faces 
 *          will be always equal to 9.
 * 
 *          Input/Output
 * 
 * [time limit] 3000ms (java)
 * [input] array.integer a
 * 
 * The array of integers. a[i] is the number on the top face of the i-th die after 
 * the roll.
 * Constraints:
 * 1 ≤ a.length ≤ 20,
 * 1 ≤ a[i] ≤ 6.
 * 
 * [output] array.integer
 * 
 * An array of two integers, where the first integer is the minimum possible sum 
 * of top faces of remaining dice and the second one is the maximum possible sum 
 * of top faces of remaining dice.
 * 
 * @author jorgecasariego
 *
 */

public class MissingRolls {

	public static int[] missingRolls(int[] rolls, int mean, int n) {
        
	    int sum = mean * (rolls.length + n);
	    for (int x : rolls) sum -= x;
	    if (sum % n != 0) return new int[]{};
	    else {
	        int avg = sum / n;
	        if (avg < 1 || avg > 6) return new int[]{};
	        else {
	            int[] res = new int[n];
	            Arrays.fill(res, avg);
	            return res;
	        }
	    }
	}
   
   
}

    
}