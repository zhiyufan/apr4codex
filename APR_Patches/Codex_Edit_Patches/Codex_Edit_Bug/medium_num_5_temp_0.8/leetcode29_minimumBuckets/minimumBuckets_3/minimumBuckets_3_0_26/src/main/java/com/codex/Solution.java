package com.codex;

import java.util.*;

public class Solution {
    import java.io.*; 
    class Dog{ 
        String name;
        
        public Dog(String name){
            this.name = name;
        }
    }
    public class Animal { 
          
        public static void main(String[] args) 
        { 
            // Create an instance of Dog 
            Dog dog = new Dog("Greef"); 
              
            // Pass the instance to a method 
            Animal.printName(dog); 
        } 
          
        // Method with a Dog parameter 
        public static void printName(Dog dog) 
        { 
            // Let's access the name now 
            System.out.println(dog.name); 
        } 
    } 


    /*


    public static int minimumBuckets(String street) {
        

        char[] streetCharArr = street.toCharArray();
        int count = 0;
        for (int i = 0; i < streetCharArr.length; i++) {
            if (streetCharArr[i] == 'H') {
                if (i - 1 >= 0) {
                    if (streetCharArr[i - 1] == '.') {
                        streetCharArr[i - 1] = 'B';
                        count++;
                    }
                }
                if (i + 1 < streetCharArr.length) {
                    if (streetCharArr[i + 1] == '.') {
                        streetCharArr[i + 1] = 'B';
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
}