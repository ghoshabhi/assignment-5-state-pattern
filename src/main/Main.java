package main;

import multiplesOf3.MultOf3State;
import multiplesOf3.MultiplesOf3;

public class Main {
    public static void main(String[] args) {
        MultiplesOf3 m = new MultiplesOf3();
        System.out.println("yOutput => " + m.computeY("10"));
        System.out.println("state:1 " + m.getState());
        System.out.println("yOutput => " + m.computeY("10"));
        System.out.println("state:2 " + m.getState());
    }
}
