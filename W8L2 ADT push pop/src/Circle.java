import static java.lang.Math.PI;

public class Circle extends Shape
{
    private double radius;

    public Circle(String colour, boolean filled, double radius)
    {
        super(colour, filled);  //must be the first line in the constructor
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area()
    {
        return radius*radius*PI;
    }

    public double perimeter()
    {
        return 2*radius*PI;
    }
}
