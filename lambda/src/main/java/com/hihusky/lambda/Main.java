package com.hihusky.lambda;

public class Main {
    public static void main(String[] args) {
        Caller caller = new Caller();
        caller.call((words) -> System.out.println(words));
    }
}
