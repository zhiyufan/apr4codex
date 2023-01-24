package com.codex;

import java.util.*;

public class Solution {
/*
You are designing a new security system for a server room. In this room, there are racks that hold servers. Each rack has a number of shelves, each of which holds a number of servers. To maximize the number of servers that can fit in this room, you have decided to 
lay out the servers diagonally. So, servers that are on the same diagonal line can be placed directly on top of each other. 

As a result, some servers will not be reachable directly with a laser beam, meaning that if you turn on one of these servers, the laser will not hit it directly. To make sure that you can turn on any server, you have decided to build a number of mirrors. A mirror is a piece of 
equipment that can be positioned within the rack, so that a laser beam will hit the server that was behind the mirror. 

However, setting up the system is a non-trivial task. You have to determine how many mirrors you need to build, in order to make all of the servers reachable. Since you are very busy with other tasks, you have asked for your friend's help. Your friend has completed most of the 
work, but could not finish it. Complete the function numberOfBeams(), which takes in a String[] bank that describes the server room layout, and returns the required number of mirrors.

The character '0' denotes a server, the character '1' denotes a mirror, and the character '-' denotes an empty location. 

*/


    public static int numberOfBeams(String[] bank) {

        int numBeams = 0;
        int numRacks = bank.length;
        int numShelves = bank[0].length();

        if (numRacks == 1) {
            return 0;
        }
        
        for (int i = 0; i < numRacks; i++) {
            for (int j = 0; j < numShelves; j++) {
                if (bank[i].charAt(j) == '0') {
                    // check if i+1 is within boundaries
                    if (i + 1 < numRacks) {
                        // check if there is a shelf within the next racks where a mirror can be placed
                        for (int k = 0; k < numShelves; k++) {
                            int m = i;
                            int n = k;
                            boolean noDevices = true;
                            while (m < numRacks && n < numShelves) {
                                if (bank[m].charAt(n) == '0') {
                                    noDevices = false;
                                    break;
                                }
                                m++;
                                n++;
                            }
                            if (noDevices) {
                                if (bank[i + 1].charAt(k) == '1') {
                                    numBeams++;
                                }
                            }
                        }
                    }
                }
            }

        }
        return numBeams;
    }


    
}