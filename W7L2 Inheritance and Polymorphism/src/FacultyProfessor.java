public class FacultyProfessor extends Employee
{
    FacultyProfessor()
    {
        System.out.println("Faculty Professor");
    }

    public static void main(String[] args)
    {
        FacultyProfessor fp = new FacultyProfessor();

        //prints Person
        //then Employee
        //then Faculty Professor

        //constructor chaining
        //when you call one constructor
        //it calls its parent
        //which calls its parent
    }
}
