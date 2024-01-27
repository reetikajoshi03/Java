public class compare 
{
    public static void main(String[] args) 
    {
        String s1="reetika";
        String s2="reetika";
        String s3=new String("reetika");

        if(s1.equals(s2))
        {
            System.out.println("Same");
        }
        else{
            System.out.println("not Same");
        }

        if(s1.equals(s3))
        {
            System.out.println("Same");
        }
        else{
            System.out.println("not Same");
        }
    }
    
}
