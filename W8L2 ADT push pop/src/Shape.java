public abstract class Shape
{
    private String colour;
    private boolean filled;

    /// recommended to define the constructor of the abstract class as protected
    /// because you can't create an object of an abstract class anyway
    public Shape(String colour, boolean filled)
    {
        /**
         * this is a better way of writing comments
         */
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }

    public abstract double area();

    public abstract double perimeter();

    /// now you have to put abstract in the class declaration
    /// these abstract methods (the ones in the parent) must be in all the child classes

    /// we cannot have an abstract and static method
    /// we cannot have an abstract constructor of course
}
