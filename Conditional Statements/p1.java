import java.util.*;
public class p1 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter no: ");
        int num = S.nextInt();

        if(num>0)
        {
            System.out.println("Postive");
        }

        else if(num==0)
        {
            System.out.println("Zero");
        }

        else
        {
            System.out.print("Negative");
        }
    }
    
}
