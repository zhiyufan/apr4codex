package com.codex;

import java.util.*;

public class Solution {
interface Animal {
    default void eat() {
        System.out.println("Animal is eating");
    }

    default void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void breath();
}
interface Mammal {
    default void eat() {
        System.out.println("Mammal is eating");
    }
    default void sleep() {
        System.out.println("Mammal is sleeping");
    }
}

public class Interface implements Animal, Mammal {
    public void breath() {
        System.out.println("Breath");
    }
    
    public void eat() {
        System.out.println("Eating");
    }
    
    public void sleep() {
        System.out.println("Sleeping");
    }
    
    public static void main(String[] args) {
        Interface mammal = new Interface();
        mammal.eat();
        mammal.breath();
    }
}
    
}