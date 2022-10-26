package javaweek8hw;
/*12.	Write a programme to input any number and check if it is prime or not.

 */

import java.util.Scanner;

public class Programme12 {

    public static void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int number = sc.nextInt();
        int count=0;
        sc.close();


        if (number > 1) {

            for (int i = 1; i <= number; i++) {
                if (number % i==0)
                    count++;
            }
            if (count==2) {
                System.out.println("its prime number");
            } else {
                System.out.println("not a prime number");

            }}
        else
            System.out.println("not a prime number");
    }

    public static void main(String[] args) {
        method1();
    }

}

