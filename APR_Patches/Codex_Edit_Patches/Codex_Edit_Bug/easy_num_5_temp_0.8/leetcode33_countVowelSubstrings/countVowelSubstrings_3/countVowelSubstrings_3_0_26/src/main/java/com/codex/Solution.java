package com.codex;

import java.util.*;

public class Solution {
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;

public class OptimalPaths{


    public int getMinCost(HashMap<String, Integer> airlineCosts, int stop){
        if (stop == 0){
            return airlineCosts.get("C2S");
        }

        int minCost = Integer.MAX_VALUE;
        int tempCost = 0;

        minCost = minCost<airlineCosts.get("C2S")?minCost:airlineCosts.get("C2S");
        if(stop>=1){
            tempCost = getMinCost(airlineCosts, stop-1)+airlineCosts.get("C2A")+airlineCosts.get("A2A");
            minCost = minCost<tempCost?minCost:tempCost;
        }
        if(stop>=2){
            tempCost = getMinCost(airlineCosts, stop-1)+airlineCosts.get("C2J")+airlineCosts.get("J2J");
            minCost = minCost<tempCost?minCost:tempCost;
        }
        if(stop>=3){
            tempCost = getMinCost(airlineCosts, stop-1)+airlineCosts.get("C2A")+airlineCosts.get("A2A")*2;
            minCost = minCost<tempCost?minCost:tempCost;
        }
        if(stop>=4){
            tempCost = getMinCost(airlineCosts, stop-1)+airlineCosts.get("C2J")+airlineCosts.get("J2J")*2;
            minCost = minCost<tempCost?minCost:tempCost;
        }

        return minCost;
    }

    public int getScheduledStops(HashMap<String, Integer> airlineCosts, int stop){
        if (stop == 0){
            return 0;
        }

        int minCost = Integer.MAX_VALUE;
        int tempCost = 0;
        int selectedStops = Integer.MAX_VALUE;

        minCost = minCost<airlineCosts.get("C2S")?minCost:airlineCosts.get("C2S");
        if(stop>=1){
            tempCost = getMinCost(airlineCosts, stop-1)+airlineCosts.get("C2A")+airlineCosts.get("A2A");
            if(minCost>tempCost){
                minCost = tempCost;
            }
            selectedStops = getScheduledStops(airlineCosts, stop-1)+1;
        }
        if(stop>=2){
            tempCost = getMinCost(airlineCosts, stop-1)+airlineCosts.get("C2J")+airlineCosts.get("J2J");
            if(minCost>tempCost){
                minCost = tempCost;
            }
            selectedStops = getScheduledStops(airlineCosts, stop-1)+1;
        }
        if(stop>=3){
            tempCost = getMinCost(airlineCosts, stop-1)+airlineCosts.get("C2A")+airlineCosts.get("A2A")*2;
            if(minCost>tempCost){
                minCost = tempCost;
            }
            selectedStops = getScheduledStops(airlineCosts, stop-1)+2;
        }
        if(stop>=4){
            tempCost = getMinCost(airlineCosts, stop-1)+airlineCosts.get("C2J")+airlineCosts.get("J2J")*2;
            if(minCost>tempCost){
                minCost = tempCost;
            }
            selectedStops = getScheduledStops(airlineCosts, stop-1)+2;
        }

        return selectedStops;
    }


    public ArrayList getOptimalPath(HashMap<String, Integer> airlineCosts, int noOfStops){

        ArrayList<String> path = new ArrayList<>();

        int minCost = Integer.MAX_VALUE;
        int tempCost = 0;
        int selectedStops = Integer.MAX_VALUE;
        int lastStopCost = 0;

        minCost = minCost<airlineCosts.get("C2S")?minCost:airlineCosts.get("C2S");
        if(noOfStops>=1){
            tempCost = getMinCost(airlineCosts, noOfStops-1)+airlineCosts.get("C2A")+airlineCosts.get("A2A");
            if(minCost>tempCost){
                minCost = tempCost;
                lastStopCost = airlineCosts.get("C2A")+airlineCosts.get("A2A");
                selectedStops = getScheduledStops(airlineCosts, noOfStops-1)+1;
            }

        }
        if(noOfStops>=2){
            tempCost = getMinCost(airlineCosts, noOfStops-1)+airlineCosts.get("C2J")+airlineCosts.get("J2J");
            if(minCost>tempCost){
                minCost = tempCost;
                lastStopCost = airlineCosts.get("C2J")+airlineCosts.get("J2J");
                selectedStops = getScheduledStops(airlineCosts, noOfStops-1)+1;
            }
        }
        if(noOfStops>=3){
            tempCost = getMinCost(airlineCosts, noOfStops-1)+airlineCosts.get("C2A")+airlineCosts.get("A2A")*2;
            if(minCost>tempCost){
                minCost = tempCost;
                lastStopCost = airlineCosts.get("C2A")+airlineCosts.get("A2A")*2;
                selectedStops = getScheduledStops(airlineCosts, noOfStops-1)+2;
            }
        }
        if(noOfStops>=4){
            tempCost = getMinCost(airlineCosts, noOfStops-1)+airlineCosts.get("C2J")+airlineCosts.get("J2J")*2;
            if(minCost>tempCost){
                minCost = tempCost;
                lastStopCost = airlineCosts.get("C2J")+airlineCosts.get("J2J")*2;
                selectedStops = getScheduledStops(airlineCosts, noOfStops-1)+2;
            }
        }


        return path;
    }

    public static void main(String[] args){

        OptimalPaths op = new OptimalPaths();
        op.getMinCost(airlineCosts, 4);

        ArrayList path = op.getOptimalPath(airline
        }
        return result;
    }

    
}