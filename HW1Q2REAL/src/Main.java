import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String sentence = "";       //will sotre the sentence
        boolean valid = false;

        Scanner sc = new Scanner(System.in);

        //PART A

        while(!valid)       //valid is true, stop when a valid sentence is entered
        {
            System.out.print("Enter sentence with at least 6 words and ending with '!': ");

            sentence = sc.nextLine();

            int wordCount = 0;
            boolean insideWord = false;     //tells us whether we are inside a word or not

            for(int i = 0; i < sentence.length(); i++)
            {
                if(sentence.charAt(i) != ' ' && !insideWord)
                {
                    wordCount++;        //we found a new word
                    insideWord = true;      //we are inside it
                }

                if(sentence.charAt(i) == ' ')
                {
                    insideWord = false;     //we are at the end of the word
                }
            }

            //check the conditions for the sentence

            int len_before_end = sentence.charAt(sentence.length() - 1);

            if(wordCount >= 6 && len_before_end == '!')
            {
                valid = true;       //the sentence is valid and we exit the main while loop
            }
            else
            {
                System.out.println("Invalid input. Make sure it has at least 6 words and ends with '!'.");
            }
        }

        int k = 0;      //char in the word to be reversed

        System.out.print("Enter k (k > 5) to reverse the k-th word: ");
        k = sc.nextInt();

        int start = 0;      //start of word
        int end = 0;        //end of word
        int wordIndex = 1;      //word count
        int length = sentence.length();

        for(int i = 0; i <= length; i++)        //go through every character in the sentence and use <= to detect the last word
        {
            if(i == length || sentence.charAt(i) == ' ') {
                //we are at the end of the final word, or we are at the end of any word (we found a space)

                end = i;    //the index of the end of the word

                if (wordIndex == k)     //did we find the kth word?
                {
                    String k_word = sentence.substring(start, end);       //we extract the kth word using substring
                    String reversed_k = "";

                    for(int j = k_word.length() - 1; j >= 0; j--)       //backwards loop through the word
                    {
                        reversed_k = reversed_k + k_word.charAt(j);
                    }

                    sentence = sentence.substring(0,start) + reversed_k + sentence.substring(end);

                    //this rebuilds the sentence
                    // part1 - everything before the word
                    // part 2 - the reversed kth word
                    // part 3 - everything after the word

                    break;
                }

                wordIndex++;    //move to next word
                start = i + 1;  //start now for the next word
            }
        }

        //replacing ! with $ sign

        sentence = sentence.substring(0, sentence.length() - 1) + "$";

        //btw we use length() - 1 becuase the indexes start at 0


        //swapping uppercase and lowercase

        String swapped = "";

        for(int i = 0; i < sentence.length(); i++)
        {
            String s = sentence.substring(i, i + 1); //just one char

            if(s.equals(s.toLowerCase()))
            {
                swapped = swapped + s.toUpperCase();
            }
            else
            {
                swapped = swapped + s.toLowerCase();
            }
        }


        //removing all spaces

        String finalSentence = "";

        for(int i = 0 ; i < swapped.length(); i++)
        {
            if(swapped.charAt(i) != ' ')
            {
                finalSentence = finalSentence + swapped.charAt(i);
            }
        }

        System.out.println("Modified message: " + finalSentence);




        //part b

        char repeat = 'y';

        while(repeat == 'y' || repeat == 'Y')
        {
            System.out.println("\n=== Part B: Math Calculations ===");
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Absolute value (abs)");
            System.out.println("6. Power (^)");
            System.out.println("7. Rounding (round to decimals)");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            int choice = sc.nextInt();

            double x, y;

            switch(choice)
            {
                case 1:
                    System.out.print("Enter the first number: ");
                    x = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    y = sc.nextDouble();
                    System.out.println("Result = " + (x + y));
                    break;

                case 2:
                    System.out.print("Enter the first number: ");
                    x = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    y = sc.nextDouble();
                    System.out.println("Result = " + (x - y));
                    break;

                case 3:
                    System.out.print("Enter the first number: ");
                    x = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    y = sc.nextDouble();
                    System.out.println("Result = " + (x * y));
                    break;

                case 4:
                    System.out.print("Enter the first number: ");
                    x = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    y = sc.nextDouble();
                    System.out.println("Result = " + (x / y));
                    break;

                case 5:
                    System.out.print("Enter the number: ");
                    x = sc.nextDouble();
                    System.out.println("Result = " + Math.abs(x));
                    break;

                case 6:
                    System.out.print("Enter the first number: ");
                    x = sc.nextDouble();
                    System.out.print("Enter the second number: ");
                    y = sc.nextDouble();
                    System.out.println("Result = " + Math.pow(x,y));
                    break;

                case 7:
                    System.out.print("Enter the number: ");
                    x = sc.nextDouble();
                    System.out.print("Enter the number of decimal places you want it to be rounded to: ");
                    y = sc.nextDouble();
                    double p = Math.pow(10,y);
                    double number = Math.round(x*p)/p;
                    System.out.println("Result = " + number);
                    break;

                case 8:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }


            System.out.print("Do you want to do another calculation (y/n): ");

            repeat = sc.next().charAt(0);
        }

        System.out.println("Program ended.");

    }
}