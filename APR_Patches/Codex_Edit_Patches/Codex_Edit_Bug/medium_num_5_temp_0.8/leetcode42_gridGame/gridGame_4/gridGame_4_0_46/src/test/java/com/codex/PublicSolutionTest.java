package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[][] = {
            {2,5,4},
            {1,5,1}
        };
        assertEquals(4, gridGame(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[][] = {
            {3,3,1},
            {8,5,2}
        };
        assertEquals(4, gridGame(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[][] = {
            {1,3,1,15},
            {1,3,3,1}
        };
        assertEquals(7, gridGame(arr));
    }
}