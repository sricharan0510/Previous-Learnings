public class flwipre
{
    public static void main(String[] args) {
        int intVar = 1000000;
        int intVar2 = 4223;
        double doubleVar = 12.2345;

        System.out.printf("%d%n",intVar);
        System.out.printf("%15d%n",intVar);         // width
        System.out.printf("%015d%n",intVar);        // flag
        System.out.printf("%,d%n",intVar);          // flag
        System.out.printf("%-50d%d",intVar2,intVar);

        System.out.printf("%.2f%n",doubleVar);      //width
        System.out.printf("%020.2f%n",doubleVar);   //flag 
    }
}