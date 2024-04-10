

public class Static 
{
    public static void main(String args[])
    {
        Children s1 = new Children();
        s1.schoolName = "BLM";

        Children s2 = new Children();
        System.out.println(s2.schoolName);
    }
}

class Children
{
    String name;
    int roll;
    static String schoolName;

    void setName(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return this.name;
    }
}


