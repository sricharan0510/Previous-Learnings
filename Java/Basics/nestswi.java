import java.util.Scanner;
public class nestswi 
{
    public static void main(String[] args) 
    {
        int a,b,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("1.Arithmetc  2.Relational  3.Bitwise");
        s = sc.nextInt();
        switch(s)
        {
            case 1:
            {
                System.out.println("Select any one : + - * / %");
                char choice1=sc.next().charAt(0);
                switch (choice1)
                {
                    case '+':
                        System.out.println(a+b);
                        break;
                    case '-':
                        System.out.println(a-b);
                        break;
                    case '*':
                        System.out.println(a*b);
                        break;
                    case '/':
                        System.out.println(a/b);
                        break;
                    case '%':
                        System.out.println(a%b);
                        break;
                    default:
                        System.out.println("Invalid choice!");
            
                        }        
            }
            break;
            case 2:
            {
                System.out.println("Select any operation on given a and b:> < >= <= == !=");
                String choice2 = sc.next();
                switch(choice2)
                {
                    case ">":
                        System.out.println(a>b);
                        break;       
                    case "<":
                        System.out.println(a<b);
                        break;
                    case ">=":
                        System.out.println(a>=b);
                        break;
                    case "<=":
                        System.out.println(a<=b);
                        break;
                    case "==":
                        System.out.println(a==b);
                        break;
                    case "!=":
                        System.out.println(a!=b);
                        break;
                    default:
                    System.out.println("Invalid choice!");
                }

            }
            break;
            case 3:
            {
                System.out.println("Select any operation on given a and b:& | ^ ");
                String choice3 = sc.next();
                switch(choice3)
                {
                    case "&":
                        System.out.println(a&b);
                        break;       
                    case "|":
                        System.out.println(a|b);
                        break;
                    case "^":
                        System.out.println(a^b);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }

            }
            break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}