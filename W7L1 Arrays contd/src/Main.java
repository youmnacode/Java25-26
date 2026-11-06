import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //binary search
         int [] a = {3, 23, 33, 44, 50, 65, 77, 80};

         System.out.println(Arrays.binarySearch(a,50));
         //prints 4

        //what if we are searching for a number that does not exist in the list
        System.out.println(Arrays.binarySearch(a,100));
        //returns -9
        //returns the index it should be at in the sorted array
        //adds 1 to it
        //makes it negative because it does not exist
        //100 should have index 8 in the array

        System.out.println(Arrays.binarySearch(a,1));
        //returns -1
        //should be at the index 0
        //adds 1
        //makes it negative

        System.out.println(Arrays.binarySearch(a,25));
        //gives -3 because it should be at index 2


        int [] b = {23, 3, 5, 44, 50, 65, 77, 80};
        //we cannot do binary search because it is not sorted
        //we need to call a method to sort it
        Arrays.sort(b);

        //PRINT THE CONTENTS OF AN ARRAY
        System.out.println(Arrays.toString(b));

        //check if two arrays are equal
        //we cannot do a==b because we will be comparing their locations in the memory


        System.out.println(Arrays.equals(a,b));
        //prints false because they are not equal

        System.out.println(Arrays.compare(a,b));
        //returns -1 when they are not the same
        //returns 0 if they are equal
        //ASK WHY IT RETURNS 1 HERE

        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        for(int value:a)
        {
            System.out.print(value + " ");
            //for each value inside a, print the value
        }
        System.out.println();

        //basically the "new" for loop format





        //DEFINE A 2D ARRAY

        int [][] a2D = new int [3][4];
        //3 rows and 4 columns

        //initialize the content of the array
        //nested for loops

        for(int i = 0; i < a2D.length; i++)
        {
            //a2D.length returns the number of rows
            for(int j = 0; j < a2D[i].length; j++)
            {
                //a2D[0].length returns the length of the first row
                //this works because all rows have the same number of columns in this example

                //though in java, it is possible that in an array with 3 rows, each row can have a diff number of columns
                //in that case, we have to use a2D[i].length

                a2D[i][j] = (int)(Math.random()*10);
            }
        }


        //PRINTING THE CONTENTS OF A 2D ARRAY

        for(int i = 0; i<a2D.length; i++)
        {
            for(int j =  0; j < a2D[i].length; j++)
            {
                System.out.print(a2D[i][j] + " ");
            }
            System.out.println();
        }


        //FIND THE TOTAL SUM OF ALL THE VALUES IN EACH ROW

        for(int i = 0; i < a2D.length; i++)
        {
            int rowSum = 0;

            for(int j = 0; j < a2D[i].length; j++)
            {
                rowSum += a2D[i][j];
            }

            System.out.println("The sum of row " + i + " is " + rowSum);
        }

        //find the max value in each row
        for(int i = 0; i < a2D.length; i++)
        {
            int max = a2D[i][0]; //MAKE THE FIRST VALUE IN THE ARRAY EQUAL TO MAX

            for(int j = 0; j < a2D[i].length; j++)
            {
                if(a2D[i][j] > max)
                {
                    max = a2D[i][j];
                }
            }
            System.out.println("The max number in row " + i + " is " + max);
        }

        //ARRAY LIST
        //STORES ONLY OBJECTS, NOT PRIMITIVE TYPES
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(25);
        aList.add(30);
        aList.add(45);

        System.out.println(aList.contains(25));

        System.out.println(aList.get(0));

        aList.remove(0);

        aList.clear();



        //LINKED LIST

        LinkedList<Integer> aList2 = new LinkedList<>();

        aList2.add(25);
        aList2.add(30);

        //there are also stacks etc
    }
}