import java.util.Objects;

public class BankAccount extends Object
{
    private String name;
    private double balance;
    private int acc_num;

    public BankAccount(String name, double balance, int acc_num)
    {
        this.name = name;
        this.balance = balance;
        this.acc_num = acc_num;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }


    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", acc_num=" + acc_num +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getAcc_num() {
        return acc_num;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }



    //HERE EQUALS

    @Override
    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        BankAccount that = (BankAccount) o;
//        return Double.compare(balance, that.balance) == 0 && acc_num == that.acc_num && Objects.equals(name, that.name);

        BankAccount that = (BankAccount) o;     //CASTING

        if(this.acc_num == that.acc_num && this.name == that.name && this.balance == that.balance)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


//  not included
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, balance, acc_num);
//    }
}