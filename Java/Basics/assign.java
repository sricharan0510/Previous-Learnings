public class assign {
    public static void main(String[] args) {
        int a = 10,b = 20,c = 30;
        a+=b;
        b+=c;
        c+=a;
        a*=c;
        b^=a;
        System.out.printf("%d\n%d\n%d",a,b,c);
    }
}
