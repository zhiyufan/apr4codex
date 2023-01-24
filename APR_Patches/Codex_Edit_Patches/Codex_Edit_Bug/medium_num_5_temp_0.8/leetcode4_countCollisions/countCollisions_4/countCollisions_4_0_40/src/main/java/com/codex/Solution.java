package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {


    public static int countCollisions(char[] directions) {
        int totalCollision = 0;
        
        ArrayList<Character> dirs = new ArrayList<>(Arrays.asList(directions));

        
        for (int i = 0; i < dirs.size(); i++) {
            for (int j = i + 1; j < dirs.size(); j++) {
                if (dirs.get(i) != 'S' && dirs.get(j) != 'S') {
                    dirs.set(i, 'S');
                    dirs.set(j, 'S');
                    totalCollision += 2;
                    break;
                } else if (dirs.get(i) != 'S' | dirs.get(j) != 'S') {
                    dirs.set(i, 'S');
                    dirs.set(j, 'S');
                    totalCollision += 1;
                    break;
                } else if (dirs.get(i) == 'N' && dirs.get(j) == 'N') {
                    dirs.set(i, 'S');
                    dirs.set(j, 'S');
                    totalCollision += 2;
                    break;
                } else if ((dirs.get(i) == 'N' && dirs.get(j) == 'W') ||
                        ((dirs.get(i) == 'W' && dirs.get(j) == 'N'))) {
                    if (!dirs.contains('E')) {
                        for (int k = 0; k < dirs.size(); k++) {
                            if (dirs.get(k) != 'S') {
                                dirs.set(k, 'S');
                                totalCollision += 1;
                                break;
                            }
                        }
                        for (int k = 0; k < dirs.size(); k++) {
                            if (dirs.get(k) != 'S') {
                                dirs.set(k, 'S');
                                totalCollision += 1;
                            }
                        }
                        break;
                    }
                } else if ((dirs.get(i) == 'S' && dirs.get(j) == 'N') ||
                        ((dirs.get(i) == 'N' && dirs.get(j) == 'S'))) {
                    if (!dirs.contains('W')) {
                        for (int k = 0; k < dirs.size(); k++) {
                            if (dirs.get(k) != 'S') {
                                dirs.set(k, 'S');
                                totalCollision += 1;
                            }
                        }
                    }
                    break;
                } else if ((dirs.get(i) == 'N' && dirs.get(j) == 'E') ||
                        ((dirs.get(i) == 'E' && dirs.get(j) == 'N'))) {
                    if (!dirs.contains('W')) {
                        for (int k = 0; k < dirs.size(); k++) {
                            if (dirs.get(k) != 'S') {
                                dirs.set(k, 'S');
                                totalCollision += 1;
                            }
                        }
                    }
                    break;
                } else if ((dirs.get(i) == 'W' && dirs.get(j) == 'S') ||
                        ((dirs.get(i) == 'S' && dirs.get(j) == 'W'))) {
                    if (!dirs.contains('E')) {
                        for (int k = 0; k < dirs.size(); k++) {
                            if (dirs.get(k) != 'S') {
                                dirs.set(k, 'S');
                                totalCollision += 1;
                            }
                        }
                    }
                    break;
                } else if ((dirs.get(i) == 'S' && dirs.get(j) == 'E') ||
                        ((dirs.get(i) == 'E' && dirs.get(j) == 'S'))) {
                    if (!dirs.contains('W')) {
                        for (int k = 0; k < dirs.size(); k++) {
                            if (dirs.get(k) != 'S') {
                                dirs.set(k, 'S');
                                totalCollision += 1;
                            }
                        }
                    }
                    break;
                } else if ((dirs.get(i) == 'E' && dirs.get(j) == 'W') ||
                        ((dirs.get(i) == 'W' && dirs.get(j) == 'E'))) {
                    if (!dirs.contains('S')) {
                        for (int k = 0; k < dirs.size(); k++) {
                            if (dirs.get(k) != 'S') {
                                dirs.set(k, 'S');
                                totalCollision += 1;
                            }
                        }
                    }
                    break;
                } else if ((dirs.get(i) == 'W' && dirs.get(j) == 'E') ||
                        ((dirs.get(i) == 'E' && dirs.get(j) == 'W'))) {
                    if (!dirs.contains('N')) {
                        for (int k = 0; k < dirs.size(); k++) {
                            if (dirs.get(k) != 'S') {
                                dirs.set(k, 'S');
                                totalCollision += 1;
                            }
                        }
                    }
                    break;
                } else if ((dirs.get(i) == 'E' && dirs.get(j) == 'S') ||
                        ((dirs.get(i) == 'S' && dirs.get(j) == 'E'))) {
                    if (!dirs.contains('W')) {
                        for (int k = 0; k < dirs.size(); k++) {
                            if (dirs.get(k) != 'S') {
                                dirs.set(k, 'S');
                                totalCollision += 1;
                            }
                        }
                    }
                    break;
                } else if ((dirs.get(i) == 'S' && dirs.get(j) == 'W') ||
                        ((dirs.get(i) == 'W' && dirs.get(j) == 'S'))) {
                    if (!dirs.contains('N')) {
                        for (int k = 0; k < dirs.size(); k++) {
                            if (dirs.get(k) != 'S')
                    break;
                }
            }
        }

        return totalCollision;
    }

    
}