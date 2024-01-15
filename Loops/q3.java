import java.util.*;
public class q3 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int i, n, fact=1;
        System.out.println("enter no: ");
        n = S.nextInt();
        for(i=1; i<=n; i++)
        {
            fact=i*fact;
        }
        System.out.println("Factorial = "+ fact);
    }
}
