public class DynamicBinding {
    public static void main (String [] args)
    {
        print(new Person()); //print is static so we can call it without making an object
        print(new Student());
        print(new GraduateStudent());

        //dynamic binding
        //object can take more than one form
        //first it acts as a person, then a student, then a graduate student



        //CASTING

        double val = 5.5;
        System.out.println("Val: " + (int)val);
        //casting is the conversion of one data type to another


        //casting objects
        //upcasting and downcasting

        //upcasting
        //animal is parent (some sound)
        //dog is child (bark)
        //when you store dog as an animal in a
        //you cannot access bark, only some sound
    }

    public static void print(Object o)
    {
        System.out.println(o.toString());
    }

}
