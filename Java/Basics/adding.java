//importing Scanner for user input
import java.util.Scanner;
class adding {
    public static void main(String[] args) {
        //creating an object of Scanner class
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = n1 + n2;
        // Sum of 10 and 20 is: 30
        System.out.println("Sum of "+n1+" and "+n2+" is:"+n3);
        System.out.printf("Sum of %d and %d is:%d",n1,n2,n3);
        sc.close();
    }
}
