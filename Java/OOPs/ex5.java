
class Persons {
    String name;
    int age;
    char gender;
    void printDetails () {
        System.out.println("name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("gender is : "+gender);
        System.out.println();
    }
    //Default or no-arg Constructor
    // Persons() {
    //     System.out.println("This is Constructor!");
    // }
    
    Persons(String n,int a,char g) {
        name=n;
        age=a;
        gender=g;
    }
}

public class ex5 {
    public static void main(String[] args) {
        // Persons p1 = new Persons();
        // p1.name="Sricharan";
        // p1.age=18;
        // p1.gender='m';
        // p1.printDetails();
        // Persons p2 = new Persons();
        // p2.name="Yogi";
        // p2.age=18;
        // p2.gender='f';
        // p2.printDetails();
        Persons p1 = new Persons("Sricharan",18,'m');
        p1.printDetails();
        Persons p2 = new Persons("Yogi",18,'f');
        p2.printDetails();
    }
}
