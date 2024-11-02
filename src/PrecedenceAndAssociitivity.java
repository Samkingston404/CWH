import java.sql.SQLOutput;

public class PrecedenceAndAssociitivity {
    public static void main(String[] args) {
        int number = 2;
        int number2 = 5;
        int number3 = 5;

        /* Precedence is the value given to the operators to perform first
        * like the  * and / have the equal precedence */

        //They will be later decided by Associativity like Left to Right or Right to Left.

        //Precedence
        int answer = number * number2 / number3;
        // 2 * 5 / 5
        //10 / 5
        // 2
        System.out.println(answer);
        int answer1 = number / number2 * number3;
        // 2 / 5 * 5
        //0.4 * 5
        // 0
        System.out.println(answer1);

        //Associativity

        // * / Left to Right
        // + - Left to right
        // ++ = Right to Left

        int b , a , c = 16;
        b = a = c;
        System.out.println(b);

        int q = 5 , p = 1;
        q = ++p;
        System.out.println(q);
        int f = 0 , g = 0;
        g = f++; // in post increment the f value first store in g and then f + 1 will be updated in f
        System.out.println(g);
        g = ++f;// in pre first f + 1 will be updated and stored in g;
        System.out.println(g);

        // Quiz Quick by CWH
        // x - y     b^2 - 4ac
        //-------    --------
        //   2          2a

        int x = 8, y = 4, result = 0;
        result = x - y / 2;   // 8 - 4 / 2
        System.out.println(result);   //  8 - 2
                                        //6

        result = (x - y) / 2;   // (8 - 4) / 2
        System.out.println(result);   //  4 / 2
                                        //2

        result = x - y / 2;   // 8 - 4 / 2
        System.out.println(result);   //  8 - 2
        //6


        b = 2 ; a = 3; c = 1;
        result = b * b - 4 * a * c / 2 * a;
        System.out.println(result);

        b = 2 ; a = 3; c = 1;
        result = (b * b - 4 * a * c) / (2 * a);
        System.out.println(result);

        a = 2; b = 4; int d = 5, reuslt = 0;
        result = a - 4 * (b - d) ;  // 2 - 4 * ( 4 - 5)
                                    // 2 - 4 * - 1
        // 2 + 4 = 6
        System.out.println(result);

        char ch = 'a';
        System.out.println(++ch);
    }
}
