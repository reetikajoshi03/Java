import java.util.*;
public class f3 
{
    public static int factorial(int a)
    {
        int fact=1, i;
        for(i=1; i<=a; i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static float binomial_coeff(int n, int r)
    {
        float bc;
        bc=factorial(n)/(factorial(r)*factorial(n-r));
        return bc;
    }
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n, r, a;
        float bc;
        System.out.println("Enter n: ");
        n = S.nextInt();
        System.out.println("Enter r: ");
        r = S.nextInt();
        bc=binomial_coeff(n, r);
        System.out.println("The binomial coefficient is: "+ bc);



    }
}
