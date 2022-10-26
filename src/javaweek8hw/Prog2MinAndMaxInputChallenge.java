package javaweek8hw;
/*2.	-Read the numbers from the console entered by the user and print the minimum and maximum number
the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
*/

import java.util.Scanner;

public class Prog2MinAndMaxInputChallenge {
    public static void method1(int[] a) {
        int max = 0;
        int min = 0;
        int i = 0;
//Used while loop to find min and max number
        while (i < a.length) {
            if (i == 0)
                max = min = a[i];
            else if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min)
                min = a[i];
            i++;
        }

        System.out.println("this is maximun number:" + max);
        System.out.println("this is minimun number:" + min);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter size of aray");
        int sizeOfArray = obj.nextInt();
//using if statement for giving size of array to console
        if (sizeOfArray < 0)
            System.out.println("invalid number");
        else {
            int a[] = new int[sizeOfArray];
            int i = 0;
            while (i < a.length) {
                System.out.println("please enter number" + (i + 1) + " : ");
                a[i] = obj.nextInt();
                i++;
            }

            method1(a);
        }
    }
}