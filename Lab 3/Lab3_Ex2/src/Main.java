//Youmna Feroz Khan, U24100333, Lab 3 Ex2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter the number of pentagons: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double area = 0;

        double total_area = 0;

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter the side length of pentagon " + (i+1) + ": ");

            Scanner sc2 = new Scanner(System.in);
            double len = sc2.nextDouble();

            area = ((double) 1/4) * Math.sqrt( (5* (5 + (2*Math.sqrt(5))) )) * Math.pow(len,2);

            total_area = total_area + area;
        }

        System.out.printf("The total area of the pentagons is: %.2f" , total_area);

    }
}