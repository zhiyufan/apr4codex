package com.codex;

import java.util.*;

public class Solution {
public class HelloWorld {
    
    static class Friend {
        public Friend(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String name;
        int age;
    }
    public static void main(String []args){
        Friend friend1 = new Friend("Jenny", 20);
        Friend friend2 = new Friend("Jenny", 20);
        Friend friend3 = friend2;
        Friend friend4 = new Friend("Amit", 21);
        
        System.out.println(friend1 == friend2);
        System.out.println(friend1.equals(friend2));
        System.out.println(friend2 == friend3);
        System.out.println(friend3.equals(friend2));
        System.out.println(friend2.equals(friend4));

    }
}
}