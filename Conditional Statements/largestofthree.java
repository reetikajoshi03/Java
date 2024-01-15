import java.util.*;

public class largestofthree 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter 1st number: ");
        a = S.nextInt();

        System.out.print("Enter 2nd number: ");
        b = S.nextInt();

        System.out.print("Enter 3rd number: ");
        c = S.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.print("a is largest");
            }

            else{
                System.out.print("c is largest");
            }
        }

        else if(b>c)
        {
            System.out.print("b is largest");
        }

        else
        {
            System.out.print("c is largest");
        }


    }
}
