import java.util.Scanner;

public class swit
{
	public static void main(String[] args)
	{
		int a=10,b=2;
		Scanner sc = new Scanner(System.in);
		char choice = sc.next().charAt(0);
		sc.close();
		switch(choice) {
			case '+':
				System.out.print(a+b);
				break;
			
			case '-':
				System.out.print(a-b);
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
				System.out.print("Invalid choice!");
		}
	}
}