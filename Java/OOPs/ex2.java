

class Person {
    String name;
    int age;
    String gender;
    double height;
    boolean martialStatus;
    void printDetails() {
        System.out.println("I am "+name+" and "+age+" years old");
    }
    void setValues(String n,int a,String g,double  h,boolean m) {
        name=n;
        age=a;
        gender=g;
        height=h;
        martialStatus=m;
    }
}
public class ex2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setValues("Kittu", 18, "Male", 5.8, false);
        p.printDetails();
    }
}