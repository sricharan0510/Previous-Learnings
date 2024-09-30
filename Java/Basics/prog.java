// import java.util.Scanner;
// public class prog
// {
//     public static void main(String[] args)
//     {
//         int x,y;
//         Scanner sc = new Scanner(System.in);
//         x = sc.nextInt();
//         y = sc.nextInt();
//         if(x%2==0 && y%2==0)
//         {
//             System.out.println("YES");
//         }
//         else if(x==0 && y%2!=0)
//         {
//             System.out.println("NO");
//         }
//         else if(x%2!=0 && y==0)
//         {
//             System.out.println("NO");
//         }
//         else
//         {
//             System.out.println("NO");
//         }
//     }
// }
import java.util.Scanner;
public class prog
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n/2);
        }
        else
        {
            System.out.println(n%2+0.5);
        }
        sc.close();
    }
}
