package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[][] = {
            {1,0,0},
            {0,1,1},
            {0,1,1}
        };
        int arr2[][] = {
            {0,0,0,0},
            {1,1,2,2}
        };
        assertArrayEquals(arr2, findFarmland(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[][] = {
            {1,1},
            {1,1}
        };
        int arr2[][] = {
            {0,0,1,1}
        };
        assertArrayEquals(arr2, findFarmland(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[][] = {
            {0}
        };
        int arr2[][] = {
            {}
        };
        assertArrayEquals(arr2, findFarmland(arr));
    }

}