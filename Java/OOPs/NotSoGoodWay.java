import java.util.*;
class Circle{
    int radius;
    double area;
    static final double PI=3.14;
    void getRadius(){
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
    }
    void calculateArea(){
        area = PI*radius*radius;
    }
    void printArea(){
        System.out.println("Area of circle:"+area);
    }
}
class Rectangle {
    int length,breadth;
    double area;
    void getLengthAndBreadth(){
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
    }
    void calculateArea(){
        area=length*breadth;
    }
    void printArea(){
        System.out.println("Area of Rectangle:"+area);
    }
}
class Square {
    int side;
    double area;
    void getSide(){
        Scanner sc = new Scanner(System.in);
        side=sc.nextInt();
    }
    void calculateArea(){
        area=side*side;
    }
    void printArea(){
        System.out.println("Area of Square:"+area);
    }
}
public class NotSoGoodWay {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getRadius();
        c.calculateArea();
        c.printArea();
        Rectangle r = new Rectangle();
        r.getLengthAndBreadth();
        r.calculateArea();
        r.printArea();
        Square s = new Square();
        s.getSide();
        s.calculateArea();
        s.printArea();
    }
}