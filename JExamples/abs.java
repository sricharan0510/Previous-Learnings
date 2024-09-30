abstract class Parent {
    abstract void m1();
    abstract void m2();
    void m3(){
        System.out.println("Hello there!");
    }
}
class Child1 extends Parent {
    void m1(){
        System.out.println("This is method1");
    }
    void m2(){
        System.out.println("This is Method2");
    }
}
class Child2 extends Parent {
    void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}
public class abs {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.m1();
        c1.m2();
        c1.m3();
        Child2 c2 = new Child2();
        c2.m1();
        c2.m2();
        c2.m3();
    }
}