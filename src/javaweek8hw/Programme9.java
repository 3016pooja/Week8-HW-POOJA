package javaweek8hw;
/*9.	Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

 */

public class Programme9 {
    public static void main(String[] args) {

        int n = 100, firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series Upto " + n + ": ");

        while (firstTerm <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

