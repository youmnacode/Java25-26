public abstract class Patiente
{
    protected String name;

    public Patiente(String name)
    {
        this.name = name;
    }

    public abstract void displayInfo();

    //ex2
    public abstract double calculateBill();
}