public class Person {
    private int id;
    private String name;
    private int age;

    private Birthday birthday;

    public Person(int id, String name, int age, Birthday birthday)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }


    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    //person is immutable because the variables are private
    //but it has a birthday object
    //birthday has a set function
    //person is no longer immutable


    //for loops are put inside methods
    //you get an error if you put them just like that

    //global variables are initialized


    //variables with the same name can be defined with no errors
    //as long as they are both not in the same method
}