package com.hihusky.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with key as String and value as Integer
        Map<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);

        // Retrieve and print values based on keys
        System.out.println("Value for key 'Two': " + hashMap.get("Two"));
        System.out.println("Value for key 'Four': " + hashMap.get("Four"));

        // Check if a key exists in the HashMap
        String keyToCheck = "Five";
        if (hashMap.containsKey(keyToCheck)) {
            System.out.println("Value for key '" + keyToCheck + "': " + hashMap.get(keyToCheck));
        } else {
            System.out.println("Key '" + keyToCheck + "' not found in the HashMap.");
        }

        // Iterate over the entries and print key-value pairs
        System.out.println("\nIterating over HashMap entries:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Remove a key-value pair
        String keyToRemove = "Two";
        if (hashMap.containsKey(keyToRemove)) {
            int removedValue = hashMap.remove(keyToRemove);
            System.out.println("\nRemoved key '" + keyToRemove + "' with value: " + removedValue);
        } else {
            System.out.println("\nKey '" + keyToRemove + "' not found in the HashMap.");
        }

        // Print the updated HashMap
        System.out.println("\nHashMap after removal:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
