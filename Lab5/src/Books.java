//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Books {

    private String name;
    private String ID;
    private int count;
    private double amount;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public String getName()
    {
        return name;
    }

    public String getID()
    {
        return ID;
    }

    public int getCount()
    {
        return count;
    }

    public double getAmount()
    {
        return amount;
    }

    public Books(String name, String ID, int count, double amount)
    {
        this.name = name;
        this.ID = ID;
        this.count = count;
        this.amount = amount;
    }

    public void buyMoreBooks(int num, double cost)
    {
        this.count = this.count + num;
        this.amount = this.amount + cost;
    }

    public void sellBooks(int num, double cost)
    {
        this.count = this.count - num;
        this.amount = this.amount - cost;
    }



    public static void main(String [] args)
    {
        Books b1 = new Books("Ali", "u202110324", 2, 345.0);

        System.out.println("Name: " + b1.getName() + ", id " + b1.getID() + ", number of Books: " + b1.getCount() + ", Cost " + b1.getAmount());

        int booksBought = 3;
        double amt_books_bought = 700.0;

        b1.buyMoreBooks(booksBought,amt_books_bought);

        System.out.println("The info after buying " + booksBought + " more books for AED " + amt_books_bought + " is: Name: " + b1.getName() + ", id " + b1.getID() + ", number of Books: " + b1.getCount() + ", Cost " + b1.getAmount());

        int books_sold = 2;
        double amt_books_sold = 345.0;

        b1.sellBooks(books_sold, amt_books_sold);

        System.out.println("The info after selling " + books_sold + " books for AED " + amt_books_sold + " is: Name: " + b1.getName() + ", id " + b1.getID() + ", number of Books: " + b1.getCount() + ", Cost " + b1.getAmount());

    }
}
