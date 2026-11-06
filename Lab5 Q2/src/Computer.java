

public class Computer
{
    private String personName;
    private double cost;
    private double cpuSpeed;
    private int age;
    private int memorySize;

    public Computer()
    {
        //this.setAll(personName, cost, cpuSpeed, age, memorySize);
    }

    double sell()
    {
        if(age > 24)
        {
            cost = cost - (0.50 * cost);
        }
        else
        {
            cost = cost - (0.25 * cost);
        }

        return cost;
    }

    int ageInSeconds()
    {
        //age in months
        //days
        //hours
        //minutes
        //seconds
        return (age * 30 * 24 * 60 * 60);
    }

    public String toString() {
        return  "Name: " + personName +
                " Purchasing Cost: " + cost +
                " Selling Cost: " + sell() +
                " CPU Speed: " + cpuSpeed +
                " Age: " + age + " Months " +
                " Memory Size:" + memorySize;
    }

    void setAll(String personName, double cost, double cpuSpeed, int age, int memorySize)
    {
        this.personName = personName;
        this.cost = cost;
        this.cpuSpeed = cpuSpeed;
        this.age = age;
        this.memorySize = memorySize;

//        this.personName = "";
//        this.cost = 0;
//        this.cpuSpeed = 0;
//        this.age = 0;
//        this.memorySize = 0;
    }

    public Computer(String personName, double cost, double cpuSpeed, int age, int memorySize)
    {
        this.setAll(personName, cost, cpuSpeed, age, memorySize);
    }
}