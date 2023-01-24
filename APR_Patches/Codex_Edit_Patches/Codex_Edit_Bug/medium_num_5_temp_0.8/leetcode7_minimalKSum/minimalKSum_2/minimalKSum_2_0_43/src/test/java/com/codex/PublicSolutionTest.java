package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {1,4,25,10,25};
        assertEquals(5, minimalKSum(arr, 2));
    }

    @Test(timeout=500)
    public void test2(){
        int arr[] = {5,6};
        assertEquals(25, minimalKSum(arr, 6));
    }

}