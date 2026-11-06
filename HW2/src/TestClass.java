import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestClass
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        IPAddress [] list = new IPAddress[100];
        int size = 0;       //the number of elements stored

        //while loop to read ip addresses until -1 is entered

        while(true)
        {
            System.out.print("Enter the IP Addresses (enter -1 to stop): ");

            String ip = sc.nextLine();

            if(ip.equals("-1"))
            {
                break;
                //we stop taking more into the string array
            }

            IPAddress newAddress = new IPAddress(ip);
            boolean exists = false;

            //we must only add it if it is not a duplicate
            //check if repeated
            for(int i = 0; i < size; i++)
            {
                if(list[i].equals(newAddress))
                {
                    exists = true;
                    break;
                }
            }

            //add ip if it doesn't already exit and if it is less than the 100th element
            if(!exists && size < 100)
            {
                list[size] = newAddress;
                size++;
            }
        }

        int choice;

        do
        {
            System.out.println("\nChoose one of the given options:");
            System.out.println("Option 1: Search for a particular IP address");
            System.out.println("Option 2: Count how many IP addresses start with a particular value");
            System.out.println("Option 3: Print all IP addresses");
            System.out.println("Option 4: Delete a particular IP address (if it exists)");
            System.out.println("Option 5: Print all addresses to a file (you will have to provide the name of the file)");
            System.out.println("Option 6: Exit");

            choice = sc.nextInt();



            switch(choice)
            {
                case 1:
                    System.out.print("Enter the IP address that you would like to search for: ");

                    String searchIP = sc.nextLine();

                    IPAddress sIP = new IPAddress(searchIP);


                    boolean found = false;

                    for(int i = 0; i < size; i++)
                    {
                        if(list[i].equals(sIP))
                        {
                            found = true;
                            break;
                        }
                    }

                    if(found)
                    {
                        System.out.println("The IP Address was found in the list.");
                    }
                    else
                    {
                        System.out.println("The IP Address was not found in the list.");
                    }

                    break;




                //count how many ips start with a particular value
                case 2:
                    System.out.print("Enter the starting value: ");

                    String start = sc.next();

                    int count = 0;

                    for(int i = 0; i < size; i++)
                    {
                        if(list[i].getPart1().equals(start))
                        {
                            count++;
                        }
                    }

                    System.out.println("The number of objects that start with the given value are: " + count);
                    break;


               //PRINT ALL IP ADDRESSES
                case 3:
                    for(int i = 0; i < size; i++)
                    {
                        list[i].printIPAddress();
                    }
                    break;



                case 4:
                    //delete a particular ip address

                    System.out.print("Enter the IP Address to be deleted: ");

                    String deleteIP = sc.next();

                    IPAddress del = new IPAddress(deleteIP);

                    for(int i = 0; i < size; i++)
                    {
                        if(list[i].equals(del))
                        {
                            list[i] = list[size - 1];
                            size--;
                            System.out.println("The IP Address was deleted");
                            break;
                        }
                    }

                    break;



                case 5:
                    //write IP addresses to a file

                    System.out.print("Enter a file name: ");
                    String fileName = sc.next();

                    try
                    {
                        FileWriter fw = new FileWriter(fileName);

                        for(int i = 0; i < size; i++)
                        {
                            fw.write(list[i].toString() + "\n");
                        }

                        fw.close();

                        System.out.println("The list was written to the file successfully");
                    }
                    catch(IOException e)
                    {
                        System.out.println("Error writing to file");
                    }

                    break;
            }

        } while(choice != 6);

    }
}
