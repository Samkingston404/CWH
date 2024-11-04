import java.util.*;

public class NumberBUserGreaterOrNot {
    public static void main(String[] args) {
        int givenNumber = 69;
        Scanner in = new Scanner(System.in);
        int userNumber = in.nextInt();
        if(givenNumber > userNumber) {
            System.out.println("Greater");
        }
        else {
            System.out.println("Not");
        }
    }
}
