import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int[][] a= new int[3][];
        // a[0] = new  int[5];
        // a[1] = new int[2];
        // a[2] = new int[4];
        a[0] = new  int[]{1,2,3,4,5};
        a[1] = new int[]{6,7};
        a[2] = new int[]{8,9,10,1};
        for(int i=0;i<3;i++)
        {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
