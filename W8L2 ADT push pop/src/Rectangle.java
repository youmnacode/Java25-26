public class Rectangle extends Shape
{
    private double width, height;

    public Rectangle(String colour, boolean filled, double width, double height)
    {
        super(colour, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area()
    {
        return width*height;
    }

    public double perimeter()
    {
        return 2*(width+height);
    }
}
