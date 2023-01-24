package com.codex;

import java.util.*;

public class Solution {
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        sc.nextLine();

        while (cases > 0) {
            int num = sc.nextInt();
            sc.nextLine();
            String[] bank = new String[num];
            for (int i = 0; i < num; i++) {
                bank[i] = sc.nextLine();
            }

            System.out.println(numberOfBeams(bank));
            cases--;
        }

        sc.close();
    }

    public static int numberOfBeams(String[] bank) {

        int numBeams = 0;

        for (int i = 0; i < bank.length; i++) {
            for (int j = 0; j < bank[i].length(); j++) {

                if (bank[i].charAt(j) == '1') {
                    for (int k = i + 1; k < bank.length; k++) {
                        boolean noDevices = true;
                        for (int l = 0; l < bank[k].length(); l++) {
                            if (bank[k].charAt(l) == '1') {
                                    for (int m = i + 1; m < k; m++) {
                                        if (bank[m].charAt(l) == '1') {
                                            noDevices = false;
                                            break;
                                        }
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