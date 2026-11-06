public class Driver {
    public static void main (String[] args)
    {
        Methods m = new Methods();

        int output = m.max(1,5);

        System.out.println(output);

        //we put the main method here instead of them both being in the same file
        //if the method was private we could not access it from here


        int [] a = new int [5];

        a[0] = 1;
        a[1] = 20;
        a[2] = 3;

        for(int i = 0; i < a.length;i++)
        {
            System.out.println(a[i]);
        }

        int [] b = new int []{10, 30, 50, 60};

        //System.out.println(b[4]);   //this is actually the 5th number,
                                    //in c++ it would print some random values
                                    //in java the program will not run because array index out of bounds

    }

}
