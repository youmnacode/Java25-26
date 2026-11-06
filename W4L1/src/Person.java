import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Person {
    public static void main(String[] args) {

        String text = "Hello everyone!";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'e') {
                System.out.println("Location is " + i);
                break;
            }
        }

        //do this without for loop
        text.indexOf('e');          //returns the index/location of the letter e inside the text


        String s = "Saber Elsayed";

        //find the last small e
        System.out.println(s.lastIndexOf('e'));
        //if the text does not contain any e the output will be -1



        //how to put val from one string into another

//        String output = "";
//
//        for (int i = 0; i < text.length(); i++)
//        {
//            output = text.charAt(i);
//        }

        //ALT
        System.out.println(text.substring(4)); //from this loc to the end

        //THE SAME FUNCTION CAN ACCEPT TWO VARIABLES
        System.out.println(text.substring(4,8));

        //does not include the 8th location
        //stops at the 7th

        //the equals function works only with string
        //does not work with integer values
        //for int use ==

        System.out.println(text.startsWith("Ev"));

        //T OR F //returns false because it starts with Hello...
        //checks if the text inside the string starts with Ev or not

        System.out.println(text.endsWith("ne!"));
        //returns true





        //how do I write a java program that asks the user for their first and last name separated by a space,
        //and then extracts the first and last names using string functions,
        //don't give me the code, just the algorithm

        //ask user to enter their name
        System.out.println("Please enter your name: ");

        //store in a var
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();


        //locate the location of the space
        int location = name.indexOf(' ');

        //fn is the substring from 0 to rhe loc of the space
        System.out.println("The first name is: " + name.substring(0, location));

        //the ln is the substring from the loc after the space until the end
        System.out.println("The last name is: " + name.substring(location + 1));




        double yy = 5.5;
        int yInt = (int)yy;

        String value1 = "50";       //if these are double stored as strings, simply use Double.parseDouble(value1)
        String value2 = "150";

        String v1 = "50.5";
        String v2 = "150.7";

        //how can we find the sum of these int values that are stored as strings

        //int total = (int)value1 + (int)value2; //WE CANNOT DO THIS

        int total = Integer.parseInt(value1) + Integer.parseInt(value2);

        //Integer is a class
        //we need to parse/convert it into an integer using the parseInt function

        //same w double if we had decimal point values in value1 and value2
        double total2 = Double.parseDouble(v1) + Double.parseDouble(v2);

        System.out.println(total);

        System.out.println(total2);






        double a = 1.23456789;

        System.out.printf("%.3f" , a);
        System.out.println();

        //in printf we use comma instead of plus
        //% declaration
        //. means decimal
        //3 means 3 places
        //f means float
        //ROUNDS TO 3 DP

        //the number of variables that will be printed is the number of %

        double b = 4.5321;
        System.out.printf("%.3f %.1f", a, b);
        System.out.println();



        //CHECK IF A STRING IS A PALINDROME

        //ask user to enter a word
        System.out.println("Please enter the word: ");

        //store the word
        String word = input.nextLine().replace(" ", ""); //READ AND REPLACE IN ONE LINE
                                                                          //MULTIPLE FUNCTIONS IN ONE LINE

        //reverse it
        String reversedWord = "";

        for(int i = word.length() - 1; i >= 0 ; i--)
        {
            reversedWord += word.charAt(i);
        }
        //compare both words

        System.out.println(word.equalsIgnoreCase(reversedWord));



    }

//    public static class MainDriver {
//        public static void main(String [] args)
//        {
//            //Person p = new Person(1, "Mona", 21);
//
//            //System.out.println(p);  //same as toString
//        }
//    }
}