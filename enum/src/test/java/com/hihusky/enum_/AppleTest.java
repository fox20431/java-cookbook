package com.hihusky.enum_;

import org.junit.jupiter.api.Test;

public class AppleTest {

    @Test
    void testToStringMethod() {
        Apple apple;

        apple = Apple.RedDel;
        System.out.println("Value of ap: " + apple);

        apple = Apple.GoldenDel;
        System.out.println("Value of ap: " + apple);
    }

    @Test
    void testValue() {
        System.out.println("Get all instants by `values()`:");

        Apple[] allApples = Apple.values();
        for (Apple a :
                allApples) {
            System.out.println(a);
        }

        System.out.println();

        System.out.println("Get an instant by `valueOf()`:");
        Apple ap = Apple.valueOf("Winesap");
        System.out.println(ap);
    }

    @Test
    void testMethod() {
        Apple ap;
        // Display price of Winesap
        System.out.println("Winesap costs " +
                Apple.Winesap.getPrice() +
                " cents.\n");
        // Display all apples and price.
        System.out.println("All apple prices:");
        for (Apple a :
                Apple.values()) {
            System.out.println(a + "costs " +
                    a.getPrice() + " cents.");
        }
    }

    @Test
    void testOrdinal() {
        // Obtain all ordinal values using ordinal().
        System.out.println("Here are all apple constants and their ordinal values");

        for (Apple a :
                Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        Apple jonathan = Apple.Jonathan;
        Apple redDel = Apple.RedDel;

        int i = redDel.compareTo(jonathan); // it equals to: redDel.ordinal() - jonathan.ordinal()
        System.out.println(redDel + " comes before " + jonathan + " by " + i + " positions");
    }

    @Test
    void testCompare() {
        Apple ap, ap2, ap3;

        ap = Apple.Jonathan;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        int i = ap.compareTo(ap3);
        System.out.println(i);
    }
}


