package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        assertEquals(103, smallestNumber(310));
    }

    @Test(timeout=500)
    public void test2(){
        assertEquals(-7650, smallestNumber(-7605));
    }

}