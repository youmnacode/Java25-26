public class Rectangle extends Shape
{
    double width;
    double height;

    public Rectangle(String color, double width, double height)
    {
        super(color);

        if(this.width >= 0)
        {
            this.width = width;
        }
        else
        {
            this.width = 1.0;
        }

        if(this.height >= 0)
        {
            this.height = height;
        }
        else
        {
            this.height = 1.0;
        }
    }


    @Override
    public double getArea()
    {
        return width * height;
    }

    @Override
    public String toString()
    {
        return String.format( "Rectangle[color=%s, width=%.2f, height=%.2f, area=%.2f]", getColor(), width, height, getArea() );
    }


}
