package com.codex;

import java.util.*;

public class Solution {
    public void f() { // anonimnie wywoływana jest metoda z klasy zewnętrznej anonimowego obiektu
        System.out.print("a");
    }
    
    public void f() { // new MyClass().f();
        System.out.print("a2");
    }

    // jesli klasa nie musi byc publiczna, to można wstawić w definicję klasy : new MyClass().f(); 
    public static void main(String[] args) {
        // new MyClass().f(); 
        class MyClass {
            public void f() {
                System.out.print("a");
            }
        }
        new MyClass().f();
    }


    class MyClass {
        int x = 10;
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.x = 25; // set the value of x to 25
        System.out.println(myObj.x); // Outputs 25
    }

    class Car {
    }

    public class Main {
        public static void main(String[] args) {
            Car myObj = new Car();
            System.out.println(myObj.toString());
        }
    }

    public class Main {
        public static void main(String[] args) {
            Car myObj = new Car();
            System.out.println("HashCode for myObj: " + myObj.hashCode());
        }
    }


    // wskazanie na obiekt
    class Car {
        String model;
    }
    public class Main {
        public static void main(String[] args) {
            Car myObj = new Car();
            myObj.model = "Mustang";
            System.out.println(myObj.model);
        }
    }

    // przypisanie referencji do drugiej zmiennej
    class Car {
        String model;
    }
    public class Main {
        public static void main(String[] args) {
            Car myObj1 = new Car();
            myObj1.model = "Ford";

            Car myObj2 = new Car();
            myObj2.model = "BMW";

            myObj2 = myObj1; // myObj2 skierowana jest do tego samego obiektu co i myObj1

            System.out.println(myObj2.model); // Outputs "Ford"
        }
    }


    StringBuilder sb = new StringBuilder("Hello");
    StringBuilder sb1 = new StringBuilder("Hello");


    public static int[] rearrangeArray2(int[] nums) {


        ArrayList<Integer> notAverage = new ArrayList<>();
        ArrayList<Integer> average = new ArrayList<>();
        int[] newArray;
        double averageValue = 0;

        if (nums.length > 1) {
            for (int i = 1; i < nums.length - 1; i++) {
                averageValue = (nums[i - 1] + nums[i + 1]) / 2.0;
                if (nums[i] > averageValue) { // jeśli wartość jest wieksza to dodaj do notAverage
                    notAverage.add(nums[i]);
                } else if (nums[i] < averageValue) { // jeśli wartość jest mniejsza to dodaj do average
                    average.add(nums[i]);
                }
            }
        }

        newArray = new int[nums.length];

        for (int i = 1; i < nums.length - 1; i++) {
            if (i == nums.length - 1) {
                newArray[nums.length - 1] = nums[nums.length - 1];
            } else {
                if (notAverage.size() > 0) {
                    newArray[i] = notAverage.get(0);
                    notAverage.remove(0);
                } else if (average.size() > 0) {
                    newArray[i] = average.get(0);
                    average.remove(0);
                }
            }
        }

        return newArray;
    }

    static int[] sort(int[] nums) {
        int[] newArray = new int[nums.length];
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        int positiveIndex = 0;
        int negativeIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positives.add(nums[i]);
            } else {
                negatives.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (positives.size() > 0 && negativeIndex == 0) {
                newArray[i] = positives.get(0);
                positives.remove(0);
            } else if (negatives.size() > 0 && positiveIndex == 0) {
                newArray[i] = negatives.get(0);
                negatives.remove(0);
            } else if (positives.size() > 0 && negativeIndex > 0) {
                newArray[i] = positives.get(0);
                positives.remove(0);
            } else if (negatives.size() > 0 && positiveIndex > 0) {
                newArray[i] = negatives.get(0);
                negatives.remove(0);
            }

            if (newArray[i] >= 0) {
                positiveIndex = i;
            } else {
                negativeIndex = i;
            }
        }

        return newArray;
    }
}