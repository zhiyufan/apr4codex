package com.codex;

import java.util.*;

public class Solution {
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        switch (carType){
            case 1 :
                if (big > 0){
                    big--;
                }else{
                    return false;
                }
                break;
            case 2:
                if (medium > 0){
                    medium--;
                }else{
                    return false;
                }
                break;
            case 3:
                if (small > 0){
                    small--;
                }else{
                    return false;
                }
                break;
        }
        return true;
    }
}