import java.util.*;
public class f2 
{
    public static int factorial(int n)
    {
        int fact=1, i;
        for(i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        return fact;

    }

    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = S.nextInt();
        int factorial=factorial(n);
        System.out.println("Factorial is: " +factorial);
    }
    
}
