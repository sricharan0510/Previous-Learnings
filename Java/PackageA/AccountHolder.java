package PackageA;

public class AccountHolder {
    private String name;
    private int accountId;
    private int accountBalance;
    public AccountHolder(String n,int aid)
    {
        name = n;
        accountId = aid;
    }
    public void addMoney(int moneyToBeAdded)
    {
        System.out.println("Deposited Successful");
        accountBalance+=moneyToBeAdded;
    }
    public void withdrawMoney(int monetToBeWithdraw)
    {
        if(monetToBeWithdraw>accountBalance)
        {
            System.out.println("Insufficient Funds");
        }
        else {
            System.out.println("Withdraw Successful");
            accountBalance-=monetToBeWithdraw;
        }
    }
    public String getName() {
        return name;
    }
    public int getAccountId() {
        return accountId;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
}
