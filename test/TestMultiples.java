/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import multiplesOf3.MultOf3State;
import multiplesOf3.MultiplesOf3;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
        assertEquals(1, (int)multOf3.computeY("00"));
        assertEquals(MultOf3State.ZEROMOD3, multOf3.getState());
    }

    // Input = 01
    @Test
    public void test1One() {
        assertEquals(0, (int)multOf3.computeY("01"));
        assertEquals(MultOf3State.ONEMOD3, multOf3.getState());
    }


    // Input = 10
    @Test
    public void test1Two() {
        assertEquals(0, (int)multOf3.computeY("10"));
        assertEquals(MultOf3State.TWOMOD3, multOf3.getState());
    }

    // Run computeY on each String in the array of inputs and
    // return result of final call
    int runSeries(String[] inputs) {
        int result = 1;    // if inputs is empty

        for (String in: inputs)
            result = multOf3.computeY(in);
        return result;
    }

    // Try two 10's in a row, so sum = 4 = 1 mod 3
    @Test
    public void test2Twos() {
        multOf3.computeY("10");
        assertEquals(0, (int)multOf3.computeY("10"));
        assertEquals(MultOf3State.ONEMOD3, multOf3.getState());
    }

    // Try 1 then 3 then 1 then 3
    @Test
    public void test1313() {
        String []inputs = {"01", "11", "01", "11"};
        int result = runSeries(inputs);
        assertEquals(0, result);
        assertEquals(MultOf3State.TWOMOD3, multOf3.getState());
    }

    // Trying remaining state transitions:
    // ONE -> ZERO, TWO->TWO, TWO->ZERO
    @Test
    public void test12231() {
        String []inputs = {"01", "10", "10", "11", "01"};
        int result = runSeries(inputs);
        assertEquals(1, result);
        assertEquals(MultOf3State.ZEROMOD3, multOf3.getState());
    }
}