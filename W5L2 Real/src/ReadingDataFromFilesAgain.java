import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadingDataFromFilesAgain {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);    //System.in means input from system

        //Scanner input = new Scanner(new FileReader("data.txt"));

        //you cannot do FileReader without try and catch

        try
        {
            Scanner input = new Scanner(new FileReader("data.txt"));


//            System.out.println(input.nextInt()); //one input

            FileWriter fw = new FileWriter("outputData.txt");
            //use i/o exception

            while(input.hasNext())  //repeat as long as the file has something to read
            {
                //System.out.println(input.nextInt() + "/t");

                fw.write(String.valueOf(input.nextInt()));  //writes to outputData.txt
                                            //int needs to be converted to string
            }

            input.close();
            fw.close();

        } catch (FileNotFoundException e) {
            //System.out.println("File not found");
            System.out.println(e.getMessage());     //written by java developers

            //we get this error when a file is not found

            //we can even write Exception alone instead of FileNotFoundException
            //it will understand on its own because FileNotFoundException is in it

            //java will not allow you to read unless you try and catch
        }catch(IOException e){
            System.out.println(e.getMessage());     //WE CAN EVEN USE EXCEPTION HERE INSTEAD OF IO EXCEPTION
        }
    }
}
