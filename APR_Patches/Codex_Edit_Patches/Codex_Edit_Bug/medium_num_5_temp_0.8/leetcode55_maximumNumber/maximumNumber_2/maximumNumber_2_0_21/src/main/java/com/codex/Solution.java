package com.codex;

import java.util.*;

public class Solution {
    public static String maximumNumber(String num, int[] change) {
	
	//A= 65
	//a = 97
	// a-Z= 65-90
	// a-z = 97-122
        
        StringBuilder sb = new StringBuilder(num); //
        for (int i = 0; i < num.length(); i++) {  //
            int digit = num.charAt(i) - '0'; //
            sb.setCharAt(i, (char)(change[digit] + '0')); //
        } //
        return sb.toString(); //
    } //

    
}