
class Student1 {
    String name;
    int age;
    char gender;
    String college;
    String branch;
    Student1(String n,int a,char g) {
        this.name  = n;
        this.age=a;
        this.gender=g;

    }
    Student1 (String n,int a,char g,String c,String b) {
        this(n, a, g);
        this.college=c;
        this.branch=b;
    }
    void print() {
        System.out.println(this);
    }
}

public class ex9 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("xyz", 18, 'm');
        System.out.println(s1);
        s1.print();
    }
}
