package com.hihusky.stream;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
    }
}
