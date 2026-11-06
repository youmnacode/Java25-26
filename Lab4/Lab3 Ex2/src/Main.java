import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str;
        char letter;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your sentence: ");
        str = sc.nextLine().toLowerCase();

        System.out.print("Enter a letter: ");
        String temp = sc.nextLine().toLowerCase();
        letter = temp.charAt(0);

        int count = 0;

        for(int i = 0; i < str.length(); i++)
        {
                if(str.charAt(i) == letter )
                {
                    count++;
                }

        }

        if(count == 0)
        {
            System.out.println("The letter " + letter + " did not appear");
        }
        else
        {
            System.out.println("The letter " + letter + " appeared: " + count);
        }
    }
}