import java.util.*;

public class oddeve
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int a;
        System.out.println("Enter number: ");
        a = S.nextInt();

        if(a%2==0)
        {
            System.out.println("Even");
        }

        else
        {
            System.out.println("Odd");
        }
    }
}