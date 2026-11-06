public class InPatient extends Patiente implements Admittable, Monitorable, Insurable, Payable
{
    ///ex2
    private double baseCost;

    public InPatient(String name, double baseCost)
    {
        super(name);

        ///for ex2
        this.baseCost = baseCost;
    }

    public void displayInfo()
    {
        System.out.println("Patient: " + name + " (In-Patient)");
    }

    public void admit()
    {
        System.out.println(name + " has been admitted.");
    }

    public void checkVitals()
    {
        System.out.println(name + "'s vitals are stable.");
    }

    public double applyInsurance()
    {
        return baseCost * 0.3;
        ///this is 30% that the insurance covers
    }

    public double calculateBill()
    {
        return baseCost - applyInsurance();
        ///to get the amount to be paid we subtract the amount covered by insurance from the base cost
    }

    public void payBill(double amount)
    {
        System.out.println(name + " paid: " + amount);
    }
}
