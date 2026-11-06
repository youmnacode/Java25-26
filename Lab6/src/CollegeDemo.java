import java.io.*;
import java.util.*;
public class CollegeDemo
{
    public static void main(String[] args) {
        College [] cArray=new College[10] ;
        int i=0;
        String name;
        int depts;
        int numStds;
        int numF;
        int numOfColleges;
        try {
            Scanner inFile = new Scanner(new FileReader("college.txt"));
            while(inFile.hasNext())
            {
                // read each row
                name = inFile.next();
                depts = inFile.nextInt();
                numStds = inFile.nextInt();
                numF = inFile.nextInt();

                College myCollege = new College(name, depts, numStds, numF);

                cArray[i] = myCollege;

                i++;

                // create an object from the data read

                // add the object to cArray ;

                // hint use i to move to the next location in the array, i.e., i++

            }
            inFile.close();
        }

        catch (FileNotFoundException e)
        {
            System.out.println("Error: File not found");
        }

        numOfColleges=cArray[0].getnumCols();

        System.out.println("Colleges' information ");

        for( i=0; i<numOfColleges; i++)
            System.out.println(cArray[i].toString());

        System.out.printf("The average number of students per college is %7.2f\n" ,findAvg(cArray, numOfColleges));

        System.out.println("The college with the highest number of faculty is "+ getMax(cArray, numOfColleges));
    }
    // returns the average number of students per college
    public static double findAvg(College[] A, int size) {

        double sum = 0;

        for(int i = 0; i < size; i++)
        {
            sum = sum + A[i].getnumStds();
        }

        double average = sum/size;

        return average;
    }
    // returns the name of the college with the highest number of faculty
    public static String getMax(College[] A, int size) {

        int highest = A[0].getnumFaculty();

        size = College.numColleges;

        String biggest = "";

        for(int i = 1; i < size; i++)
        {
            if(A[i].getnumFaculty() > highest)
            {
                highest = A[i].getnumFaculty();
                biggest = A[i].getName();
            }
        }

        return biggest;

    }
}