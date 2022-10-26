package javaweek8hw;
/*Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwis
e, the method should return false.

 */


public class Programme13 {
        public static boolean hasSharedDigit(int firstA, int firstB) {
            int lastA, lastB;
            if ((firstA >= 10 && firstA <= 99) && (firstB >= 10 && firstB <= 99)) {
                lastA = firstA % 10;
                lastB = firstB % 10;
                firstA /= 10;
                firstB /= 10;

                return ((firstA == lastA) || (firstA == lastB) ||
                        (lastA == firstB) || (lastA == lastB));
            }
            return false;
        }

        public static void main(String[] args) {
            System.out.println(hasSharedDigit(12, 23));
            System.out.println(hasSharedDigit(9, 99));
            System.out.println(hasSharedDigit(15, 55));
        }
    }