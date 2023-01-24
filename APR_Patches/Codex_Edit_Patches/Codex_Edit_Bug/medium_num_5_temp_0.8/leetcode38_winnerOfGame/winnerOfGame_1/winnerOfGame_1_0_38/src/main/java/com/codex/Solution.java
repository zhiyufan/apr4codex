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


public int[] nextPermutation(int[] num) {
        
        if (num.length < 2) {
            return num; 
        }
        int i;
        
        for (i = num.length - 2; i >= 0; i--) {
            if (num[i] < num[i + 1]) {
                break;
            }
        }
        
        if (i < 0) {
            Arrays.sort(num);
            return num;
        } else {
            for (int j = num.length - 1; j > i; j--) {
                if (num[j] > num[i]) {
                    swap(num, i, j);
                    break;
                }
            }
        }
        
        reverse(num, i + 1, num.length - 1);
        
        return num;
        
    }
    
    public void swap(int[] num, int i, int j) {
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
    
    public void reverse(int[] num, int left, int right) {
        while (left < right) {
            swap(num, left, right);
            left++;
            right--;
        }
    }
    
}