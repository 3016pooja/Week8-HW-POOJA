package javaweek8hw;
/*Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
Write the following methods (instance methods):
●	Method named getFirstNumber without any parameters, it needs to return the value of the firstNumber field.
●	Method named getSecondNumber without any parameters, it needs to return the value of the secondNumber field.
●	Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
●	*Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber field.
●	Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
●	Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of the secondNumber from the firstNumber.
●	Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
●	Method named getDivisionResult without any parameters, it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.


 */

public class Programme18_SimpleCalculator {

            double firstNumber;
            double secondNumber;

            public double getFirstNumber() {
                return firstNumber;
            }
            public double getSecondNumber() {
                return secondNumber;
            }
            public double setFirstNumber(double firstNumber) {
                this.firstNumber = firstNumber;
                return firstNumber;
            }
            public double setSecondNumber(double secondNumber) {
                this.secondNumber = secondNumber;
                return secondNumber;
            }
            public double getAdditionResult() {
                double sum = firstNumber + secondNumber;
                return sum;
            }

            public double getSubtractionResult() {
                double sub = firstNumber - secondNumber;

                return sub;
            }
            public double getMultiplicationResult() {
                double multi = firstNumber * secondNumber;
                return multi;
            }


            public double getDivisionResult() {
                double div = firstNumber / secondNumber;
                if (secondNumber == 0) {
                    return 0;
                }
                return div;
            }

            public static void main(String[] args) {
                Programme18_SimpleCalculator programme18_simpleCalculator = new Programme18_SimpleCalculator();
                programme18_simpleCalculator.setFirstNumber(5.0);
                programme18_simpleCalculator.setSecondNumber((4));
                System.out.println(("add=" + programme18_simpleCalculator.getAdditionResult()));
                System.out.println(("subtraction =" + programme18_simpleCalculator.getSubtractionResult()));
                programme18_simpleCalculator.setFirstNumber(5.25);
                programme18_simpleCalculator.setSecondNumber(0);
                System.out.println("multiply =" + programme18_simpleCalculator.getMultiplicationResult());
                System.out.println(("divide= " + programme18_simpleCalculator.getDivisionResult()));
            }

}
