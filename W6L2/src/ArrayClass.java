import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayClass {
    public static void main(String[] args) {
        int [] a = new int [5];
        int [] b = new int []{1,2,3,4,5};
        int [] c = {1,2,3,4,5};

        System.out.println("Are b and c equal? They are both 1,2,3,4,5 but are they equal? " + (b==c));
        //returns false
        //because it checks the reference or location inside the memory
        //NOT the values

        //you cannot do
        //int []c;
        //c = {1,2,3,4,5};

        //generate some random values from 0-100 in an array

        int [] d = new int[5];

        for(int i = 0; i < d.length; i++)
        {
            d[i] = (int)(Math.random() * 100);
            //the class random returns double
            //but d is int
            //so we need to either make d double
            //or cast this value to int
        }

//        //now print the array
//        for(int i = 0; i < a.length; i++)
//        {
//            System.out.print(a[i] + "\t");
//        }
//        System.out.println();
//
//        for(int i = 0; i < b.length; i++)
//        {
//            System.out.print(b[i] + "\t");
//        }
//        System.out.println();
//
//        for(int i = 0; i < c.length; i++)
//        {
//            System.out.print(c[i] + "\t");
//        }
//        System.out.println();
//
//        for(int i = 0; i < d.length; i++)
//        {
//            System.out.print(d[i] + "\t");
//        }
//        System.out.println();

        //instead of repeating the print so many times, we can just put it in a method

        ArrayClass s = new ArrayClass();        //needs to be done because the method print is not static
        s.print(a);
        s.print(b);
        s.print(c);
        s.print(d);

        double [] e = new double[5];

        for(int i = 0; i < e.length; i++)
        {
            e[i] = Math.random() * 1000;
        }

        s.print(e);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        //simplifies the whole thing into one line



        //CHECK IF THEY ARE IDENTICAL OR NOT

        boolean same = true;

        if(b.length == c.length)
        {
            for(int i = 0; i < b.length; i++)
            {
                if(b[i] != c[i])
                {
                    same = false;
                    break;
                }
                break;
            }
        }
        else
        {
            same = false;
        }
        System.out.println(same);
        //just check the size of both and if they are not equal they are not the same

        System.out.println(Arrays.compare(b,c));
        //simplifies the whole thing into one line



        //FIND MAX VALUE IN AN ARRAY
        int maxVal = b[0];
        for(int i = 1; i < b.length; i++)
        {
            if(b[i] > maxVal)
            {
                maxVal = b[i];
            }
        }
        System.out.println("\nThe maximum value in array b is " + maxVal);

        //to find the average, do the sum for loop and in the end divide by length


        double [] f = new double[5];
//
//        for(int i = 0; i < f.length; i++)
//        {
//            f[i] = e[i];
//        }
//
//        s.print(f);
        System.arraycopy(e, 2,f,0,3);

        //Arrays.copyOf()   //does the same thing



            //Person [] pArray = new Person();

    }
    //we cannot have a method inside a method
    //we can have multiple methods in a class

    public void print(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        //not static so we need to create an object of the class to call the method
    }


    public void print(double[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        //not static so we need to create an object of the class to call the method
    }


}