package PackageA;

public class Main {
    public static void main(String[] args) {
        AccountHolder a1 = new AccountHolder("Sricharan",4223);
        a1.addMoney(100000);
        a1.addMoney(200000);
        a1.withdrawMoney(40000);
        System.out.println(a1.getName());
        System.out.println(a1.getAccountBalance());
    }
}