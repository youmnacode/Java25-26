public class Driver {
    public static void main(String [] args)
    {
        Animal a = new Dog();

        a.sound();
        //a.bark();       //cannot

        Animal b = new Animal();

        Dog d = (Dog)b;
        d.sound();

        //can access





        Animal[] array = new Animal [5];

        for(int i = 0; i <5; i++)
        {
            int val2 = (int)(Math.random()*3);

            if(val2 == 0)
            {
                array[i] = new Animal();
            }
            else if(val2 == 1)
            {
                array[i] = new Dog();
            }
            else if(val2 == 2)
            {
                array[i] = new Cow();
            }
        }

        //for(animal a1: array)
        for(int i = 0; i < 5; i++)
        {
            if(array[i] instanceof Cow) //start the condition with the sub class because otherwise it will print the parent class
            {
                System.out.println("This is a cow");
            }
            if(array[i] instanceof Dog) //start the condition with the sub class because otherwise it will print the parent class
            {
                System.out.println("This is a dog");
            }
            if(array[i] instanceof Animal) //start the condition with the sub class because otherwise it will print the parent class
            {
                System.out.println("This is an animal");
            }
        }



        for(Animal a1 : array)
        {
            if(a1 instanceof Cow)
            {
                System.out.println("This is a cow");
            }
            if(a1 instanceof Dog)
            {
                System.out.println("This is a dog");
            }
            if(a1 instanceof Animal)
            {
                System.out.println("This is an animal");
            }
        }
    }
}
