import java.util.*;
public class W2L4{

    public static void main(String[] args)
    {
//        int mark = 65;
//
//        if(mark >= 65)
//        {
//            System.out.println("Pass");
//        }
//        else
//        {
//            System.out.println("fail");
//        }
//
//        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the mark: ");
//
//        int mark2 = sc.nextInt();
//
//        if(mark2 >= 90)
//        {
//            System.out.println("A");
//        }
//        else if(mark2 >= 80)
//        {
//            System.out.println("B");
//        }
//
//
//
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Enter an option");
//        int option = sc2.nextInt();
//
//        switch(option)
//        {
//            //if we want to do case 0 and case 1
//
//            case 0: //they will both do the same thing
//
//            case 1: System.out.println("Hello"); break;
//
//            case 2: System.out.println("Hello Hello"); break;
//
//            default:System.out.println("Wrong option");
//        }
//


        //FOR

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Hello" + i);

            //output until 99
        }


        int k = 1000;
        while(k<100)
        {
            //wtv
            System.out.println(k);
            //nothing is printed because the condition is checked before the loop iterates
            //we can put conditions like while i is positive
            k++;
        }

        int j = 1000;
        do
        {
            //we want at least one iteration
            System.out.println(j);
            //prints although j does not satisfy the condition
            //wtv
            j++;
        }
        while(j<100);


        //exercise:
        //calculate the sum of the first n numbers
        //n entered by the user
        //use for, while, and do while

        int total_for = 0;

        for(int i = 0; i < 5; i++)
        {
            total_for = total_for + i;
        }

        System.out.println(total_for);




        int total_while = 0;
        int i = 0;
        while(i<5)
        {
            total_while += i;

            i++;
        }
        System.out.println(total_while);
    }
}