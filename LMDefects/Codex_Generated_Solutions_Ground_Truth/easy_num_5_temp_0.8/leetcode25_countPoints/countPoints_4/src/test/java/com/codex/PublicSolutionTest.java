package com.codex;
import java.util.*;
import org.junit.Test;
import static com.codex.Solution.*;
import static org.junit.Assert.*;

public class PublicSolutionTest {


    @Test(timeout=500)
    public void test1(){
        assertEquals(1, countPoints("B0B6G0R6R0R6G9"));
    }

    @Test(timeout=500)
    public void test2(){
        assertEquals(1, countPoints("B0R0G0R9R0B0G0"));
    }

    @Test(timeout=500)
    public void test3(){
        assertEquals(0, countPoints("G4"));
    }


}