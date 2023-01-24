package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        int arr[] = {1, 1, 2, 3, 5};
        assertEquals(minDeletion(arr), 1);
    }

    @Test(timeout=500)
    public void test2(){
       int arr[] = {1, 1, 2, 2, 3, 3};
        assertEquals(minDeletion(arr), 2);
    }

}