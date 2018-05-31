package main;

import multiplesOf3.MultOf3State;
import multiplesOf3.MultiplesOf3;

public class Main {
    public static void main(String[] args) {
        MultiplesOf3 m = new MultiplesOf3();
//        m.computeY("00"); // 0, 0 mod 3
//        System.out.println("state: " + m.getState());
//        m.computeY("01"); // 1, 1 mod 3
//        System.out.println("state: " + m.getState());
        m.computeY("10"); // 3, 0 mod 3
        System.out.println("state: " + m.getState());
        m.computeY("10"); // 3, 0 mod 3
        System.out.println("state: " + m.getState());
//        m.computeY("11"); // 6, 0 mod 3
//        System.out.println("state: " + m.getState());
//        m.computeY("01"); // 7, 1 mod 3
//        System.out.println("state: " + m.getState());
        //
        // System.out.println("state: " + m.getState());
    }
}
