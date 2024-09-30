//By default methods in interface is public and Abstract(100% abstraction)
interface MyInterface {
    void m1();
    void m2();
}
class A implements MyInterface{
    public void m1(){
        System.out.println("This is m1");
    }
    public void m2(){
        System.out.println("This is m2");
    }
}
public class IFExample {
    public static void main(String[] args) {
        A obj = new A();
        obj.m1();
        obj.m2();
    }
}