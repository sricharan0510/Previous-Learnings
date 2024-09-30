class Farm
{
    int len;   //instance variable
    int wid;
    int getArea() {
        return len*wid;
    }
    int getPerim() {
        return 2*(len+wid);
    }
    //Setting values;
    void setValues(int l,int w) {
        l=len;
        w=wid;
    }
}
public class ex1 {
  public static void main(String[] args) {
    //creating a object to a class
    Farm f1 = new Farm();
    System.out.println(f1 instanceof Farm);
    // f1.len = 10;
    // f1.wid = 20;
    f1.setValues(10,20);
    System.out.println(f1.len);
    System.out.println(f1.wid);
    System.out.println(f1.getArea());
    System.out.println(f1.getPerim());
  }
}