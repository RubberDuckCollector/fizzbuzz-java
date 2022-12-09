/*
 * This program computes FizzBuzz in Java and writes the output in a file.
 * fizz_buzz_constants() uses pre-defined constants for its logic.
 * FIZZ is set for "Fizz", and so on.
 * In the function when the logic is called, the fizzBuzzWriter will write the constant from lines 19-21 to the file.
 * (The constant is a string)
 * 
 * fizz_buzz_no_constants() doesn't use pre-defined data for its calculations.
 * ouput is assigned a value, either the special fizzbuzz words or the number that i holds in memory.
 * After the if statement in the loop, the string is written to the file.
 * The string is formatted like this: "NUMBER THAT i IS: WHETHER IT'S SPECIAL OR NOT" (then a new line)
 */

import java.io.FileWriter;
import java.io.IOException;

class FizzBuzz {

    final static String FIZZ = "Fizz";
    final static String BUZZ = "Buzz";
    final static String FIZZBUZZ = "FizzBuzz";

    public static void fizz_buzz_constants() throws IOException {

        try {
            FileWriter fizzBuzzWriter = new FileWriter("fizzbuzz-constants.txt");

            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzBuzzWriter.write(FIZZBUZZ);
                } else if (i % 5 == 0) {
                    fizzBuzzWriter.write(BUZZ);
                } else if (i % 3 == 0) {
                    fizzBuzzWriter.write(FIZZ);
                } else {
                    fizzBuzzWriter.write(Integer.toString(i) + " - no multiples here :(");
                }
                fizzBuzzWriter.write("\n");
            }
            fizzBuzzWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void fizz_buzz_no_constants() throws IOException {

        String output;
        
        try {
            FileWriter fizzBuzzWriter = new FileWriter("fizzbuzz-no-constants.txt");
            
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    output = "FizzBuzz";
                } else if (i % 5 == 0) {
                    output = "Buzz";
                } else if (i % 3 == 0) {
                    output = "Fizz";
                } else {
                    output = Integer.toString(i) + " - no multiples here :(";
                }
                
                String s;
                s = Integer.toString(i) + ": " + output;
                fizzBuzzWriter.write(s + "\n");
            }

            fizzBuzzWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
        fizz_buzz_no_constants();
        fizz_buzz_constants();
    }
}