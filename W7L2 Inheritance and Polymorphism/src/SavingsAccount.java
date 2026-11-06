public class SavingsAccount extends BankAccount
{
    //can inherit from only one class

    private double profitRate;

    SavingsAccount(String name, double balance, int acc_num, double profitRate)
    {
        //super should be the first line inside the constructor

        super(name, balance, acc_num);      //calling the parent constructor

        this.profitRate = profitRate;
    }

    @Override
    public void setBalance(double balance)
    {
        super.setBalance(balance + balance*profitRate);
        //what's the issue

        //unable to do super.balance = balance + balance*profitRate because balance is private

        //we are able to write another setBalance because the method in the main class was not private
    }



    @Override
    public String toString()
    {
        //option 1 : call each value from the parent using get
        //we can access the public methods in the parent class from the child class
        //getName();

        //override - same name as a method in the parent class

        //when running, ignore the one in the parent class and use the one in the child class

        return super.toString() + " profit rate is: " + profitRate + "\n";

        //private only within the class
        //protected only within class and package

        //you can also do
        //return super.toString() + " profit rate is: " + profitRate + "\n";

    }


    public double getProfitRate() {
        return profitRate;
    }
}
