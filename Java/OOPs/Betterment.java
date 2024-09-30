import java.util.*;
abstract class Shape {
    double area;
    Scanner sc = new Scanner(System.in);
    abstract void getInput();
    void printArea(){
        System.out.println("Area:"+area);
    }
}
class Circle extends Shape {
    int radius;
    static final double PI=3.14;
    void getInput(){
        radius = sc.nextInt();
    }
    void calculateArea(){
        area = PI*radius*radius;
    }
}
class Rectangle extends Shape {
    int length,breadth;
    void getInput(){
        length = sc.nextInt();
        breadth = sc.nextInt();
    }
    void calculateArea(){
        area=length*breadth;
    }
}
class Square extends Shape {
    int side;
    void getInput(){
        side=sc.nextInt();
    }
    void calculateArea(){
        area=side*side;
    }
}
public class Betterment {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getInput();
        c.calculateArea();
        c.printArea();
        Rectangle r = new Rectangle();
        r.getInput();
        r.calculateArea();
        r.printArea();
        Square s = new Square();
        s.getInput();
        s.calculateArea();
        s.printArea();
    }
}