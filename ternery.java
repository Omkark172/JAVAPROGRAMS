import java.util.*;

public class ternery {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        int a , b , max;
        System.out.print("Enter 2 numbers: ");
        a=s.nextInt();
        b=s.nextInt();

        max = a > b ? a : b;

        System.out.println("\n Max = "+max);
    }
}
