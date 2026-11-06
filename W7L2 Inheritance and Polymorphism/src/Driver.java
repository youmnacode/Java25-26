public class Driver
{
    public static void main(String[] args)
    {
        BankAccount ba = new BankAccount("Saber" , 0, 12345);

        System.out.println(ba);

        SavingsAccount s = new SavingsAccount("Ali", 0, 1555, 2.5);

        System.out.println(s);

        //if the child doesn't have a toString it just uses the parent one


        BankAccount ba2 = new BankAccount("Saber" , 0, 12345);

        //W8L1

        //we want to check if the values of both the objects are the same
        System.out.println(ba==ba2);
        //should return false because it checks the memory and they point to different locations because they are two separate objects
        //they have different addresses

        System.out.println(ba.equals(ba2));
        //the answer is still false
        //it should return true so why
        //we need to override the equals method
        //so we override the equals method in the class itself
        //now it returns true




        //every class extends the Object class
        //inside the Object class, there is a method toString
        //it is the super parent class

        //private methods in a parent class cannot be overridden in a child class

        //overriding -  new implementation for a method in the subclass
        //VS
        //overloading - methods with the same name but different signatures
        //you can have the same method name but different parameters or variable type (int, double, etc.)

        //when a class is a subclass, they can both have the same name but one will override the other

        //define methods or classes that are not allowed to be overridden

        //final class Math{...}

        //final



    }
}
