import java.util.Scanner;

public class max_4nos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a , b , c , d , max;
        System.out.println("Enter 4 numbers");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();

        max = a;

        if(max<b){
            max = b;
        }
        if(max<c){
            max = c;
        }
        if(max<d){
            max = d;
        }
        System.out.println("max ="+max);
    }
}
