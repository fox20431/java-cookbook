package com.hihusky.enum_;

/**
 * <p>
 * 'enum' is short for <b>enumerate</b>. An enum is a special "class" that represents a group of constants
 * (unchangeable variables, like final variables). While an enum can implement interfaces, it cannot be extended.
 * </p>
 *
 * <p>
 *  An enum is essentially a singleton pattern. It can be initialized with a constructor, but it cannot be
 *  instantiated.
 * </p>
 *
 * <p>Here is how to initialize an enum: </p>
 * <code>
 *     Apple apple = Apple.RedDel;
 * </code>
  */
enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private final int price;

    // Constructor
    Apple(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}
