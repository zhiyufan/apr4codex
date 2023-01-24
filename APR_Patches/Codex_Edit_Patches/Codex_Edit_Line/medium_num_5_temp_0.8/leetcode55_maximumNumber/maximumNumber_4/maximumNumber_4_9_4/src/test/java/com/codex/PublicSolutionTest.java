package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        int arr[] = {9,8,5,0,3,6,4,2,6,8};
        assertEquals("832", maximumNumber("132",arr));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {9,4,3,5,7,2,1,9,0,6};
        assertEquals("934", maximumNumber("021",arr));
    }

    @Test(timeout=500)
    public void test3(){
        int arr[] = {1,4,7,5,3,2,5,6,9,4};
        assertEquals("5", maximumNumber("5",arr));
    }
}