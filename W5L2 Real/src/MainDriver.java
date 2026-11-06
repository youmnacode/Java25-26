import java.util.Random;

public class MainDriver {
    public static void main(String[] args)
    {
        Birthday p1_birthday = new Birthday(1,1,2000);

        Person p = new Person(1, "Mona", 21, p1_birthday);

        p1_birthday.setYear(2010);

        System.out.println(p);

        //why do we usually not define strings using the syntax we use while
        //making a new object?
        String name1 = new String("Saber");     //no error
        String name2 = "Saber";        //no error
        //String is used commonly, so this is an exception ig


        //Random rand = new Random();

        //rand.nextDouble();

        //use either this or Math.random()



    }
}
