

class Per {
    String name;
    int age;
    char gender;
    public String toString() {
        return (name+" "+age+" "+gender);
    }
    Per() {}
    Per(String n) {
        name=n;
    }
    Per(String n,int a) {
        name=n;
        age=a;
    }  
    Per(String n,int a,char g) {
        name=n;
        age=a;
        gender=g;
    }
    
}

public class ex8 {
    public static void main(String[] args) {
        Per p1 = new Per();
        System.out.println(p1);
        Per p2 = new Per("Sricharan");
        System.out.println(p2);
        Per p3 = new Per("Sricharan", 18);
        System.out.println(p3);
        Per p4 = new Per("Sricharan", 18, 'm');
        System.out.println(p4);
    }
}
