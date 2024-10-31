import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner in    = new Scanner(System.in);
        int telugu    = in.nextInt();
        int hindi     = in.nextInt();
        int english   = in.nextInt();
        int maths     = in.nextInt();
        int science   = in.nextInt();
        int total     = telugu+hindi+english+maths+science;
        float percentage= (total / 500.0f) * 100;
        System.out.printf("percentage: %.2f%%\n", percentage);
    }
}
