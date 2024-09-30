import java.util.Scanner;

public class Except2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an index to be print:");
        int ind = sc.nextInt();
        try {
            System.out.println(arr[ind]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You can only enter a value from 0 to "+(arr.length-1));
        }
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        System.err.println(sum);
    }
}
