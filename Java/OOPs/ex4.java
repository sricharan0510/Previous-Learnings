

public class ex4 {
    // static void printArray(Integer[] a)
    // {
    //     for(Integer i : a)
    //     {
    //         System.out.print(i+" ");
    //     }
    // }
    // static void printArray(String[] a)
    // {
    //     for(String i : a)
    //     {
    //         System.out.print(i+" ");
    //     }
    // }
    // static void printArray(Double[] a)
    // {
    //     for(Double i : a)
    //     {
    //         System.out.print(i+" ");
    //     }
    // }
    // static void printArray(Character[] a)
    // {
    //     for(Character i : a)
    //     {
    //         System.out.print(i+" ");
    //     }
    // }
    static <kittu> void printArray(kittu[] a)
    {
        for(kittu i : a )
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Integer[] a = {10,20,30,40,50};
        String[] b = {"rohit","virat","hardik"};
        Character[] c = {'!','@','#'};
        Double[] d = {8.6,4.2,9.7};
        printArray(a);
        printArray(b);
        printArray(c);
        printArray(d);
    }
}
