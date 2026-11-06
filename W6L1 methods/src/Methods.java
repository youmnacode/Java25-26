//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Methods {
//    public static void main (String[] args)
//    {
//        Methods m = new Methods();
//
//        int output = m.max(1,5);        //correct if the method is not static

    //if static, no need to make a class object, you can call the method directly
//
//        System.out.println(output);
//    }

    public static /*static*/ int max(int a, int b)
    {
        int result;
        if(a>b)
            result = a;
        else
            result = b;

        return result;

        //the word static is optional in the method
        //max becomes red in the main
        //the code will still run if it is private instead of public if they are in the same file

    }

    public static /*static*/ double max(double a, double b)
    {
        double result;
        if(a>b)
            result = a;
        else
            result = b;

        return result;

        //methods can have the same name, as long as you change something in the heading
        //either change the data type
        //or change the number of parameters
        //this is method overloading
        //more than one method with the same name
        //but something is changed about them

    }
}