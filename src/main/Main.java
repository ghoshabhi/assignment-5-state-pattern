package main;

import multiplesOf3.MultiplesOf3;
import multiplesOf3.OneMod3;

public class Main {
    public static void main(String[] args) {
        MultiplesOf3 m = new MultiplesOf3();
        System.out.println(m.computeY("01"));
        System.out.println("state: " + m.getState());
        System.out.println(m.computeY("10"));
        System.out.println("state: " + m.getState());

        System.out.println(OneMod3.class + " - " + m.getState().getClass());
    }
}