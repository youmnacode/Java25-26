import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str1;
        String str2;
        String str3 = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first sentence: ");
        str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter the second sentence: ");
        str2 = sc.nextLine().toLowerCase();

        for(int i = 0; i < str1.length(); i++)
        {
            for (int j = 0; j < str2.length(); j++)
            {
                if(str1.charAt(i) == str2.charAt(j))
                {
                    str3 = str3 + str1.charAt(i);
                    break;


                }

            }


        }

        System.out.print("The new string is: " + str3);


        }
    }