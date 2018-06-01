/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import multiplesOf3.MultiplesOf3;
import multiplesOf3.OneMod3;
import multiplesOf3.TwoMod3;
import multiplesOf3.ZeroMod3;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test if multiplesOf3.MultiplesOf3 class properly keeps track of sum modulo 3
 */
public class TestMultiples {
    MultiplesOf3 multOf3;

    @Before
    public void setUp() {
        multOf3 = new MultiplesOf3();
    }

    // Start at 0 mod 3, so input of 00 should keep sum at 0 mod 3
    // which produces a Y of 1
    @Test
    public void test1Zero() {
        assertEquals((Integer) 1, multOf3.computeY("00"));
        assertEquals(ZeroMod3.class, multOf3.getState().getClass());
    }

    // Input = 01
    @Test
    public void test1One() {
        assertEquals((Integer)0, multOf3.computeY("01"));
        assertEquals(OneMod3.class, multOf3.getState().getClass());
    }
//
//
//    // Input = 10
    @Test
    public void test1Two() {
        assertEquals((Integer)0, multOf3.computeY("10"));
        assertEquals(TwoMod3.class, multOf3.getState().getClass());
    }

    // Run computeY on each String in the array of inputs and
    // return result of final call
    int runSeries(String[] inputs) {
        int result = 1;    // if inputs is empty

        for (String in: inputs)
            result = multOf3.computeY(in);
        return result;
    }

//    // Try two 10's in a row, so sum = 4 = 1 mod 3
    @Test
    public void test2Twos() {
        multOf3.computeY("10");
        assertEquals((Integer)0, multOf3.computeY("10"));
        assertEquals(OneMod3.class, multOf3.getState().getClass());
    }

//    // Try 1 then 3 then 1 then 3
    @Test
    public void test1313() {
        String []inputs = {"01", "11", "01", "11"};
        int result = runSeries(inputs);
        assertEquals(0, result);
        assertEquals(TwoMod3.class, multOf3.getState().getClass());
    }
//
//    // Trying remaining state transitions:
//    // ONE -> ZERO, TWO->TWO, TWO->ZERO
    @Test
    public void test12231() {
        String []inputs = {"01", "10", "10", "11", "01"};
        int result = runSeries(inputs);
        assertEquals(1, result);
        assertEquals(ZeroMod3.class, multOf3.getState().getClass());
    }
}