package com.codex;

import java.util.*;

public class Solution {
    public static int minBitFlips(int start, int goal) {
        
        int count = 0;
        int i = 0;
        while (start != goal) {
            if ((start & 1) != (goal & 1)) {
                count++;
                if (i > 0 && start == (goal ^ (1 << i))) {
                    return -1;
                }
                start ^= 1 << i;
            }
            start >>= 1;
            goal >>= 1;
            i++;
        }
        return count;
    }
    //Problem 2
    public class MyClass {

    int data = 50;
     
    public void change(int data) {
        data = data+100;
        System.out.println("Inside value of data is " + data);
    }

    public static void main(String args[]) {
        MyClass obj = new MyClass();
        System.out.println("Before change, value of data is " + obj.data);
        obj.change(500);
        System.out.println("After change, value of data is " + obj.data);
    }

}



    
}