package main;

import multiplesOf3.MultOf3State;
import multiplesOf3.MultiplesOf3;

public class Main {
    public static void main(String[] args) {
        MultiplesOf3 m = new MultiplesOf3();
        m.computeY("10"); // 2, 2 mod 3
        System.out.println("state: " + m.getState());
        m.computeY("10"); // 4 => 6 => 1 mod 3
        System.out.println("state: " + m.getState());
    }
}
