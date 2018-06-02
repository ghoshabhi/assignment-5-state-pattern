/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package multiplesOf3;

import java.util.HashMap;
import java.util.Map;

/**
 * The client interface class which also represents the Finite State
 * Machine(FSM). The state of the machine is handled by the predefined
 * states "zeroMod3", "oneMod3" and "twoMod3". Each of the state's are objects
 * of the concrete implementation classes of the "State" interface.
 */
public class MultiplesOf3 {
    /* The State of the FSM */
    private State state;
    /* A utility variable used to hold the current sum of the inputs */
    private Integer currentSum;
    /* A utility HashMap object used to store the mappings of the string inputs -> integer representation */
    private Map<String, Integer> stringIntegerHashMap = new HashMap<>();

    /* The predefined possible states of the FSM */
    private State zeroMod3;
    private State oneMod3;
    private State twoMod3;

    /**
     * Constructor
     *
     * Initializes a couple of things for the FSM:
     *  a) All the states ("zeroMod3", "oneMod3" and "twoMod3")
     *  b) The initial state of the machine => zeroMod3
     *  c) The current sum of the inputs => 0
     *  d) The mappings for the inputs in the "stringIntegerHashMap" HashMap
     */
    public MultiplesOf3() {
        zeroMod3 = new ZeroMod3(this);
        oneMod3 = new OneMod3(this);
        twoMod3 = new TwoMod3(this);
        state = zeroMod3;
        currentSum = 0;
        stringIntegerHashMap.put("00", 0);
        stringIntegerHashMap.put("01", 1);
        stringIntegerHashMap.put("10", 2);
        stringIntegerHashMap.put("11", 3);
    }

    /**
     * The interface provided to the client to calculate the "Y" output of the
     * machine and the current state of the machine based on the input.
     * @param input : String: Input to the FSM
     * @return Returns an integer representing the "Y" output of the FSM
     */
    public Integer computeY(String input) {
        return state.computeY(input);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getZeroMod3() {
        return zeroMod3;
    }

    public State getOneMod3() {
        return oneMod3;
    }

    public State getTwoMod3() {
        return twoMod3;
    }

    public Integer getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(Integer currentSum) {
        this.currentSum = currentSum;
    }

    public Map<String, Integer> getStringIntegerHashMap() {
        return stringIntegerHashMap;
    }
}
