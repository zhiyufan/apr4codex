package com.codex;

import java.util.*;

public class Solution {
public class Main {

    public static void main(String[] args) {
        
        String[] bank = new String[] {"1011011", "1011101", "1110110", "1110101", "1101011", "1010111"};

        int beams = numberOfBeams(bank);
        System.out.println(beams);
    }


    public static int numberOfBeams(String[] bank) {
        
        int numBeams = 0;


		for (int i = 0; i < bank.length; i++) {
			String first = bank[i];
			for (int j = 0; j < bank[i].length(); j++) {
				if (first.charAt(j) == '1') {
					for (int k = i + 1; k < bank.length; k++) {
						String second = bank[k];
						boolean noDevices = true;
						for (int l = 0; l < bank[k].length(); l++) {
							if (second.charAt(l) == '1') {
								for (int m = i + 1; m < k; m++) {
									String third = bank[m];
									if (third.charAt(l) == '1') {
										noDevices = false;
										break;
									}
								}
								if (noDevices) {
									numBeams++;
								}
							}
						}
					}
				}
			}
		}
		return numBeams;
    }

}



}