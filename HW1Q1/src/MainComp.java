import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainComp {
    public static void main(String[] args) {
        double a, b, c;

        System.out.print("Enter three numbers");

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double roundedA, roundedB, roundedC;

        roundedA = Math.round( a * 1000 ) / 1000.0;
        roundedB = Math.round( b * 1000 ) / 1000.0;
        roundedC = Math.round( c * 1000 ) / 1000.0;



        //part 1 - are they the same when they are rounded

        if(roundedA == roundedB && roundedB == roundedC)
        {
            System.out.println("All three numbers are the same when rounded to three decimal places.");
        }
        else
        {
            System.out.println("The numbers are different when rounded to three decimal places.");
        }


        //part 2 - determine max diff

        double diff1, diff2, diff3;

        diff1 = Math.abs(a - b);
        diff2 = Math.abs(a - c);
        diff3 = Math.abs(b - c);

        //check which one is the largest using max or if statements
        double maxDiff = Math.max(diff1, Math.max(diff2 , diff3));

//        double maxDiff = diff1;
//
//        if(diff2 > diff1)
//        {
//            maxDiff = diff2;
//        }
//        else if (diff3 > diff1)
//        {
//            maxDiff = diff3;
//        }


        if(maxDiff < 0.001)
        {
            System.out.println("The difference between the numbers is less than 0.001.");
        }
        else
        {
            System.out.println("The difference between the numbers is greater than 0.001.");
        }
    }
}