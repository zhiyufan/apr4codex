package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {2,2,3,3};
        assertEquals(14, wateringPlants(arr, 5));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {1,1,1,4,2,3};
        assertEquals(30, wateringPlants(arr, 4));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {7,7,7,7,7,7,7};
        assertEquals(49, wateringPlants(arr, 8));
    }
}