//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cylinder {

        private double radius;
        private double height;

        public Cylinder(double r, double h)
        {
            this.radius = r;
            this.height = h;
        }

        public double getRadius()
        {
            return radius;
        }

        public void setRadius(double radius)
        {
            this.radius = radius;
        }

        public double getHeight()
        {
            return height;
        }

        public void setHeight(double height)
        {
            this.height = height;
        }

        public double getVolume()
        {
            return (Math.PI * radius * radius * height);
        }

        public double getSA()
        {
            return ((2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height));
        }

        @Override
        public String toString()
        {
            return "Cylinder [radius = " + radius +
                    ", height = " + height +
                    "]";
        }
}