package javaweek8hw;
/*3.	Write a Java program that takes the user to provide a single character from the
         alphabet. Print Vowel of Consonant, depending on the user input. If the user input
           Is not a letter (between a and z or A and Z), or is a string of length > 1, print an  error message.
 */

import java.util.Scanner;

public class Programme3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Alphabet");
        String letter = scanner.next().toLowerCase();

        if (letter.length() > 1) {
            System.out.println("Error. Not a single character.");
        } else if (!(isThere(letter))) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        } else if (letter.equals("a") || letter.equals("e") ||
                letter.equals("i") || letter.equals("o") ||
                letter.equals("u")) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }
    public static boolean isThere(String l) {
        if (l.charAt(0) > 96 && l.charAt(0) < 123) {
            return true;
        }
        return false;
    }
}
