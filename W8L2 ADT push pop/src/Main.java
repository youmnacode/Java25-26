import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        st.pop();

        //Shape s1 = new Shape("yellow", false);
        Shape s1 = new Circle("yellow", false, 5);

        Shape s2 = new Rectangle("red", true, 4, 6);

        double s1Area = s1.area();
        double s2Area = s2.area();

        /// not allowing me to call area
        /// they are defined using shape and shape does not have area
        /// make abstract class in shape
        /// you can no longer create Shape classes because shape is now an abstract class
        /// Shape objects cannot be instantiated



        /// can we create an object of the interface?
        /// no

        BMWCar bmw = new BMWCar();
        bmw.drive();
        bmw.stop();
        bmw.wakeMeUp();
    }
}