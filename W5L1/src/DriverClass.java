import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args)
    {
        Person p1 = new Person(); //first constructor called

        //System.out.println("Person 1: " + p1.name + "\t" + p1.age + "\t" + p1.id);

        System.out.println("Person 1: " + p1.getName() + "\t" + p1.getAge() + "\t" + p1.getId());

        Person p2 = new Person("Ali", 50); //second constructor called

        //System.out.println("Person 2: " + p2.name + "\t" + p2.age + "\t" + p2.id);
        System.out.println("Person 2: " + p2.getName() + "\t" + p2.getAge() + "\t" + p2.getId());

        Person p3 = new Person("Saber", 78, 1998);

        //System.out.println("Person 3: " + p3.name + "\t" + p3.age + "\t" + p3.id);
        System.out.println("Person 3: " + p3.getName() + "\t" + p3.getAge() + "\t" + p3.getId());

        //no need to print like this so many times
        //use a print function

        System.out.println(p1);     //calls toString
        System.out.println(p2);
        System.out.println(p3);


//        //both will point to the same address
//        p1 = p3; //the address will be the same
//        p1.name = "Mahmoud";
//        System.out.println(p1);
//        System.out.println(p3);     //both the names will be Mahmoud



        //same object in different locations, both pointers not pointing to the same location
        //don't do p1=p3 because both have the same location
        //instead do this using the key word new, and create a new object

        //p1 = new Person(p3.name(), p3.name(), p3.id());

        p1 = new Person(p3.getName(), p3.getAge(), p3.getId());

        //p1.name = "Mahmoud";            //here p1 is a separate object, so now p1 and p3 aren't both Mahmoud

        p1.setName("Mahmoud"); //DONE WHEN PRIVATE

        System.out.println(p1);
        System.out.println(p3);




//        int y;
//        System.out.println(y);

        //T OR F, THE OUTPUT WILL BE ZERO
        //ANSWER: you will get an error
        //you need to print it before initialising it

        int y = 0;
        System.out.println(y);

        System.out.println(p1.testValue);
        //from the other class, not in any method, initialized automatically
        //int is 0
        //String is null
        //char is 0 with a slash thingy like a box
        //boolean is false
        //all data types are auto assigned

        System.out.println(p2.balance);     //INITIAL VALUE IS 0

        p1.balance = 1000;                  //VALUE IS 1000
        System.out.println(p1.balance);     //UPDATED BY P1

        System.out.println(p2.balance);     //UPDATED IN P2 AS WELL



//        //not static, so we have to create an object
//        Scanner sc = new Scanner(System.in);
//        sc.nextInt();       //call it using className.methodName
//
//
//        Math.random();
//        Math m = new Math();
        //smth smth


        p1.setBalance(100);        //STATIC, SO WE DONT NEED TO CREATE AN OBJECT




    }
}
