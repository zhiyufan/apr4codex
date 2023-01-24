package com.codex;

import java.util.*;

public class Solution {
package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            BibliotecaApp bibliotecaApp = new BibliotecaApp(input);
            bibliotecaApp.startApplication();
        } catch (Exception e) {
            System.out.println("Please enter a valid integer");
        }
    }
}
}