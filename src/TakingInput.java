import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        float f    = in.nextFloat();
        System.out.println("hello");
        in.nextLine();
        String S   = in.nextLine();
        System.out.println(number+" "+f+" "+S);
    }
}
