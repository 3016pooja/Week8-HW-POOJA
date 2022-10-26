package javaweek8hw;

import java.util.Scanner;

/*. Read 10 numbers from the console entered by the user and print the sum of those numbers.
Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read 10 numbers.
-Use the nextInt() method to get the number and add it to the sum.

 */
public class Pro1ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter a number#" + count);
            boolean validNumber = scanner.hasNextInt();
            if (validNumber) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);

        scanner.close();
    }
}
