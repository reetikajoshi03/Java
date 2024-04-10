public class Constructor 
{
    public static void main(String[] args) 
    {
        Student s = new Student("Reetika");
        System.out.println(s.name);
    }
}

class Student
{
    String name;
    int rollNo;
    Student(String name)
    {
        this.name = name;
        System.out.println("Constructor is called");
    }

}
