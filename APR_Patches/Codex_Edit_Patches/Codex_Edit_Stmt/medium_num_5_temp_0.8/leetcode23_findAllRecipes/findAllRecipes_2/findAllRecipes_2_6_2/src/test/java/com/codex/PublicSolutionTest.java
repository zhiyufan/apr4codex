package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {
    @Test(timeout=500)
    public void test1(){
        String arr[] = {"bread"};
        List arr2 = new ArrayList();
        arr2.add(Arrays.asList("yeast","flour"));
        String arr3[] = {"yeast","flour","corn"};
        List arr4 = Arrays.asList("bread");
        assertEquals(arr4, findAllRecipes(arr, arr2, arr3));
    }

    @Test(timeout=500)
    public void test2(){
        String arr[] = {"bread","sandwich"};
        List arr2 = new ArrayList();
        arr2.add(Arrays.asList("yeast","flour"));
        arr2.add(Arrays.asList("bread","meat"));
        String arr3[] = {"yeast","flour","meat"};
        List arr4 = Arrays.asList("bread","sandwich");
        assertEquals(arr4, findAllRecipes(arr, arr2, arr3));
    }

    @Test(timeout=500)
    public void test3(){
        String arr[] = {"bread","sandwich","burger"};
        List arr2 = new ArrayList();
        arr2.add(Arrays.asList("yeast","flour"));
        arr2.add(Arrays.asList("bread","meat"));
        arr2.add(Arrays.asList("sandwich","meat","bread"));
        String arr3[] = {"yeast","flour","meat"};
        List arr4 = Arrays.asList("bread","sandwich","burger");
        assertEquals(arr4, findAllRecipes(arr, arr2, arr3));
    }
}