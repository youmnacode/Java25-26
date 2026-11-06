import java.util.Scanner;

public class MainDriver
{
    public static void main (String [] args)
    {
        Computer computer1 = new Computer("ali", 4020.50, 2.4, 13, 128);

        Computer computer2 = new Computer();

        Computer computer3 = new Computer("Omar", 10000.25, 4.6, 5, 256);

        System.out.println("The info for computer #1 is: " + computer1.toString());
        System.out.println("The info for computer #2 is: " + computer2.toString());
        System.out.println("The info for computer #3 is: " + computer3.toString());

        Scanner sc = new Scanner(System.in);

        String newName;
        double newCost;
        double newCPU;
        int newAge;
        int newMemory;

        System.out.println("Enter Computer 2 information (name price speed age memory size): ");

        newName = sc.next();
        newCost = sc.nextDouble();
        newCPU = sc.nextDouble();
        newAge = sc.nextInt();
        newMemory = sc.nextInt();

        computer2.setAll(newName, newCost, newCPU, newAge, newMemory);

        System.out.println(computer2.toString());

        System.out.println("The age of Omar's computer in seconds is " + computer3.ageInSeconds());
    }
}
