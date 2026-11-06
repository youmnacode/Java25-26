//Youmna Feroz Khan, U24100333
//Lab 3, Exercise 1



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean found = false;
        int count = 0;

        while(!found)
        {
//            System.out.print("Enter the code: ");
//
//            Scanner sc = new Scanner(System.in);
//            int code = sc.nextInt();

            if(count == 3)
            {
                System.out.println("Access denied! System locked. Please contact security.");
                break;
            }
            else if (count < 3)
            {
                System.out.print("Enter the code: ");

                Scanner sc = new Scanner(System.in);
                int code = sc.nextInt();

                if(code == 2023)
                {
                    System.out.println("Access granted.");
                    found = true;
                    break;
                }
                else
                {
                    System.out.println("Incorrect code! Please try again.");
                    count++;
                }
            }


        }
    }
}