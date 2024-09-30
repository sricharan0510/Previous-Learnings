// import java.util.Scanner;

// public class UserExcept {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         try {
//             if(age<21){
//                 throw new Exception("Child Marriages are Illegal");
//             }
//             else{
//                 System.out.println("You are eligible to ruin your life");
//             }
//         }
//         catch(Exception e){
//             System.out.println(e.getMessage());
//         }
//     }
// }


import java.util.*;
class TooYoungException extends Exception {
    public TooYoungException(String msg){
        super(msg);
    }
}
class TooOldException extends Exception {
    public TooOldException(String msg){
        super(msg);
    }
}
public class UserExcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if(age<21){
                throw new TooYoungException("Child Marriages are Illegal");
            }
            else if(age>50){
                throw new TooOldException("You should be arranging your son/daughter's marriage right now");
            }
            else {
                System.out.println("You are eligible to marry");
            }
        }
        catch(TooYoungException | TooOldException ty){
            System.out.println(ty);
        }
    }
}