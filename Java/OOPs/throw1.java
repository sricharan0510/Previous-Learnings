class SimpleMath {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void subract(int a,int b){
        System.out.println(a-b);
    }
    void multiply(int a,int b){
        System.out.println(a*b);
    }
    void divide(int a,int b)throws Exception{
        System.out.println(a/b);
    }
}
public class throw1 {
    public static void main(String[] args) {
        SimpleMath sm = new SimpleMath();
        sm.add(10, 20);
        sm.subract(10, 20);
        sm.multiply(10, 20);
        try{
            sm.divide(10, 0);
        }
        catch(Exception e){
            System.out.println("Zero Division is not possible");
        }
    }
}
