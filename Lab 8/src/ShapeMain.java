import java.util.Scanner;
public class ShapeMain
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        //rectangle part
        System.out.println("--- Rectangle ---");

        System.out.print("Enter color: ");
        String col = sc.next();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();




        //square part
        System.out.println("\n--- Square ---");

        System.out.print("Enter color: ");
        String sqCol = sc.next();

        System.out.print("Enter side: ");
        double side = sc.nextDouble();

        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(col, w, h);
        shapes[1] = new Square(sqCol, side);


        //all shapes part
        System.out.println("\n=== All Shapes ===");

//        for (Shape shape : shapes) {
//            System.out.println(shape);
//            System.out.printf("Area: %.2f\n", shape.getArea());
//        }
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            System.out.printf("Area: %.2f\n", shapes[i].getArea());
        }
    }
}
