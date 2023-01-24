package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[][] = {
            {5,5}, {6,3},
            {3,6}
        };
        assertEquals(0, numberOfWeakCharacters(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[][] = {
            {2,2}, {3,3}
        };
        assertEquals(1, numberOfWeakCharacters(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[][] = {
            {1,5}, {10,4}, {4,3}
        };
        assertEquals(1, numberOfWeakCharacters(arr));
    }

}