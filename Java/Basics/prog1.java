import java.util.Scanner;
public class prog1{
    public static void main(String[] args) {
        int x,i,j;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        for(i=1;i<=x;i++)
        {
            for(j=1;j<=x;j++)
            {
                System.out.print((char)(64+i));
            }
            System.out.println();
        }
    }
}