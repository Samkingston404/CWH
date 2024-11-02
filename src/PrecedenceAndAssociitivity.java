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




    }
}
