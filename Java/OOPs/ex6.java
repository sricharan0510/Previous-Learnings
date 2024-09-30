
class Student {
    int id;
    String name;
    String college;
    String branch;
    Student(int i,String n,String c,String b) {
        id=i;
        name=n;
        college=c;
        branch=b;
    }
    void printDetails() {
        System.out.println("Roll Number: "+id);
        System.out.println("Name: "+name);
        System.out.println("College: "+college);
        System.out.println("Branch: "+branch);
        System.out.println();
    }
}

// public class ex6 {
//     public static void main(String[] args) {
//         Student1 s1 = new Student1(23, "Sricharan" , "ACOE","CSE-Ai&Ml");
//         s1.printDetails();
//         Student1 s2 = new Student1(53, "Yogi" , "KU","ECE");
//         s2.printDetails();
//     }
// }
