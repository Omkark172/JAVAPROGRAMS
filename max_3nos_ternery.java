import java.util.Scanner;

public class max_3nos_ternery {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter three numbers");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        int max = (a > b && a > c)? a : (b > c) ? b : c;

        System.out.println("Maximum number is " + max);
    }
}
