import java.util.Scanner;

public class IntroductionToStrings {
    public static void main(String[] args) {

        String S = "Samuel is my Name";   // Taking S String as input
        System.out.print(S);  // Displaying S using print // No new Line at the end

        Scanner in = new Scanner(System.in);
        String name1 = in.next(); // by using th next , we can only access word before an empty space.
        System.out.println(name1); // the print function will only print in one line.

        String name2 = in.nextLine(); // by using th nextLine, we can access words after an empty space.
        System.out.println(name2);

        float number = 5.234563f;
        System.out.printf("The given float number is %3.2f ", number);


    }
}
// the output for the above code is

// Samuel is my Name // printed using the with out scanner
// hy l k hh         // Taken input using the Scanner class
// hy                // the "next" function only scanned 1st word before the space.
// l k hh            // ## form the same input form the Scanner class only the words after the space are taken ##
// The given float number is 5.23  // Printed using the format function of the print function that is printf
                                    // by using it we can decide the exact required format of it.
                                    //  %8.3f the 8 will take the 8 char form the input , and 3 will print the 3 char after . .
