package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[][] = {
            {0,0,0,0},
            {0,1,1,1}
        };
        int arr2[][] = {
            {0,0},
            {0,1}
        };
        assertEquals(1,digArtifacts(2, arr, arr2));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[][] = {
            {0,0,0,0},
            {0,1,1,1}
        };
        int arr2[][] = {
            {0,0},
            {0,1},
            {1,1}
        };
        assertEquals(2,digArtifacts(2, arr, arr2));
    }

}