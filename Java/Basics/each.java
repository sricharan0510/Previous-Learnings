// public class each {
//     public static void main(String[] args) {
//         int intArr[] = {10,20,30};
//         String strArr[] = {"qaz","wsx","edc"};
//         double doubleArr[] = {1.2,5.6,4.9};
//         for(int m: intArr)
//         {
//             System.out.println(m/2);
//         }
//         for(double a:doubleArr)
//         {
//             System.out.println();
//         }
//         for(String b:strArr)
//         {
//             System.out.println(b+" "+b);
//         }
//     }
// }
// public class each2 {
//     public static void main(String[] args) {
//         int a[] = {1,2,3};
//         for(int m:a)
//         {
//             System.out.println(m*m);
//         }
//     }
// }

public class each{
    public static void main(String[] args) {
        double a[]= {1.2,4.5,7.8};
        double sum = 0;
        for(double s:a)
        {
            sum=sum+s;
        }
        System.out.printf("%.2f",sum);
    }
}