public class Person
        {

            String testValue;      //just to show that not assigned values will have default values


            //WRITING PRIVATE ENSURES ENCAPSULATION
            //WE GET PROBLEMS NOW
            //because in the DriverClass file, we do use p1.name or p2.name
            //we cannot access these from the other file
            //so we have to use methods to access these values
            //get method

            private String name;
            private int age;
            private int id;

            public static int balance = 0;
            //shared among all objects, if you change it in one object, it will change in all of them


//            public void setName (String newName)
//            {
//                name = newName; //updates the name of the person and makes it the new name provided by the person
//            }

            //constructor
            Person()
            {
                //creates a new object and initializes values when not given
                name = "Youmna";
                age = 20;
                id = 1111;
            }

            //parameterized constructor
            Person(String name, int age)
            {
//                name = initialName; //set based on user input
//                age = initialAge;        //also set based on user input

                this.name = name;       //this.name is the variable in the class
                this.age = age;

                id = 1111;       //gives an initial set value
            }

            //parameterized constructor
//            Person(String initialName, int initialAge, int initialID)
//            {
//                name = initialName;
//                age = initialAge;
//                id = initialID;
//
//                //all values set by user
//            }



            //USING THIS
            Person(String name, int age, int id)
            {
//                this.name = name;       //this.name is the variable in the class
//                this.age = age;
                this(name,age); //calls the other constructor

                this.id = id;

                //all values set by user
            }

            //the point is that we can have more than one constructor in a class

            //IDE shortcut
            //right click
            //generate
            //choose constructor/any set/get functions
            //choose which parameters you would like to pass
            //creates constructor/function for you


            public String toString()            //printing method that will print
            {
                return "Person{ " +
                        "name = " + name + '\'' +
                        ", age = " + age +
                        ", id = " + id +
                        '}';

            }

            //when we write s.out.println(p1) it will automatically call toString





            //GET
            public String getName()
            {
                return name;
            }

            public int getAge() {
                return age;
            }

            public int getId() {
                return id;
            }




            //SET
            public void setName(String newName)
            {
                name = newName;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public void setId(int id) {
                this.id = id;
            }


            public void setBalance(int balance)
            {
                this.balance = balance; //FIX IT
            }



            //we can use the same class to create more than one object

//            public static void main(String args[])
//            {
                //Person p1; //c++ way of creating objects

                //in java we need to write new and select one of our constructors

//                Person p1 = new Person(); //first constructor called
//
//                System.out.println("Person 1: " + p1.name + "\t" + p1.age + "\t" + p1.id);
//
//                Person p2 = new Person("Ali", 50); //second constructor called
//
//                System.out.println("Person 2: " + p2.name + "\t" + p2.age + "\t" + p2.id);
//
//                Person p3 = new Person("Saber", 78, 1998);
//
//                System.out.println("Person 3: " + p3.name + "\t" + p3.age + "\t" + p3.id);
//
//                //no need to print like this so many times
//                //use a print function
//
//                System.out.println(p1);     //calls toString
//                System.out.println(p2);
//                System.out.println(p3);
            }
