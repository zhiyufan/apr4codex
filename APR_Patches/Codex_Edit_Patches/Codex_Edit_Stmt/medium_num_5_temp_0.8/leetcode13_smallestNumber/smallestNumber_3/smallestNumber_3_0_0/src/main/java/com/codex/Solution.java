package com.codex;

import java.util.*;

public class Solution {
public static long smallestNumber(long num) {
    
    List<Integer> list = new ArrayList<>();
    while (num != 0) {
        list.add((int) num % 10);
        num /= 10;
    }
    list.sort(Integer::compareTo);
    long answer = 0;
    for (int i = 0; i < list.size(); i++) {
        answer += list.get(i) * Math.pow(10, i);
    }
    return answer;
}

class User {
    private String name;
    private int age;
    private String city;

    public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public static int compareByAge(User u1, User u2) {
        return u1.age - u2.age;
    }

    public static int compareByName(User u1, User u2) {
        return u1.name.compareTo(u2.name);
    }

    public static int compareByCity(User u1, User u2) {
        return u1.city.compareTo(u2.city);
    }

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("Anna", 34, "Moscow"));
        list.add(new User("John", 18, "Minsk"));
        list.add(new User("Den", 28, "Kiev"));
        list.add(new User("Ivan", 22, "Minsk"));

        Collections.sort(list, User::compareByName);

        for (User u : list) {
            System.out.println(u.getName());
        }
    }

}
}