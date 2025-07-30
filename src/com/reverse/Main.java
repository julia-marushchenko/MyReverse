// Java program to change order of all symbols in a string
package com.reverse;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating string
        String originalString = "I am java.lang.String";

        // Creating string to save it in reverse
        String reverseString = "";

        // Loop to save new string with charAt()
        for(int index = 0; index < originalString.length(); index++){
            reverseString = originalString.charAt(index) + reverseString;
        }

        // Printing to console new string
        System.out.println(reverseString);
    }
}