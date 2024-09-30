import java.util.*;
public class arrmethod {
    public static void main(String[] args) {
        int[] a = {7,2,1,9,5};
        String[] b = {"cd","bc","ab"};
        int[] c = new int[5];
        String[] d = new String[3];
        int[] e = {1,2,5,7,9};

        //Arrays.toString() : It gives as list
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        //Arrays.sort(): sorting in ascending 
        /*  
        We can sort an array for a certain range
        Arrays.sort(ArrayName,starting index,final index+1) 
        */
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        //Arrays.fill():  Use to fill with a certain element
        Arrays.fill(c,10);
        System.out.println(Arrays.toString(c));
        Arrays.fill(d,"Kittu");
        System.out.println(Arrays.toString(d));

        //Arrays.equals() : true if both arrays arrays have all equal elements
        System.out.println(Arrays.equals(a,e));  //a is changed in above sort method which is equal to e wrt index

        // Ararys.compare(array1,array2) : it prints int value of -1,1,2
        // prints according to the first different element in both arrays
        /*
         -1 : prints if array1 < array2
          0 : prints if array1 = array2
          1 : prints if array1 > array2
        */
        // System.out.print(Arrays.compare(a,e));

        //creating copy of aray
        int[] f=a.clone();  // array a is stored in f
        System.out.println(Arrays.toString(f));
    }
}