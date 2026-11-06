public class SavingsAccount extends BankAccount
{
    private double profitRate;

    public SavingsAccount( String ownerName, double balance, double profitRate)
    {
        super(ownerName, balance);

        if(profitRate >= 0)
        {
            this.profitRate = profitRate;
        }
        else
        {
            this.profitRate = 1.0;
        }
    }

    public void applyProfit()
    {
        double bal = this.getBalance();

        bal = bal * profitRate / 100;

        deposit(bal);
    }

//    @Override
//    public String toString()
//    {
//        return "Savings [" +
//                getOwnerName() +
//                ", $" +
//                getBalance() +
//                ", rate = " + profitRate +
//                "]";
//    }

    /**
     * again this gives only 1 dp instead of 2
     */

    @Override
    public String toString()
    {
        return String.format("Savings[%s, $%.2f, rate=%.2f%%]", getOwnerName(), getBalance(), profitRate);
    }
}
