package Faculty;

import Students.ClassA;

public class TestFaculty {
    public static void main(String [] args)
    {
        ClassA classA = new ClassA(); //we can create an object of a class in another package but the same project

        classA.print(); //  ONLY THE PUBLIC ONE SHOWS
    }
}
