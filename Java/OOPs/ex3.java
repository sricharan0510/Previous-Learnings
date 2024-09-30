//METHOD-OVERLOADING EXAMPLE



class Add {
    static void add(){
    System.out.println("No parameters!");
    }
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void add(int a,double b){
        System.out.println(a+b);
    }
    static void add(int a[]){
        int s=0;
        for(int i=0;i<a.length;i++){ 
            s+=a[i];
        }
        System.out.println(s);
    }
}

public class ex3 {
    public static void main(String[] args) {
        Add.add();
        Add.add(5,10);
        Add.add(1,4,3);
        Add.add(5, 12.2);
        int a[] = {1,2,3,4,5};
        Add.add(a);
    }
}
