package com.codex;

import java.util.*;

public class Solution {
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprueba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 12
 */
public class LeerArchivoTexto {

    public static void main(String[] args) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("c:/users/12/desktop/archivo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            int[] array;
            List <Integer> list = new ArrayList<>();
            int capacity = 0;
            while ((linea = br.readLine()) != null) {
                String[] arrayString = linea.split(" ");
                array = new int[arrayString.length];
                for (int i = 0; i < arrayString.length; i++) {
                    try {
                        array[i] = Integer.parseInt(arrayString[i]);
                    } catch (NumberFormatException nfe) {
                        System.out.println("There is a non-numeric value.");
                    }
                }
                
                capacity = array[array.length-1];

                for (int i = 0; i < array.length; i++) {
                    if (array[i] != capacity) {
                        list.add(array[i]);
                    }
                }

                int[] arrayInt = list.stream().mapToInt(i -> i).toArray();
                System.out.println(wateringPlants(arrayInt, capacity));
                
                list.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("----------------------------------");

    }

    public static int wateringPlants(int[] plants, int capacity) {


        int steps = 0;
        int curCap = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (curCap < plants[i]) {
                curCap = capacity;
                steps++;
            }

            curCap -= plants[i];
            steps++;

            if (i + 1 < plants.length) {
                if (curCap < plants[i + 1]) {
                    curCap = capacity;
                    steps++;
                }
            }
        }

        return steps;
    }

}
}