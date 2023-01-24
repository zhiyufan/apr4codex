package com.codex;

import java.util.*;

public class Solution {
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Dell
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(maximumNumber("95", new int[]{0, 0, 0, 0, 0, 1}));
    }

    public static String maximumNumber(String num, int[] change) {

        int count = 0;
        char[] output = num.toCharArray();
        String max = String.valueOf(output);
        String min = num;
        int maxN = Integer.parseInt(max);
        int minN = Integer.parseInt(min);
        int n = change.length;
        int k = n;
        for (int i = 0; i < n - 1; i++) {
            if (change[i] == 1) {
                count++;
            }
        }
        if (count == n) {
            Arrays.sort(output, new Comparator<Character>() {
                @Override
                public int compare(Character c1, Character c2) {
                    int cmp = Character.compare(c2, c1);
                    return cmp;
                }
            });
            return String.valueOf(output);
        }
        for (int i = 0; i < n; i++) {
            if (change[i] == 1) {
                change[i] = 0;
                k--;
                String temp = String.valueOf(output);
                int tempN = Integer.parseInt(temp);
                if (tempN > maxN) {
                    maxN = tempN;
                    max = temp;
                }
                temp = maximumNumber(temp, change);
                tempN = Integer.parseInt(temp);
                if (tempN > maxN) {
                    maxN = tempN;
                    max = temp;
                }
                change[i] = 1;
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (change[i] == 1) {
                for (int j = i; j < change.length; j++) {
                    if (change[j] == 1) {
                        change[i] = 0;
                        change[j] = 0;
                        k = k - 2;
                        String temp = String.valueOf(output);
                        int tempN = Integer.parseInt(temp);
                        if (tempN > maxN) {
                            maxN = tempN;
                            max = temp;
                        }
                        temp = maximumNumber(temp, change);
                        tempN = Integer.parseInt(temp);
                        if (tempN > maxN) {
                            maxN = tempN;
                            max = temp;
                        }

                        change[i] = 1;
                        change[j] = 1;
                        k = k + 2;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (change[i] == 1 && k > 1) {
                for (int j = i; j < change.length; j++) {
                    if (change[j] == 1 && k > 1) {
                        for (int l = j; l < change.length; l++) {
                            if (change[l] == 1 && k > 1) {
                                change[i] = 0;
                                change[j] = 0;
                                change[l] = 0;
                                k = k - 3;
                                String temp = String.valueOf(output);
                                int tempN = Integer.parseInt(temp);
                                if (tempN > maxN) {
                                    maxN = tempN;
                                    max = temp;
                                }
                                temp = maximumNumber(temp, change);
                                tempN = Integer.parseInt(temp);
                                if (tempN > maxN) {
                                    maxN = tempN;
                                    max = temp;
                                }

                                change[i] = 1;
                                change[j] = 1;
                                change[l] = 1;
                                k=k+3;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (change[i] == 1 && k > 1) {
                for (int j = i; j < change.length; j++) {
                    if (change[j] == 1 && k > 1) {
                        for (int l = j; l < change.length; l++) {
                            if (change[l] == 1 && k > 1) {
                                for (int m = l; m < change.length; m++) {
                                    if (change[m] == 1 && k > 1) {
                                        change[i] = 0;
                                        change[j] = 0;
                                        change[l] = 0;
                                        change[m] = 0;
                                        k = k - 4;
                                        String temp = String.valueOf(output);
                                        int tempN = Integer.parseInt(temp);
                                        if (tempN > maxN) {
                                            maxN = tempN;
                                            max = temp;
                                        }
                                        temp = maximumNumber(temp, change);
                                        tempN = Integer.parseInt(temp);
                                        if (tempN > maxN) {
                                            maxN = tempN;
                                            max = temp;
                                        }

                                        change[i] = 1;
                                        change[j] = 1;
                                        change[l] = 1;
                                        change[m] = 1;
                                        k=k+4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return max;
    }

}

        
}