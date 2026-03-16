import java.util.*;

//'A' = Upper case
//'a' = lower case
//'3' = Digit
//'@' = Special character

public class IfDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("\n Upper Case");
        }else if(ch >= 'a' && ch <= 'z'){
            System.out.println("\n Lower Case");
        }else if(ch >= '0' && ch <= '9'){
            System.out.println("\n Digit");
        }else{
            System.out.println("\n Special Character");
        }
    }
}
