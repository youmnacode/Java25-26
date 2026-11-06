/*
* This class is for W2L3
* It is about strings and other stuff
*
* @author: youmna
*
 */

public class W2L3
{
    public static void main(String[] args)
    {
        //DOUBLE VS. FLOAT

        double a = 0.5555555555176876871;
        System.out.println(a);

        float b = 0.55555176876871f; //add an f in the end
        System.out.println(b);






        //STRINGGGG

        String text = "Hello Everyone";

        //GET LENGTH

            System.out.println(text.length());
            //we have a function called length() and it does not take any parameters
            // but returns the length of the string


        //GET THE CHARACTER IN A CERTAIN LOCATION

            System.out.println(text.charAt(0));
            //returns the char at the specified location


        //CHECK IF THE STRING HAS A SPECIFIC CHARACTER

            System.out.println(text.contains("E"));

            //returns "true"
            //done in only one line, unline c++, where we use a for loop



        //CHECK IF MORE THAN ONE CHARACTER IS WITHIN THE STRING

            System.out.println(text.contains("Saber"));

            //returns false


        //CONVERT THE GIVEN TEXT TO LOWERCASE
            System.out.println(text.toLowerCase());



        //TO UPPERCASE
        System.out.println(text.toUpperCase());


        //REPLACE LETTER e with !!!

        System.out.println(text.replace(" ", "!!!"));
        System.out.println(text.replace("ello", "yyyyyyyy"));



        //CHECK IF THE FIRST STRING AND THE SECOND STRING ARE THE SAME

        //IN C++ we would check the size first and if they are different we would stop
        //if not we would continue and check each letter in each index

        System.out.println(text.equals("Saber"));
        //returns false
        //this is case sensitive

        //if we don't care about whether or not they are lowercase,
        //we convert both to upper or both to lower and then check equals
        //or we can do equalsIgnoreCase

        System.out.println(text.equalsIgnoreCase("Hello EVERYONE"));




        //DOING THIS DOES NOT CHANGE THE ORIGINAL TEXT VARIABLE
        System.out.println(text);
        //prints the original

//        text = text.replace(" ", "!!!");
//        System.out.println(text);
//        //returns updated text

        //CHECKS IF EMPTY
        System.out.println(text.isEmpty());
        //returns false



        //STARTING FROM THE ENTERED INDEX, TAKE A SUBSET OF THE STRING

        System.out.println(text.substring(1));
        //returns ello Everyone

        System.out.println(text.substring(1, 5));
        //returns ello



        System.out.println( (8 / 2) + 7 * 2 - (10 / 2) + (8 % 3) );


        //DATA TYPE NAME CONVERSION

        System.out.println( (int) (7.9 + 6.7) );          //14

        System.out.println( (int) (7.9) + (int) (6.7) );  //13


        //System.out.println(1/0); //runtime error

        int cc = 032;
        System.out.println(cc);

        //logical error

        //outputs 26 instead of 032
        //if you start an INT with 0 in java, that number is in the octal system
        //simply converts the int from octal to decimal
        //if we want to store a number that starts with a zero, we can store it as a string or just don't put a 0 in the beginning

    }
}
