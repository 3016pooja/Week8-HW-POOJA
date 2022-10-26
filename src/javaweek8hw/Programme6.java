package javaweek8hw;
/*Write a program in Java to display the pattern like a triangle with a number.
1
	 	12
	 	123
	 	1234
	 	12345
	 	123456
	 	1234567
	 	12345678
	 	123456789
	 	12345678910 */

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
      //
        int i,j,n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);
            System.out.println("");

            }
        }
    }


