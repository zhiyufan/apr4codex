package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {

    @Test(timeout=500)
    public void test1(){
        int arr[] = {2,5,6,9,10};
        assertEquals(2, findGCD(arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {7,5,6,8,3};
        assertEquals(1, findGCD(arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {3,3};
        assertEquals(3, findGCD(arr));
    }

}