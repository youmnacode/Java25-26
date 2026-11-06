//
//
//
//
//
//public class Person
//{
//    String name;
//    int age;
//    int id;
//
//    void setName(String newName)
//    {
//        name = newName; //updates the name of the person and makes it the new name provided by the person
//    }
//
//    //constructor
//    Person()
//    {
//        //creates a new object and initializes values when not given
//        name = "Youmna";
//        age = 20;
//        id = 1111;
//    }
//
//    //parameterized constructor
//    Person(String initialName, int initialAge)
//    {
//        name = initialName; //set based on user input
//        age = initialAge;        //also set based on user input
//
//        id = 1111;       //gives an initial set value
//    }
//
//    //parameterized constructor
//    Person(String initialName, int initialAge, int initialID)
//    {
//        name = initialName;
//        age = initialAge;
//        id = initialID;
//
//        //all values set by user
//    }
//
//    //the point is that we can have more than one constructor in a class
//
//    //IDE shortcut
//    //right click
//    //generate
//    //choose constructor/any set/get functions
//    //choose which parameters you would like to pass
//    //creates constructor/function for you
//
//
//    public String toString()
//    {
//
//    }
//
//
//
//
//
//    //we can use the same class to create more than one object
//
//    public static void main(String args[])
//    {
//        //Person p1; //c++ way of creating objects
//
//        //in java we need to write new and select one of our constructors
//
//        Person p1 = new Person(); //first constructor called
//
//        System.out.println("Person 1: " + p1.name + "\t" + p1.age + "\t" + p1.id);
//
//        Person p2 = new Person("Ali", 50); //second constructor called
//
//        System.out.println("Person 2: " + p2.name + "\t" + p2.age + "\t" + p2.id);
//
//        Person p3 = new Person("Saber", 78, 1998);
//
//        System.out.println("Person 3: " + p3.name + "\t" + p3.age + "\t" + p3.id);
//
//        //no need to print like this so many times
//        //use a print function
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//    }
//}