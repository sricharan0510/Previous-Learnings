package PackageB;
import PackageA.*;

public class Sample {
    public static void main(String[] args) {
        AccountHolder a1 = new AccountHolder("Kittu",23);
        a1.addMoney(100000);
        a1.withdrawMoney(50000);
        System.out.println(a1.getName());
        System.out.println(a1.getAccountId());
        System.out.println(a1.getAccountBalance());
    }
}
