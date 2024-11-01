import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        //Arithmetic operators
        int addOperator = number1 + number2;
        int subOperators = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        int modulus = number1 % number2;
        int increment = number1++;
        int decrement = number1--;

        //Assignment Operators
        int b = number1; // = is assign operator
        int c = 1;
         c += number1; // Assignment addition
         c -= number1; //subtraction Assignment
         c *= number1; //multiplication Assignment

        //Comparison Operator
        System.out.println(number1 == number2); // compare both
        System.out.println(number1 >= number2); // grater than or equal to
        System.out.println(number1 != number2); // not equal to


        //Bitwise Operator
        System.out.println(number1 > number2 && number2 > number3);
        System.out.println(number1 > number2 || number2 > number3);


        //Operators are evaluated based on Precedence.


    }
}
