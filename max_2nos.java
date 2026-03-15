import java.util.*;

public class max_2nos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a , b;

        System.out.println("Enter two numbers");
        a = s.nextInt();
        b = s.nextInt();

        if(a>b){
            System.out.println("\n max = "+a);
        }else{
            System.out.println("\n max = "+b);
        }
    }
}
