import java.util.Scanner;

public class Except1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Buddy You Can't Divide with Zero");
        }
        System.out.println("I will be on the screen");
    }
}
