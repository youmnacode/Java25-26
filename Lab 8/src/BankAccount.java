public class BankAccount
{
    private double balance;
    private String ownerName;

    public BankAccount()
    {
        this.balance = 0.0;
        this.ownerName = "";
    }

    public BankAccount(String ownerName, double balance)
    {
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        if(balance >= 0.0)
        {
            this.balance = balance;
        }
        else
        {
            this.balance = 0.0;
        }
    }

    public String getOwnerName()
    {
        return ownerName;
    }

    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            this.balance += amount;
        }
    }

    public void withdraw(double amount)
    {
        if(this.balance >= amount)
        {
            this.balance -= amount;
        }
    }

//    @Override
//    public String toString()
//    {
//        return "Account ["
//                + ownerName +
//                ", $"+ balance +
//                "]";
//    }

    /**
     * this doesn't work because you don't get decimal places
     */

    @Override
    public String toString()
    {
        return String.format("Account[%s, $%.2f]", ownerName, balance);
    }
}