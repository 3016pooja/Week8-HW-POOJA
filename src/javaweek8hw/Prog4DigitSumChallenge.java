package javaweek8hw;
/*Write a method with the name sumDigits that has one int parameter called number.
If the parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.

 */

import java.util.Scanner;

public class Prog4DigitSumChallenge {
    public static void main(String[] args) {
        Prog4DigitSumChallenge obj=new Prog4DigitSumChallenge();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        int number=scanner.nextInt();
        System.out.println("Sum of digit"+obj.sumDigits(number));

    }
    public int sumDigits(int number){
        int digit;
        int sum=0;
        if(number>=10){
            while(number>0){
                sum=sum + number % 10;
                number=number/10;
            }
            return sum;
        }else {
            return  -1;
        }

    }
}
