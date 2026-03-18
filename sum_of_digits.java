import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num , rem , sum=0;

        System.out.println("\n Enter number");
        num = s.nextInt();

        while(num>0){
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        System.out.println("\n Sum of digits = "+sum);
    }
}
