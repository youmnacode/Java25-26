import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double rad = sc.nextDouble();

        System.out.print("Enter height: ");
        double hei = sc.nextDouble();

        Cylinder cyl = new Cylinder(rad, hei);

        System.out.print("Enter new radius: ");
        double newRad = sc.nextDouble();
        cyl.setRadius(newRad);

        System.out.println("\nCylinder Details");
        System.out.println(cyl.toString());

        System.out.printf("Surface Area = %.2f\n", cyl.getSA());

        System.out.printf("Volume = %.2f\n", cyl.getVolume());
    }
}
